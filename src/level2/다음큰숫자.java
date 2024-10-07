package level2;

public class 다음큰숫자 {
	
	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		String nStr = String.valueOf(Integer.toBinaryString(n));
		// n의 1개수
		int num = 0;
		for(int i = 0; i < nStr.length(); i++) {
			if(nStr.charAt(i) == '1') {
				num++;
			}
		}
		int num2;
		n++;
		while(true) {
			nStr = String.valueOf(Integer.toBinaryString(n));
			num2 = 0;
			for(int i = 0; i < nStr.length(); i++) {
				if(nStr.charAt(i) == '1') {
					num2++;
				}
			}
			if(num == num2) {
				break;
			}
			n++;
		}
		
		return n;
	}
}
