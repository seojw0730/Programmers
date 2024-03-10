package level1;

public class Solution2 {
	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = { 1, 2, 3, 1, 2, 3, 1 };

		int answer = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length - 1; j++) {
				if (score[j] < score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < score.length / m; i++) {
			answer += score[(i + 1) * m - 1] * m;
		}

		System.out.println("answer:" + answer);
	}
}
