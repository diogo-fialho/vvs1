package sut;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestTSTPutMethod {

	
	@Test
	public void testAddElement() {
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {
			st.put(null, 2);
		});
	}
}
