package level1;

import java.util.*;

public class 예산 {
	public int solution(int[] d, int budget) {
        int answer=0;
        Arrays.sort(d);
        for(int i : d){
            if(i<=budget){
                budget-=i;
                answer++;
            }else break;
        }
        return answer;
    }
}
