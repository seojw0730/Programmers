package level2;

import java.util.ArrayList;
import java.util.List;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "baabaa";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        int answer = 0;

        List<Character> list = new ArrayList<Character>();

        for(int i = 0; i < s.length(); i++) {
        	list.add(s.charAt(i));
        }
        
        int count = 0;
        
        while(true) {
        	count = 0;
        	for(int i = 0; i < list.size() - 1; i++) {
        		if(list.get(i) == list.get(i+1)) {
        			list.remove(i);
        			list.remove(i);
        			count++;
        			break;
        		}
        	}
        	if(count == 0) break;
        }
        
        if(list.size() == 0) answer = 1;
        
        return answer;
    }
}
