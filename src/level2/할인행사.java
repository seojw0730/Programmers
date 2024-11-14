package level2;

import java.util.*;

public class 할인행사 {
	public int solution(String[] want, int[] number, String[] discount) {
        int answer=0, start=0;
        while(start+10<=discount.length){
            HashMap<String, Integer> map=new HashMap<>();
            for(int i=0; i<want.length; i++){
                map.put(want[i], number[i]);
            }
            for(int i=start; i<start+10; i++){
                if(map.containsKey(discount[i])){
                    map.put(discount[i], map.get(discount[i])-1);
                    if(map.get(discount[i])==0) map.remove(discount[i]);
                }
            }
            if(map.size()==0) answer++;
            start++;
        }
        return answer;
    }
}
