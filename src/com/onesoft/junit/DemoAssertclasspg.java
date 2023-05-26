package com.onesoft.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

public class DemoAssertclasspg {
	@Test
	public void testAssertEquals() {
         assertEquals("Nisha", "Nisha");
	}
	@Test
	public void testAssertNull() {
		assertNull("nisha", null);
	}
	@Test
	public void testAssertSame() {
		assertSame(5, 5);
	}
	@Test
	public void testAssertTrue() {
		boolean a=10>3;
		assertTrue(a);
	}
	@Test
	public void testAssertArrayEquals() {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		assertArrayEquals(a, b);
	}
	@Test
	public void testAssertNotEquals() {
		assertNotEquals("Bala", "Viki");
	}
	@Test
	public void testAssertNotSame() {
		assertNotSame("bala", null);
	}
	@Test
	public void testAssertNotNull() {
		assertNotNull("String", "String");
	}
	@Test
	public void testAssertFalse() {
		boolean c=15<5;
		assertFalse(c);
	}

}
