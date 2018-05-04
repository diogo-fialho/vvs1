package sut;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	
	@Test
	public void testRepeatedKey(){
		
		String key = "prefix";
		st.put(key, 3); //val diferente?
		
	}
	
	@Test
	public void testRepeatedPrefix(){
		
		String key = "pre";
		st.put(key, 4);
		
	}
	
	@Test
	public void testLargestKey(){
		
		String key = "loooooooooooooooooooooongkey";
		st.put(key, 5);
		
		
	}
	
	@Test
	public void testAvgtKey(){
		
		String key = "avgkey";
		st.put(key, 6);
		
		
	}
	
	@Test
	public void testSmallest(){
		
		String key = "z";
		st.put(key, 7);
		
	}
	
}
