package level1;

import java.util.*;

public class 폰켓몬 {
	public int solution(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i : nums) set.add(i);
        int kind=set.size();
        if(kind<nums.length/2) return kind;
        else return nums.length/2;
    }
}
