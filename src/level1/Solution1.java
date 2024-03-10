package level1;

public class Solution1 {
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		long[] answer = {};

		answer = new long[n];

		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}

		System.out.print("answer:");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ",");
		}
	}
}
