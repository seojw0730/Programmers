package level1;

public class 크기가작은부분문자열 {
	public int solution(String t, String p) {
        int answer=0, len=p.length();
        for(int i=0; i<=t.length()-len; i++){
            if(i<t.length()-len){
                if(Long.parseLong(t.substring(i, i+len))<=Long.parseLong(p)) answer++;
            }else{
                if(Long.parseLong(t.substring(i))<=Long.parseLong(p)) answer++;
            }
        }
        return answer;
    }
}
