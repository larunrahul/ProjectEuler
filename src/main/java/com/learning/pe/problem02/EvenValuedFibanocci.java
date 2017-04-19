package com.learning.pe.problem02;

public class EvenValuedFibanocci {

	/*
	 * Every third number in the Fibanocci Series starting from 2 is even valued
	 */
	public long sum() {
		long prev = 1, sum = 2, prevSum = sum;
		while (prevSum < 4000000) {
			long first = prev + prevSum;
			prev = prevSum + first;
			prevSum = first + prev;
			sum = sum + prevSum;
		}
		return sum - prevSum;
	}

}
