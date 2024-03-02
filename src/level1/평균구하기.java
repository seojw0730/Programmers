package level1;

public class 평균구하기 {
	class Solution {
		public double solution(int[] arr) {
			double answer = 0;
			double sum = 0;
			int count = 0;
			for (int i : arr) {
				sum += i;
				count++;
			}
			answer = sum / count;
			return answer;
		}
	}
}
