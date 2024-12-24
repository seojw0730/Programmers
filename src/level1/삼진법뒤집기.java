package level1;

public class 삼진법뒤집기 {
	public int solution(int n) {
        int answer=0;
        StringBuilder sb=new StringBuilder();
        sb.append(Integer.toString(n, 3));
        sb.reverse();
        answer=Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}
