package level1;

public class 수박수박수박수박수박수 {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
		String answer = "";
		
		for(int i = 0; i < n / 2; i++) {
			answer += "수박";
		}
		
		if(n % 2 != 0) {
			answer += "수";
		}
		
		return answer;
	}
}
