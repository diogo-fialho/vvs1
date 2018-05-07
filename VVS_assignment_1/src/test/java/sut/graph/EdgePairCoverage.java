package sut.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sut.TST;

public class EdgePairCoverage {
	@Test
	// [1,2]
	public void testNullArgLongestPrefix() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.longestPrefixOf(s);});
	}
	@Test
	public void testEmptyLongestPrefix() {
		// [1, 3, 4]
		String s = "";
		TST<Integer> st = new TST<>();
		assertEquals(null, st.longestPrefixOf(s));
	}
	@Test
	public void testRootNullLongestPrefix() {
		 // [1,3,5,6,7]
		TST<Integer> temp = new TST<>();
		assertEquals("", temp.longestPrefixOf("pao"));
	}
	@Test
	public void test1() {
		// [1,3,5,6,8,9,11,13,14,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("shells", 1);
		st.put("she", 2);
		assertEquals("", st.longestPrefixOf("s"));
	}
	@Test
	public void test2() {
		// [1,3,5,6,8,9,10,6,8,9,11,12,6,7]
		TST<Integer> st = new TST<>();
		st.put("shells", 1);
		st.put("she", 2);
		assertEquals("", st.longestPrefixOf("he"));
	}
	@Test
	public void test3() {
		// [1,3,5,6,8,9,11,12,6,8,9,10,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("diogo", 1);
		st.put("jorge", 2);
		assertEquals("", st.longestPrefixOf("gu"));
	}
	@Test
	public void test4() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,8,9,10,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("d", 1);
		st.put("dv", 2);
		assertEquals("d", st.longestPrefixOf("du"));
	}
}
