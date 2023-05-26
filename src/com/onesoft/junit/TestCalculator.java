package com.onesoft.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class TestCalculator {
	Calcualtor c= new Calcualtor();
	
	@Before
	public void showthis() {
		System.out.println("welcome");
	}
	@Test
	public void testub() {
		c.sub(10, 5);
				}
	@Test
	 public void testadd() {
		c.add(10, 20);
	}
	@Test
	 public void testmul() {
		c.mul(10, 5);
	}
	@Test
	public void testdiv() {
		c.div(10, 5);
	}
	@After
	public void showthat() {
		System.out.println("thanks u");
	}

}
