package level2;

public class 최댓값과최솟값 {
	class Solution {
		public String solution(String s) {
			String answer = "";
			String[] arrAns = s.split(" ");

			// 정수 배열 선언
			int[] arrInt = new int[arrAns.length];

			// 정수 배열에 값 대입
			for (int i = 0; i < arrInt.length; i++) {
				arrInt[i] = Integer.parseInt(arrAns[i]);
			}

			// 오름차순 정렬
			for (int i = 0; i < arrInt.length - 1; i++) {
				for (int j = 0; j < arrInt.length - 1 - i; j++) {
					if (arrInt[j] > arrInt[j + 1]) {
						int temp = arrInt[j];
						arrInt[j] = arrInt[j + 1];
						arrInt[j + 1] = temp;
					}
				}
			}

			// 최댓값 최솟값 문자열 변환
			String min = String.valueOf(arrInt[0]);
			String max = String.valueOf(arrInt[arrInt.length - 1]);
			answer = min + " " + max;
			return answer;
		}
	}

	public static void main(String[] args) {
		String answer = "";
		String s = "3 4 1 5 2";
		String[] arrAns = s.split(" ");

		// 정수 배열 선언
		int[] arrInt = new int[arrAns.length];

		// 정수 배열에 값 대입
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(arrAns[i]);
		}

		// 오름차순 정렬
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = 0; j < arrInt.length - 1 - i; j++) {
				if (arrInt[j] > arrInt[j + 1]) {
					int temp = arrInt[j];
					arrInt[j] = arrInt[j + 1];
					arrInt[j + 1] = temp;
				}
			}
		}

		// 최댓값 최솟값 문자열 변환
		String min = String.valueOf(arrInt[0]);
		String max = String.valueOf(arrInt[arrInt.length - 1]);
		answer = min + " " + max;

		System.out.println("answer:" + answer);
	}
}
