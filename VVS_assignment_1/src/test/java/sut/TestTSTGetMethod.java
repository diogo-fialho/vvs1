package sut;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestTSTGetMethod {
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
		assertThrows(IllegalArgumentException.class, () -> {
			st.get(s);
		});
	}
	@Test
	public void testEmpty() {
		String s = "";
		assertThrows(IllegalArgumentException.class, () -> {
			st.get(s);
		});
	}
	
	@Test
	public void testKeyNotFound() {
		assertEquals(null, st.get("jorge"));
	}
}
