package level1;

public class 콜라문제 {
	public int solution(int a, int b, int n) {
        int answer=0;
        while(n>=a){
            n-=a-b;
            answer+=b;
        }
        return answer;
    }
}
