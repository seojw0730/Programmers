package level1;

public class 소수찾기 {
	public boolean isPrime(int n){
        if(n==1) return false;
        if(n==2 || n==3) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int solution(int n) {
        int answer=0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }
}
