package level2;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "(((((((()()))()";
		System.out.println(solution(s));	
	}

	static boolean solution(String s) {
		int open = 0;
		int close = 0;
		
		// 괄호 개수를 셀 때
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				open++;
			}else if(s.charAt(i) == ')') {
				close++;
			}
			// 여는 것보다 닫는 게 많으면 false
			if(open < close) {
				return false;
			}
		}
		
		// 여는 것과 닫는 게 같으면 true
		if(open == close) {
			return true;
		}
		
		// 아니면 false
		return false;
	}
}
