package level2;

public class N진수게임 {
	public String solution(int n, int t, int m, int p) {
        StringBuilder sb=new StringBuilder();
        int num=0;
        while(true){
            sb.append(Integer.toString(num, n).toUpperCase());
            if(sb.toString().length()>=m*t+p) break;
            num++;
        }
        StringBuilder answer=new StringBuilder();
        int idx=p-1;
        while(true){
            answer.append(sb.toString().charAt(idx));
            if(answer.toString().length()==t) break;
            idx+=m;
        }
        return answer.toString();
    }
}
