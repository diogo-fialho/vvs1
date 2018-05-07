package sut.dataflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sut.TST;

public class AllDuPathCoverage {
	/*
	 * query 
	 */
	 
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
	public void test12() {
		// [1,3,5,6,8,9,10,6,7]
		TST<Integer> st = new TST<>();
		st.put("u", 1);
		assertEquals("", st.longestPrefixOf("t"));
	} 
	/*
	 * length
	 */
	@Test
	public void test8() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("d", 1);
		assertEquals("d", st.longestPrefixOf("d"));
	}
	/*
	 * x
	 */
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
	public void test9() {
		// [1,3,5,6,8,9,10,6,8,9,11,13,14,15,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("diogo", 1);
		st.put("c", 2);
		assertEquals("c", st.longestPrefixOf("couves"));
	}
	@Test
	public void test11() {
		// [1,3,5,6,8,9,11,12,6,8,9,11,13,14,15,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("a", 1);
		st.put("d", 2);
		assertEquals("d", st.longestPrefixOf("dio"));
	}
	@Test
	public void test13() {
		// [1,3,5,6,8,9,11,12,6,7]
		TST<Integer> st = new TST<>();
		st.put("a", 1);
		assertEquals("", st.longestPrefixOf("t"));
	}
	@Test
	public void test14() {
		// [1,3,5,6,8,9,10,6,8,9,10,6,7]
		TST<Integer> st = new TST<>();
		st.put("v", 1);
		st.put("u", 2);
		assertEquals("", st.longestPrefixOf("t"));
	}
	@Test
	public void test15() {
		// [1,3,5,6,8,9,10,6,8,9,11,13,14,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("v", 1);
		st.put("tu", 2);
		assertEquals("", st.longestPrefixOf("t"));
	}
	@Test
	public void test16() {
		// [1,3,5,6,8,9,11,12,6,8,9,11,12,6,7]
		TST<Integer> st = new TST<>();
		st.put("e", 1);
		st.put("r", 2);
		assertEquals("", st.longestPrefixOf("t"));
	}
	@Test
	public void test17() {
		// [1,3,5,6,8,9,11,12,6,8,9,11,13,14,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("e", 1);
		st.put("tu", 2);
		assertEquals("", st.longestPrefixOf("t"));
	} 
	@Test
	public void test18() {
		// [1,3,5,6,8,9,11,13,14,16,6,8,9,10,6,7]
		TST<Integer> st = new TST<>();
		st.put("te", 1);
		assertEquals("", st.longestPrefixOf("td"));
	}
	@Test
	public void test19() {
		// [1,3,5,6,8,9,11,13,14,16,6,8,9,11,12,6,7]
		TST<Integer> st = new TST<>();
		st.put("te", 1);
		assertEquals("", st.longestPrefixOf("tf"));
	} 
	@Test
	public void test20() {
		// [1,3,5,6,8,9,11,13,14,16,6,8,9,11,13,14,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("tff", 1);
		assertEquals("", st.longestPrefixOf("tf"));
	} 
	@Test
	public void test21() {
		// [1,3,5,6,8,9,11,13,14,16,6,8,9,11,13,14,15,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("tf", 1);
		assertEquals("tf", st.longestPrefixOf("tf"));
	}
	
	/*
	 * i
	 */
	@Test
	public void test22() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,8,9,11,13,14,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("t", 1);
		st.put("ttt", 1);
		assertEquals("t", st.longestPrefixOf("tt"));
	}
}
