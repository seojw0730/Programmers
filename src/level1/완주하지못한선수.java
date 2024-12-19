package level1;

import java.util.*;

public class 완주하지못한선수 {
	public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map=new HashMap<>();
        for(int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        for(int i=0; i<completion.length; i++){
            map.put(completion[i], map.get(completion[i])-1);
            if(map.get(completion[i])==0) map.remove(completion[i]);
        }
        return map.keySet().iterator().next();
    }
}
