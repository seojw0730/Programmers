package level1;

import java.util.*;

public class 삼총사 {
	int answer=0;
    int[] arr=new int[3];
    boolean[] chk;
    
    public void dfs(int L, int start, int[] number){
        if(L==3){
            int sum=0;
            for(int i : arr){
                sum+=i;
            }
            if(sum==0) answer++;
        }else{
            for(int i=start; i<number.length; i++){
                if(!chk[i]){
                    chk[i]=true;
                    arr[L]=number[i];
                    dfs(L+1, i+1, number);
                    arr[L]=0;
                    chk[i]=false;
                }
            }
        }
    }
    
    public int solution(int[] number) {
        Arrays.sort(number);
        chk=new boolean[number.length];
        dfs(0, 0, number);
        return answer;
    }
}
