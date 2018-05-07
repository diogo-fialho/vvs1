package sut.quickcheck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import sut.TST;

@RunWith(JUnitQuickcheck.class)
public class TestTSTQuickCheck { 

	@Property(trials=20)
	public void testOrderOfInsertion(@InRange(minInt = 5, maxInt = 25) @From(TSTGenerator.class) TST<Integer> tst) {

		TST<Integer> other = new TST<Integer>();		
		
		List<String> list = (List<String>) tst.keys();
		//System.out.println("before: " + list + "\n");
		Collections.shuffle(list);
		//System.out.println("after " + list);
		
		for(String key : list) {
			other.put(key, tst.get(key));
		}
	
		assertEquals(other,tst);
		
	}
	
	@Property(trials=20)
	public void testFullDeletion(@InRange(minInt = 2, maxInt = 30) @From(TSTGenerator.class) TST<Integer> tst) {

		for(String key : tst.keys())
			tst.delete(key);
			
		TST<Integer> empty = new TST<Integer>();
		assertEquals(0,tst.size());
		assertEquals(empty,tst);
	}
	
	/*
	 * Selecting a stricter prefix keysWithPrefix returns a strict subset result.Eg, keysWithPrefix("sub") contains keysWithPrefix("su")
	 */
	@Property(trials=20)
	public void testInsertDelete(@InRange(minInt = 2, maxInt = 30) @From(TSTGenerator.class) TST<Integer> tst,@InRange(minInt = 2, maxInt = 30) @From(MyCharacterGenerator.class) String key) {
		
		Random rand = new Random();
		int val = tst.size() + rand.nextInt(2*tst.size());
		
		TST<Integer> clone = new TST<Integer>();
		for(String k : tst.keys())
			clone.put(k, tst.get(k));
		
		assertEquals(clone,tst);
		
		clone.put(key, val);
		clone.delete(key);
		
		assertEquals(tst,clone);
	
	}
	
	@Property(trials=2)
	public void testContains(@InRange(minInt = 2, maxInt = 50) @From(MyCharacterGenerator.class) String key) {
		
		TST<Integer> tst = new TST<Integer>();
		
		int i = key.length();
		while(i>0) {
			tst.put(key.substring(0, i), i);
			i--;
		}
		
		//rand.nextInt((max - min) + 1) + min;
		//System.out.println((List<String>) tst.keys());
		Random randy = new Random();
		int index = randy.nextInt((key.length()-2)+1)+2; //first set must have at least 2 chars so tht subkey>=1
		
		LinkedList<String> set = (LinkedList<String>) tst.keysWithPrefix(key.substring(0,index-1));
		//System.out.println(set);
		
		LinkedList<String> subset = (LinkedList<String>) tst.keysWithPrefix(key.substring(0,index));
		//System.out.println(subset);
		
		boolean result = true;
		for(String k : subset) {
			result &= set.contains(k);
		}
		assertTrue(result);
	}
	
	
	
}
