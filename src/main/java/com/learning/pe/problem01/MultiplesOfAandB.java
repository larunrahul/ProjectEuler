package com.learning.pe.problem01;

import java.util.stream.IntStream;

public class MultiplesOfAandB {

	public long sum(int a, int b, int limit) {
		int mixed = lcm(a, b);
		limit = limit - 1;
		int first_limit = limit / a;
		int second_limit = limit / b;
		int mixed_limit = limit / mixed;
		long finalAns = a * (first_limit * (first_limit + 1) / 2) + b * (second_limit * (second_limit + 1) / 2)
				- mixed * (mixed_limit * (mixed_limit + 1) / 2);
		return finalAns;
	}

	public long sumWithStreams(int a, int b, int limit) {
		return IntStream.range(Math.min(a, b), limit).filter(val -> (val % a == 0 || val % b == 0)).sum();
	}

	private int lcm(int first, int second) {
		return (Math.abs(first) / gcd(first, second)) * Math.abs(second);
	}

	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
