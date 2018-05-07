package sut.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sut.TST;

public class PrimePathCoverage {
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
	public void test4() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,8,9,10,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("d", 1);
		st.put("dv", 2);
		assertEquals("d", st.longestPrefixOf("du"));
	}
	@Test
	public void test5() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,8,9,11,13,14,15,16,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("d", 1);
		st.put("dv", 2);
		assertEquals("dv", st.longestPrefixOf("dv"));
	}
	@Test
	public void test6() {
		// [1,3,5,6,8,9,10,6,8,9,11,12,6,8,9,10,6,8,9,10,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("pao", 1);
		st.put("dv", 2);
		st.put("nre", 3);
		st.put("muei", 4);
		assertEquals("", st.longestPrefixOf("lved"));
	}
	@Test
	public void test7() {
		// [1,3,5,6,8,9,11,12,6,8,9,11,13,14,16,6,8,9,11,13,14,16,6,8,9,10,6,8,9,11,13,14,16,6,8,9,11,13,14,16,6,8,9,11,13,14,16,6,8,9,11,12,6,8,9,11,12,6,8,9,11,12,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("lao", 1);
		st.put("oao", 2);
		st.put("sousa", 3);
		st.put("oamlplb", 4);
		st.put("oamlpm", 5);
		st.put("oamlpn", 6);
		assertEquals("", st.longestPrefixOf("oamlppa"));
	}
	@Test
	public void test8() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,7]
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("d", 1);
		assertEquals("d", st.longestPrefixOf("d"));
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
	public void test10() {
		// [1,3,5,6,8,9,11,13,14,15,16,6,8,9,11,12,6,7]
		TST<Integer> st = new TST<>();
		st.put("d", 1);
		st.put("dgogo", 2);
		assertEquals("d", st.longestPrefixOf("dio"));
	}
	@Test
	public void test11() {
		// [1,3,5,6,8,9,11,12,6,8,9,11,13,14,15,16,6,7]
		TST<Integer> st = new TST<>();
		st.put("a", 1);
		st.put("d", 2);
		assertEquals("d", st.longestPrefixOf("dio"));
	}
}
