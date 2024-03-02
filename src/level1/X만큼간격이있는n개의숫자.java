package level1;

import java.util.Scanner;

public class X만큼간격이있는n개의숫자 {
	class Solution {
		public long[] solution(int x, int n) {
			long[] answer = new long[n];
			for (long l = 0; l < n; l++) {
				answer[(int) l] = (long) x * ((long) l + 1);
			}
			return answer;
		}
	}
}
