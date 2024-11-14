package level2;

import java.util.*;

public class HIndex {
	public int solution(int[] citations) {
        int answer=0;
        int lt=Math.min(citations.length, Arrays.stream(citations).min().getAsInt());
        int rt=Arrays.stream(citations).max().getAsInt();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            int cnt=0;
            for(int i=0; i<citations.length; i++){
                if(citations[i]>=mid) cnt++;
            }
            if(cnt>=mid){
                answer=Math.max(answer, mid);
                lt=mid+1;
            }else{
                rt=mid-1;
            }
        }
        return answer;
    }
}
