package level2;

import java.util.*;

public class 주식가격 {
	public int[] solution(int[] prices) {
        int[] answer=new int[prices.length];
        Queue<Integer> queue=new LinkedList<>();
        for(int i : prices) queue.offer(i);
        int idx=0;
        while(!queue.isEmpty()){
            queue.poll();
            for(int i=idx+1; i<prices.length; i++){
                answer[idx]++;
                if(prices[i]<prices[idx]) break;
            }
            idx++;
        }
        return answer;
    }
}
