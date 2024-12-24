package level2;

import java.util.*;

public class 하노이의탑 {
	List<List<Integer>> list=new ArrayList<>();
    int cnt=0;
    
    public void Hanoi(int n, int start, int mid, int end){
        cnt++;
        if(n==1){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(start); tmp.add(end);
            list.add(tmp);
        }else{
            Hanoi(n-1, start, end, mid);
            List<Integer> tmp=new ArrayList<>();
            tmp.add(start); tmp.add(end);
            list.add(tmp);
            Hanoi(n-1, mid, start, end);
        }
    }
    
    public int[][] solution(int n) {
        Hanoi(n, 1, 2, 3);
        int[][] answer=new int[cnt][2];
        for(int i=0; i<answer.length; i++){
            answer[i][0]=list.get(i).get(0);
            answer[i][1]=list.get(i).get(1);
        }
        return answer;
    }
}
