package level1;

public class 핸드폰번호가리기 {
	public static void main(String[] args) {
//		String phone_number = "01033334444";
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	
	public static String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++) {
        	if(i < (phone_number.length() - 4)) {
        		answer += "*";
        	}else {
        		answer += String.valueOf(phone_number.charAt(i));
        	}
        }
        
        return answer;
    }
}
