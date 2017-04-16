package problems;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem_01_Multiples_Of_3_And_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int mixed = lcm(first, second);
		int limit = sc.nextInt() - 1;
		int first_limit = limit / first;
		int second_limit = limit / second;
		int mixed_limit = limit / mixed;
		long finalAns = first * (first_limit * (first_limit + 1) / 2) + second * (second_limit * (second_limit + 1) / 2)
				- mixed * (mixed_limit * (mixed_limit + 1) / 2);
		System.out.println(finalAns);
		sc.close();
	} 

	public static void java_8_way() {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		long answer = IntStream.range(Math.min(first, second), sc.nextInt())
				.filter(val -> (val % first == 0 || val % second == 0)).sum();
		System.out.println(answer);
		sc.close();
	}

	public static int lcm(int first, int second) {
		return (Math.abs(first) / gcd(first, second)) * Math.abs(second);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
