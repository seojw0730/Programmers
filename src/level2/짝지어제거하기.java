package level2;

import java.util.*;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "cdcd";
		System.out.println(solution(s));
	}
	
	static int solution(String s) {
		int answer = -1;
		
		char[] arr = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		
		int count = 0;
		while(true) {
			count = 0;
			
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] == 'A') {
					break;
				}
				
				if(arr[i] == arr[i+1]) {
					arr[i] = 'A';
					arr[i+1] = 'A';
					count++;
				}
			}
			
			if(count == 0) {
				break;
			}
			
			Arrays.sort(arr);
		}
		
		if(arr[0] == 'A') {
			answer = 1;
		}else {
			answer = 0;
		}
		
		return answer;
    }
}
