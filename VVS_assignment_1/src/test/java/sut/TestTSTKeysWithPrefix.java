package sut;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestTSTKeysWithPrefix {

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
	public void testNullArgument() {
		String s = null;
		assertThrows(IllegalArgumentException.class, () -> {st.keysWithPrefix(s);});
	}
	
	@Test
	public void testMissingPrefix() {
		String s = "zzz";
		assertEquals(new LinkedList<>(), st.keysWithPrefix(s));
	}
	
	@Test
	public void testEmptyKey() {
		String s = "";
		assertThrows(IllegalArgumentException.class, () -> {st.keysWithPrefix(s);});
	}
	
	@Test
	public void testNond() {
		
		TST<Integer> st = new TST<>();
		st.put("dhh",null);
		assertEquals(new LinkedList<>(), st.keysWithPrefix("dhh"));
		
	}
	
	@Test
	public void testRepeatedPrefix() {
		String s = "she";
		LinkedList<String> list = new LinkedList<String>();
		list.add("she");
		list.add("shells");
		assertEquals(list, st.keysWithPrefix(s));
	}
	
}
