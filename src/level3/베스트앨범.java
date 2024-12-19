package level3;

import java.util.*;

public class 베스트앨범 {
	public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer=new ArrayList<>();
        
        Map<String, Integer> rank=new HashMap<>();
        Map<String, Map<Integer, Integer>> map=new HashMap<>();
        for(int i=0; i<genres.length; i++){
            rank.put(genres[i], rank.getOrDefault(genres[i], 0)+plays[i]);
            if(!map.containsKey(genres[i])) map.put(genres[i], new HashMap<>());
            map.get(genres[i]).put(i, plays[i]);
        }
        List<String> rankList=new ArrayList<>(rank.keySet());
        Collections.sort(rankList, (o1, o2)->rank.get(o2)-rank.get(o1));
        for(String s : rankList){
            List<Integer> musicList=new ArrayList<>(map.get(s).keySet());
            Collections.sort(musicList, (o1, o2)->map.get(s).get(o2)-map.get(s).get(o1));
            answer.add(musicList.get(0));
            if(musicList.size()>1) answer.add(musicList.get(1));
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
