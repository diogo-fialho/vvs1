package sut.quickcheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import sut.TST;

@RunWith(JUnitQuickcheck.class)
public class TestTSTQuickCheck { 

	@Property(trials=15)
	public void testOrderOfInsertion(@InRange(minInt = 5, maxInt = 25) @From(TSTGenerator.class) TST<Integer> tst) {
		System.out.println(tst);
	}
	
	@Property(trials=15)
	public void testFullDeletion(@InRange(minInt = 5, maxInt = 25) @From(TSTGenerator.class) TST<Integer> tst) {

		for(String key : tst.keys())
			tst.delete(key);
	
		TST<Integer> empty = new TST<Integer>();
		assertEquals(0,tst.size());
		assertEquals(empty,tst);
	}
	
}
