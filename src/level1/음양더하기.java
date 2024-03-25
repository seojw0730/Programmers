package level1;

public class 음양더하기 {
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int answer = 123456789;
		
		int[] signsInt = new int[signs.length];
		for(int i = 0; i < signsInt.length; i++) {
			if(signs[i]) {
				signsInt[i] = 1;
			}else {
				signsInt[i] = -1;
			}
		}
		int sum = 0;
		for(int i = 0; i < absolutes.length; i++) {
			sum += absolutes[i] * signsInt[i];
		}
		answer = sum;
		
		System.out.println("answer:" + answer);
	}
}
