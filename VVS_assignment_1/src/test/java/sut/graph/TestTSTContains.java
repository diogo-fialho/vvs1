package sut.graph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sut.TST;

import java.io.File;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestTSTContains {
	
	@Test
	public void testNullArg() {
		String s = null;
		TST<Integer> st = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {st.contains(s);});
	}

}
