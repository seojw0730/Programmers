package level2;

import java.util.*;

public class 최빈값구하기 {
	public int solution(int[] array) {
		HashMap<Integer, Integer> map=new HashMap<>();
        for(int i : array) map.put(i, map.getOrDefault(i, 0)+1);
        List<Map.Entry<Integer, Integer>> list=new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> map.get(o2.getValue()).compareTo(map.get(o1.getValue())));
        for(Map.Entry<Integer, Integer> m : list) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        if(map.size()==1) return list.get(0).getValue();
        if(map.get(list.get(0).getValue())==map.get(list.get(1).getValue())) return -1;
        return map.get(list.get(0).getValue());
	}
	
	public static void main(String[] args) {
		int[] array= {1, 2, 3, 3, 3, 4};
//		int[] array= {1, 1, 2, 2};
//		int[] array= {1};
		System.out.println(new 최빈값구하기().solution(array));
	}
}
