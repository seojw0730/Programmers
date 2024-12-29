package level1;

public class 옹알이2 {
	public int solution(String[] babbling) {
        int answer=0;
        String[] possible={"aya", "ye", "woo", "ma"};
        boolean pass=false;
        for(String s : babbling){
            pass=false;
            for(int i=0; i<4; i++){
                if(s.contains(possible[i]+possible[i])) pass=true;
            }
            if(pass) continue;
            for(int i=0; i<4; i++){
                s=s.replace(possible[i], " ");
            }
            s=s.replace(" ", "");
            if(s.length()==0) answer++;
        }
        return answer;
    }
}
