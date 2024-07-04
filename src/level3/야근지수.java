package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 야근지수 {
	
	public static void main(String[] args) {
		int n = 3;
		int[] works = {1, 1};
		System.out.println(solution(n, works));
	}
	
	public static long solution(int n, int[] works) {
        long answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < works.length; i++){
            list.add(works[i]);
        }
        
        int size = list.size();
        
        if(size == 1) {
        	return (list.get(0) - n)*(list.get(0) - n);
        }
        
        int temp;
        boolean sort = true;
        
        do{
            n--;
            if(sort) {
            	Collections.sort(list);
            	sort = false;
            	if(list.get(size-1) == 0) {
            		return 0;
            	}
            }
            if(list.size() > 0) {
            	temp = list.get(size-1);
            	if(temp == 0) {
            		return 0;
            	}
            	list.remove(size-1);
            	temp -= 1;
            	list.add(temp);
            	if(list.get(size-1) < list.get(size-2)) {
            		sort = true;
            	}
            }
        }while(n > 0);
        
        for(int i = 0; i < list.size(); i++){
            int element = list.get(i);
            answer += element * element;
        }
        
        return answer;
    }
}
