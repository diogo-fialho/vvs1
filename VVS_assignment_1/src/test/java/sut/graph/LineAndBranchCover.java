package sut.graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import sut.TST;

public class LineAndBranchCover {

	/*
	 * Contains coverage
	 */
	@Test
	public void testNullArgContains() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.contains(s);});
	}
	@Test
	public void testNotNullContains() {
		String s = "s";
		TST<Integer> st = new TST<>();
		assertFalse(st.contains(s));
	}
	@Test
	public void testNotNullContains2() {
		String s = "s";
		TST<Integer> st = new TST<>();
		st.put(s, 1);
		assertTrue(st.contains(s));
	}
	/*
	 * Get coverage
	 */
	@Test
	public void testNullArgGet() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.get(s);});
	}
	@Test
	public void testEmptyGet() {
		String s = "";
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {
			st.get(s);
		});
	}
	
	@Test
	public void testKeyNotFoundGet() {
		TST<Integer> st = new TST<>();
		st.put("mamd", 1);
		assertEquals(null, st.get("jorge"));
	}
	/*
	 * Put coverage
	 */
	@Test
	public void testNullArgPut() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.put(s, 1);});
	}

	/*
	 * Keys coverage
	 */
	@Test
	public void testKeys() {
		TST<Integer> tst = new TST<>();
		tst.put("oi", 1);
		tst.put("ok", 2);
		assertEquals("[oi, ok]", tst.keys().toString());
		
	}
	/*
	 * longest prefix coverage
	 */
	@Test
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
	/*
	 * Keys that match coverage
	 */
	@Test
	public void testNullArgKeysTM() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertEquals(new LinkedList<>(), st.keysThatMatch(s));
	}
	@Test
	public void testKeysNoMatch() {
		String s = "zzz";
		TST<Integer> st = new TST<>();
		st.put("manel", 1);
		assertEquals(new LinkedList<>(), st.keysThatMatch(s));
	}
	
	@Test
	public void testRepeatedPrefixKeysTM() {
		String s = "she...";
		Queue<String> list = new LinkedList<String>();
		list.add("shells");
		TST<Integer> st = new TST<>();
		st.put("burger", 1);
		st.put("shells", 2);
		
		assertEquals(list, st.keysThatMatch(s));
	}
	/*
	 * Keys with prefix coverage
	 */
	@Test
	public void testNullArgKeysWP() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.keysWithPrefix(s);});
	}
	@Test
	public void testMissingPrefix() {
		String s = "zzz";
		TST<Integer> st = new TST<>();
		st.put("pizza", 1);
		assertEquals(new LinkedList<>(), st.keysWithPrefix(s));
	}
	
	@Test
	public void testEmptyKey() {
		String s = "";
		TST<Integer> st = new TST<>();
		st.put("pizza", 1);
		assertThrows(IllegalArgumentException.class, () -> {st.keysWithPrefix(s);});
	}
	
	@Test
	public void testValNull() {
		
		TST<Integer> st = new TST<>();
		st.put("dhh",null);
		assertEquals(new LinkedList<>(), st.keysWithPrefix("dhh"));
		
	}
	
	@Test
	public void testRepeatedPrefixKeysWP() {
		TST<Integer> st = new TST<>();
		st.put("shells", 1);
		st.put("the", 2);
		st.put("she", 3);
		st.put("couvs", 4);
		String s = "she";
		LinkedList<String> list = new LinkedList<String>();
		list.add("she");
		list.add("shells");
		assertEquals(list, st.keysWithPrefix(s));
	}
	/*
	 * Size Coverage
	 */
	@Test
	public void testEmptySize() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertEquals(0, st.size());
	}
}
