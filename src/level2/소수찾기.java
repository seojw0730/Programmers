package level2;

import java.util.*;

public class 소수찾기 {
	public static void main(String[] args) {
		String numbers="17";
		System.out.println("answer: "+new 소수찾기().solution(numbers));
	}
	
	boolean[] chk;
    Set<Integer> set=new HashSet<>();
    
    public void number(int L, int n, String str, char[] arr){
        if(L==n) return;
        else{
            for(int i=0; i<arr.length; i++){
                if(!chk[i]){
                    chk[i]=true;
                    set.add(Integer.parseInt(str+arr[i]));
                    number(L+1, n, str+arr[i], arr);
                    chk[i]=false;
                }
            }
        }
    }
    
    public boolean isPrime(int n){
        if(n==1) return false;
        if(n==2 || n==3) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public int solution(String numbers) {
        int answer=0;
        char[] arr=numbers.toCharArray();
        chk=new boolean[arr.length];
        for(int i=1; i<=numbers.length(); i++) number(0, i, "", arr);
        for(int i : set){
            if(i>1 && isPrime(i)) answer++;
        }
        return answer;
    }
}
