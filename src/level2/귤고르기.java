package level2;

import java.util.*;

public class 귤고르기 {
	public static void main(String[] args) {
		int k = 4;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		System.out.println(solution(k, tangerine));
	}
	
	static int solution(int k, int[] tangerine) {
		int answer = 0;
		int[] count = new int[10000000];
		for(int i = 0; i < tangerine.length; i++) {
			count[tangerine[i] - 1]++;
		}
		
		Arrays.sort(count);
		
		for(int i = count.length - 1; i >= 0; i--) {
			if(k <= 0) {
				break;
			}
			k -= count[i];
			answer++;
		}
		
		return answer;
	}
}