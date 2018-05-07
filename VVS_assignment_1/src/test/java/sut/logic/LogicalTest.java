package sut.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sut.TST;

public class LogicalTest {

	//GACC por para cada predicado faz-se o teste de true e falso
	/*
	 * p1: query == null 
	 * 
	 */
	@Test
	public void testPredicate1() {
		TST<Integer> tst = new TST<>();
		assertThrows(IllegalArgumentException.class, () -> {tst.longestPrefixOf(null);}); // query == null
		assertEquals("", tst.longestPrefixOf("joge")); // query != null
	}
	
	
	/*
	 * p2: query.lenght ==  0
	 */
	@Test
	public void testPredicate2() {
		TST<Integer> tst = new TST<>();
		assertEquals(null, tst.longestPrefixOf("")); // query.lenght == 0
		assertEquals("", tst.longestPrefixOf("joge")); // query.lenght != 0
	}
	
	/*
	 * p3: x != null && i < query.lenght
	 */
	@Test
	public void testPredicate3() {
		TST<Integer> tst = new TST<>();
		tst.put("jor", 1);
		assertEquals("jor", tst.longestPrefixOf("jorge")); // p3 == true
		// não é possivel testar versão que nao entra no while
	}
	
	/*
	 * p4: c < x.c
	 * p5: c > x.c
	 */
	@Test
	public void testPredicate4And5() {
		TST<Integer> tst = new TST<>();
		tst.put("lm", 1);
		tst.put("fm", 2);
		tst.put("jor", 2);
		assertEquals("jor", tst.longestPrefixOf("jorge"));
	}
}
