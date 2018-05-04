package sut;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

//further tested in contains
public class TestTSTPutMethod {
	
	@Test
	public void testAddNullKey() {
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {
			st.put(null, 2);
		});
	}
	
	@Test
	public void testRepeatedKey(){
		
		TST<Integer> st = new TST<Integer>();
		String key = "pao";
		st.put(key, 1);
		st.put(key, 2);
		
	}
	
}
