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
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.longestPrefixOf(s);});
	}
	@Test
	public void testEmpty() {
		String s = "";
		TST<Integer> st = new TST<>();
		assertEquals(null, st.longestPrefixOf(s));
	}
	
	@Test
	public void testNonExists() {
		assertEquals("", st.longestPrefixOf("jorgge"));
	}
	@Test
	public void testNond() {
		//TODO falta versao em que x fica == null
	}
	
	@Test
	public void testExists() {
		assertEquals("shells", st.longestPrefixOf("shellsore"));
	}
	
}
