package com.learning.pe.problem02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenValuedFibanocciTest {
	
	private EvenValuedFibanocci evenValuedFibanocci = new EvenValuedFibanocci();

	@Test
	public void sum() {
		assertEquals(4613732, evenValuedFibanocci.sum());
	}

}
