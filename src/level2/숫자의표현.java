package level2;

public class 숫자의표현 {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int end = i ; end <= n; end++) {
				answer = 0;
				for (int k = i; k <= end; k++) {
					answer += k;
				}
				if (answer == n) {
					count++;
				}
			}
		}
		answer = count;
		System.out.println("answer:" + answer);
	}
}
