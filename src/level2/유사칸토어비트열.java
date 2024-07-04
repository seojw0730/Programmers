package level2;

public class 유사칸토어비트열 {
	
	public static void main(String[] args) {
		int n = 2;
		long l = 4;
		long r = 17;
		System.out.println(solution(n, l, r));
	}
	
	public static int solution(int n, long l, long r) {
        int answer = 0;
        int count = 0;
        String a = "1";
        while(true) {
        	a = a.replaceAll("0", "00000").replaceAll("1", "11011");
        	count++;
        	if(count > n) break;
        }
        int a1 = a.length() / 3;
        int a2 = a.length() * (2 / 3);
        if((a1 < l) && (a1 < r) && (l < a2) && (r < a2)) {
        	return 0;
        }else if((l < a1) && (a1 < r) && (r < a2)) {
        	String b = a.substring((int)(l-1), a1);
            b = b.replaceAll("0", "");
            answer = b.length();
        }else if((l < a1) && (a2 < r)) {
        	String b = a.substring((int)(l-1), a1).concat(a.substring(a2, (int)r));
        	b = b.replaceAll("0", "");
        	answer = b.length();
        }else if((a1 < l) && (l < a2) && (a2 < r)) {
        	String b = a.substring(a2, (int)r);
        	b = b.replaceAll("0", "");
        	answer = b.length();
        }
//        String c = Integer.toBinaryString(Integer.parseInt(a, (int)l-1, (int)r, 2));
//        String c = Long.toBinaryString(Long.parseLong(a, (int)l-1, (int)r, 2));
        
//        String b = a.substring((int)(l-1), (int)r);
//        b = b.replaceAll("0", "");
//        c = c.substring((int)r-1, c.length());
//        c = c.replaceAll("0", "");
//        answer = c.length();
        return answer;
    }
}
