package level1;

public class 두정수사이의합 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println(solution(a, b));
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        
        if(a == b) {
        	answer = a;
        }else if(a > b) {
        	while(a >= b) {
        		answer += b;
        		b++;
        	}
        }else {
        	while(b >= a) {
        		answer += a;
        		a++;
        	}
        }
        
        return answer;
    }
}
