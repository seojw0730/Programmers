package level1;

public class 부족한금액계산하기 {
	public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++){
            answer+=price*i;
        }
        answer-=money;
        if(answer<0) answer=0;
        return answer;
    }
}
