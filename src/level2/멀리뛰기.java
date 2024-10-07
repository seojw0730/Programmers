package level2;

public class 멀리뛰기 {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(solution(n));
	}
	
	static long solution(int n) {
		long[] longArr = new long[2001];
		longArr[1] = 1;
		longArr[2] = 2;
		for(int i = 3; i <= n; i++) {
			longArr[i] = (longArr[i-1] + longArr[i-2]) % 1234567;
		}
		return longArr[n];
	}
}