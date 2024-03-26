package level2;

public class 피보나치수 {
	public static void main(String[] args) {
		int n = 100;
		int answer = 0;
		
		int a = 0;
		int temp1, temp2;
		temp1 = 1;
		temp2 = 1;
		while (true) {
			a  = temp1 + temp2;
			if(a > 1234567) {
				a = a - 1234567;
			}
			if ((n - 3) < 1) {
				break;
			}

			temp1 = temp2;
			temp2 = a;

			n--;
		}
		answer = a;
	}
}
