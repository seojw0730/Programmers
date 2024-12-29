package level1;

public class 기사단원의무기 {
	public int weapons(int n){
        int weapons=0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0) weapons+=2;
            if(i==Math.sqrt(n)) weapons--;
        }
        return weapons;
    }
    
    public int solution(int number, int limit, int power) {
        int answer=0;
        for(int i=1; i<=number; i++){
            int tmp=weapons(i);
            if(tmp>limit) answer+=power;
            else answer+=tmp;
        }
        return answer;
    }
}
