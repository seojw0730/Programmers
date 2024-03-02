package level1;

public class 자릿수더하기 {
	class Solution {
		public int solution(int n) {
			int answer = 0;
			String nstr = String.valueOf(n).toString();
			int[] arr = new int[nstr.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(String.valueOf(nstr.charAt(i)).toString());
				answer += arr[i];
				System.out.println(arr[i]);
			}
			return answer;
		}
	}
}
