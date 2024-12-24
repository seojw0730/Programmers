package level1;

public class 최대공약수와최소공배수 {
	public int gcd(int n, int m){
        if(m==0) return n;
        else return gcd(m, n%m);
    }
    
    public int lcm(int n, int m){
        int gcd=gcd(n, m);
        return n*m/gcd;
    }
    
    public int[] solution(int n, int m) {
        int[] answer=new int[2];
        answer[0]=gcd(m, n);
        answer[1]=lcm(m, n);
        return answer;
    }
}
