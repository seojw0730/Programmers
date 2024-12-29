package level2;

import java.util.*;

public class 타겟넘버 {
	public int solution(int[] numbers, int target) {
        int answer=0, idx=-1;
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        while(++idx<numbers.length){
            int len=q.size();
            for(int i=0; i<len; i++){
                int tmp=q.poll();
                q.offer(tmp+numbers[idx]);
                q.offer(tmp-numbers[idx]);
            }
        }
        for(int i : q){
            if(i==target) answer++;
        }
        return answer;
    }
}
