package sut.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sut.TST;

//further tested in contains
public class TestTSTPutMethod {
	
	TST<Integer> st;
	
	@BeforeEach
	public void setup() {
		st = new TST<Integer>();
		st.put("prefix", 1);
		st.put("teste", 2);
	}
	
	@Test
	public void testAddNullKey() {
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {
			st.put(null, 2);
		});
	}
	
	
	//BC (PE,+1,avg)  ou (!BE,+1,avg) que muda td.....
	
//	(PE,+1,avg) BASE CHOICE
	@Test
	public void testRepeatedKey(){
		
		String key = "prefix";
		st.put(key, 3); //val diferente?
		assertEquals(new Integer(3),st.get(key));
		
	}
	
	
	
	//(PE,+1,S)
	@Test
	public void testRepeatedPrefix(){
		
		String key = "pre";
		st.put(key, 4);
		assertEquals(new Integer(4),st.get(key));
		
	}
	
	//(!PE,+1,avg)
	@Test
	public void testNewKey() {
		
		String key = "shells";
		st.put(key, 5);
		assertEquals(new Integer(5),st.get(key));
		
	}
	
	//(PE,+1,L)
	@Test
	public void testLargestKey(){
		
		String key = "loooooooooooooooooooooongkey";
		st.put(key, 5);
		assertEquals(new Integer(5),st.get(key));
		
		
	}
	
	//(PE,0,avg)
	@Test
	public void testEmptyTrie(){
		
		String key = "loooooooooooooooooooooongkey";
		st.put(key, 5);
		assertEquals(new Integer(5),st.get(key));
		
	}
	
	

	
}
