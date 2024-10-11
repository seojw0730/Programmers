package level2;

import java.util.*;

public class 연속부분수열합의개수 {
	public static void main(String[] args) {
		int[] elements = {7, 9, 1, 1, 4};
		System.out.println(solution(elements));
	}
	
	static int solution(int[] elements) {
		int answer = 0;
		
		int[] elements2 = new int[elements.length * 2];
		for(int i = 0; i < elements2.length; i++) {
			elements2[i] = elements[i % elements.length];
		}
		
		Set<Integer> set = new LinkedHashSet<>();
		
		int step = 1;
		int temp = 0;
		while(step <= elements.length) {
			for(int i = 0; i < elements.length; i++) {
				temp = 0;
				for(int j = i; j < i + step; j++) {
					temp += elements2[j];
				}
				set.add(temp);
			}
			step++;
		}
		
		answer = set.size();
		
		return answer;
	}
}
