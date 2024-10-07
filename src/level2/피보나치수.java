package level2;

public class 피보나치수 {
	
	public static void main(String[] args) { 
		int n = 100;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		int answer = 0;
		int temp1 = 1;
		int temp2 = 1;
		while (true) {
			answer  = temp1 + temp2;
			if(answer > 1234567) {
				answer -= 1234567;
			}
			if ((n - 3) < 1) {
				break;
			}
			
			temp1 = temp2;
			temp2 = answer;
			
			n--;
		}
		return answer;
	}
}
