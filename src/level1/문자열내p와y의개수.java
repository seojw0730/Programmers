package level1;

public class 문자열내p와y의개수 {
	class Solution {
		boolean solution(String s) {
			boolean answer = true;
			int countP = 0;
			int countY = 0;
			char[] schar = new char[s.length()];
			for (int i = 0; i < schar.length; i++) {
				schar[i] = s.charAt(i);
			}
			for (char c : schar) {
				if ((c == 'p') || (c == 'P')) {
					countP++;
				} else if ((c == 'y') || (c == 'Y')) {
					countY++;
				}
			}
			if (countP == countY) {
				answer = true;
			} else {
				answer = false;
			}
			return answer;
		}
	}
}
