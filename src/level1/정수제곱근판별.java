package level1;

public class 정수제곱근판별 {
	public static void main(String[] args) {
		long n = 1;
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
		long answer = 0;
		
		if(n == 1) { // 1인 경우
			return 4;
		}else { // 2이상인 경우
			for (long i = 1; i < n; i++) {
				if ((i * i) == n) {
					answer = n + 2 * i + 1;
					break;
				} else {
					answer = -1;
				}
			}
			
			return answer;
		}
	}
}
