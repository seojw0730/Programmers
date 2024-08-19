package level1;

public class 하샤드수 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(solution(x));
	}
	
	public static boolean solution(int x) {
        int divided = 0;
        
        for(int i = 0; i < String.valueOf(x).length(); i++) {
        	divided += Integer.parseInt(String.valueOf(String.valueOf(x).charAt(i)));
        }
        
        if(x % divided == 0) {
        	return true;
        }else {
        	return false;
        }
    }
}
