package sut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestTSTLongestPrefixOf {
	static TST<Integer> st;
	
	@BeforeAll
	public static void setup() {
		try {
			Scanner sc = new Scanner(new File("data/someWords.txt"));
			st = new TST<>();
			int i=0;
			while(sc.hasNextLine()) {
				String[] keys = sc.nextLine().split(" ");
				for(String key : keys)
					st.put(key, ++i);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testNullArg() {
		// [1, 2]
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.longestPrefixOf(s);});
	}
	@Test
	public void testEmpty() {
		// [1, 3, 4]
		String s = "";
		TST<Integer> st = new TST<>();
		assertEquals(null, st.longestPrefixOf(s));
	}
	@Test
	public void testRootNull() {
		 // [1,3,5,6,7]
		TST<Integer> temp = new TST<>();
		assertEquals("", temp.longestPrefixOf("pao"));
	}
	@Test
	public void test1() {
		// [1,3,5,6,8,9,11,13,14,16,6,7]
		assertEquals("", st.longestPrefixOf("s"));
	}
	@Test
	public void test2() {
		// [1,3,5,6,8,9,10,6,8,9,11,12,6,7]
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
	
}
