package level2;

import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "(((((((()()))()";
		System.out.println(solution(s));	
	}

	static boolean solution(String s) {
		boolean answer = true;

		Stack<String> stacka = new Stack<String>();
		for(int i = 0; i < s.length(); i++) {
			stacka.push(s.substring(i, i+1));
		}
		
		if(stacka.get(stacka.size()-1).equals("(")) return false;
		
		int end = 0;
		boolean no = false;
		String temp;
		while(stacka.size() > 0) {
			temp = stacka.pop();
			if(temp.equals(")")) {
				end++;
			}else {
				while(end > 0) {
					if(temp.equals("(")) {
						end--;
					}else {
						no = true;
						break;
					}
				}
			}
			
			if(no) break;
		}
		
		if(end == 0) {
			answer = true;
		}else {
			answer = false;
		}
		
		return answer;
	}

}
