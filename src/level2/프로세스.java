package level2;

import java.util.*;

public class 프로세스 {
	public int solution(int[] priorities, int location) {
        int idx=0, answer=0;
        while(true){
            int max=Arrays.stream(priorities).max().getAsInt(), tmp=priorities[idx];
            if(max==tmp){
                priorities[idx]=-1;
                answer++;
                if(idx==location) break;
            }
            idx++;
            if(idx==priorities.length) idx=0;
        }
        return answer;
    }
}
