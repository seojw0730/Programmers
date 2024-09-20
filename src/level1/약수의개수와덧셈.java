package level1;

public class 약수의개수와덧셈 {
	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		System.out.println(solution(left, right));
	}
	
	public static int solution(int left, int right) {
		int answer = 0;
		
		for(int i = left; i < right + 1; i++) {
			if(divisor(i) % 2 != 0) {
				answer += i;
			}else {
				answer -= i;
			}
		}
		
		return answer;
	}
	
	public static int divisor(int num) {
		int divisor = 0;
		
		for(int i = 1; i < Math.sqrt(num) + 1; i++) {
			if(num % i == 0) {
				divisor++;
			}
		}
		
		return divisor;
	}
}
