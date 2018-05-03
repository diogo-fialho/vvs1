package sut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestTSTKeysThatMatch {
	
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
	public void testNoMatch() {
		String s = "zzz";
		assertEquals(new LinkedList<>(), st.keysThatMatch(s));
	}
	
	@Test
	public void testRepeatedPrefix() {
		String s = "she...";
		Queue<String> list = new LinkedList<String>();
		list.add("shells");
		assertEquals(list, st.keysThatMatch(s));
	}
	

}
