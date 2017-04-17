package problems;

public class Problem_02_Even_Valued_Fibanocci {

	public static void main(String[] args) {
		/*
		 * Even valued Fibanocci numbers are nothing but every third number in the Fibanocci Series starting from 2
		 */
		long prev = 1, sum = 2, prevSum = sum;
		while(prevSum < 4000000) {
			long first = prev + prevSum;
			prev = prevSum + first;
			prevSum = first + prev;
			sum = sum + prevSum;
		}
		System.out.println(sum - prevSum);
	}

}
