package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 야근지수 {
	
	public static void main(String[] args) {
		int n = 4;
		int[] works = {4, 1, 3};
		solution(n, works);
	}
	
	public static long solution(int n, int[] works) {
        long answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < works.length; i++){
            list.add(works[i]);
        }
        
        int temp;
        
        do{
            n--;
            Collections.sort(list);
            if(list.size() > 0) {
            	temp = list.get(list.size()-1);
            	list.remove(list.size()-1);
            	temp -= 1;
            	if(temp > 0) {
            		list.add(temp);
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
