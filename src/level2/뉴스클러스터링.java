package level2;

import java.util.*;

public class 뉴스클러스터링 {
	public int solution(String str1, String str2) {
        str1=str1.toUpperCase(); str2=str2.toUpperCase();
        Map<String, Integer> map1=new HashMap<>();
        Map<String, Integer> map2=new HashMap<>();
        for(int i=0; i<str1.length()-1; i++){
            if(!Character.isAlphabetic(str1.charAt(i)) || !Character.isAlphabetic(str1.charAt(i+1))) continue;
            map1.put(str1.substring(i, i+2), map1.getOrDefault(str1.substring(i, i+2), 0)+1);
        }
        for(int i=0; i<str2.length()-1; i++){
            if(!Character.isAlphabetic(str2.charAt(i)) || !Character.isAlphabetic(str2.charAt(i+1))) continue;
            map2.put(str2.substring(i, i+2), map2.getOrDefault(str2.substring(i, i+2), 0)+1);
        }
        
        if(map2.size()==0) return 65536;
        
        List<String> keySet1=new LinkedList<>(map1.keySet());
        List<String> keySet2=new LinkedList<>(map2.keySet());
        double numer=0, denom=0;
        for(String s : keySet1){
            if(map2.containsKey(s)) numer+=Math.min(map1.get(s), map2.get(s));
        }
        Map<String, Integer> sumMap=new HashMap<>();
        for(String s : keySet1) sumMap.put(s, Math.max(map1.get(s), map2.getOrDefault(s, 0)));
        for(String s : keySet2) sumMap.put(s, Math.max(map1.getOrDefault(s, 0), map2.get(s)));
        List<String> sumKeySet=new ArrayList<>(sumMap.keySet());
        for(String s : sumKeySet) denom+=sumMap.get(s);
        
        return (int)(numer/denom*65536);
    }
}
