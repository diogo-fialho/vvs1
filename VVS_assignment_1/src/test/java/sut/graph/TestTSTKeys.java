package sut.graph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import sut.TST;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestTSTKeys {

	static TST<Integer> st;

	@Test
	public void testKeys() {
		TST<Integer> tst = new TST<>();
		tst.put("oi", 1);
		tst.put("ok", 2);
		assertEquals("[oi, ok]", tst.keys().toString());
		
	}
	
}
