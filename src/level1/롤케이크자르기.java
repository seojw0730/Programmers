package level1;

import java.util.*;

public class 롤케이크자르기 {
	public int solution(int[] topping) {
        int answer=0;
        Map<Integer, Integer> toppingMap=new HashMap<>();
        for(int i=0; i<topping.length; i++) toppingMap.put(topping[i], toppingMap.getOrDefault(topping[i], 0)+1);
        Map<Integer, Integer> tmp=new HashMap<>();
        for(int i=0; i<topping.length; i++){
            toppingMap.put(topping[i], toppingMap.get(topping[i])-1);
            if(toppingMap.get(topping[i])==0) toppingMap.remove(topping[i]);
            tmp.put(topping[i], tmp.getOrDefault(topping[i], 0)+1);
            if(toppingMap.size()==tmp.size()) answer++;
        }
        return answer;
    }
}
