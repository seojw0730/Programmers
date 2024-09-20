package level1;

public class 가운데글자가져오기 {
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		
		if(s.length() % 2 == 0) {
			answer += String.valueOf(s.charAt(s.length() / 2 - 1));
		}
		
		answer += String.valueOf(s.charAt(s.length() / 2));
		
		
		return answer;
	}
}
