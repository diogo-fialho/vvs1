package sut.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;





import org.junit.jupiter.api.Test;

import sut.TST;

public class TestTSTSizeMethod {

	@Test
	public void testEmpty() {
		TST<Integer> st = new TST<>();
		assertEquals(0, st.size());
	}
}
