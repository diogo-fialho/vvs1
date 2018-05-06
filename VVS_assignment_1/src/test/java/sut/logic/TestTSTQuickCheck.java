package sut.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sut.TST;

public class TestTSTQuickCheck { //TODO remover o teste sem jeito

	
	
	@Test
	public void testRepeatedKey(){
		
		TST<Integer> esta = new TST<Integer>();
		TST<Integer> outra = new TST<Integer>();

		esta.put("ola", 1);
		outra.put("adeus",2);
		
		esta.put("adeus", 2);
		outra.put("ola", 1);
		
		esta.put("bro", 3);
		outra.put("hmmm", 4);
		
		esta.put("hmmm", 4);
		outra.put("bro", 3);
		
		
		assertEquals(true,esta.equals(outra));
		
	}
	
	@Test
	public void testDelete(){
		
		TST<Integer> esta = new TST<Integer>();
		
		esta.put("ola", 1);
		esta.put("adeus", 2);
		
		esta.delete("ola", 1);
		System.out.println(esta.get("ola"));
		System.out.println(esta.size());
		esta.put("ola", 1);
		System.out.println(esta.get("ola"));
		System.out.println(esta.size());
		
		
		//assertEquals(true,esta.equals(outra));
		
	}
	
}
