package sut.dataflow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sut.TST;

public class TestTSTPrivatePut {

	
	@Test
	public void testAllCouplingUseCoverage() {
		TST<Integer> st = new TST<>();
		st.put("sandes", 1);
		System.out.println(" ");
		st.put("frango", 2);
		System.out.println(" ");
		st.put("lapis", 3);
		assertEquals(3, st.size());
	}

}
