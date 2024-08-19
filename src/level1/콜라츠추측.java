package level1;

public class 콜라츠추측 {
	public static void main(String[] args) {
		long n = 1;
		System.out.println(solution(n));
	}
	
	public static int solution(long num) {
        int answer = 0;
        
        while((num != 1) && (answer != -1)) {
        	if(num % 2 == 0) {
        		num /= 2;
        		answer++;
        	}else {
        		num = 3 * num + 1;
        		answer++;
        	}
        	
        	if(answer == 500) {
        		answer = -1;
        	}
        }
        
        return answer;
    }
}
