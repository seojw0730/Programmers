package level2;

import java.util.*;

public class 더맵게 {
	public int solution(int[] scoville, int K) {
        int answer=0;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i : scoville) q.offer(i);
        while(q.peek()<K){
            if(q.size()<2) return -1;
            int tmp1=q.poll(), tmp2=q.poll();
            q.offer(tmp1+2*tmp2);
            answer++;
        }
        return answer;
    }
}
