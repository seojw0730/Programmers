package level1;

public class 자연수뒤집어배열로만들기 {
	class Solution {
		public int[] solution(long n) {
			int[] answer = {};
			String nstr = String.valueOf(n).toString();
			answer = new int[nstr.length()];
			for (int i = 0; i < answer.length; i++) {
				answer[answer.length - 1 - i] = Integer.parseInt(String.valueOf(nstr.charAt(i)));
			}
			return answer;
		}
	}
}
