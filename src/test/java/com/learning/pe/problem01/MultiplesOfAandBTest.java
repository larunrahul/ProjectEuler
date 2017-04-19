package com.learning.pe.problem01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplesOfAandBTest {
	
	private MultiplesOfAandB multiplesOfAandB = new MultiplesOfAandB();

	@Test
	public void sum() {
		assertEquals(233168, multiplesOfAandB.sum(3, 5, 1000));
		assertEquals(233168, multiplesOfAandB.sumWithStreams(3, 5, 1000));
	}

}
