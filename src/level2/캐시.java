package level2;

import java.util.*;

public class 캐시 {
	public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0) return 5*cities.length;
        
        int answer=0;
        List<String> list=new LinkedList<>();
        for(int i=0; i<cities.length; i++){
            String temp=cities[i].toLowerCase();
            if(list.contains(temp)){
                list.remove(temp);
                list.add(temp);
                answer++;
            }else{
                if(list.size()>=cacheSize) list.remove(0);
                list.add(temp);
                answer+=5;
            }
        }
        return answer;
    }
}
