package sut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.Test;

public class TestTSTSizeMethod {

	@Test
	public void testEmpty() {
		TST<Integer> st = new TST<>();
		assertEquals(0, st.size());
	}
}
