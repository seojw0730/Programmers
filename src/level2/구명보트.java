package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 구명보트 {
	
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.println(solution(people, limit));
	}
	
    public static int solution(int[] people, int limit) {
        int answer = 0;
        // list로 저장
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < people.length; i++) {
        	list.add(people[i]);
        }
        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        // 다시 배열에 저장
        int[] intArr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	intArr[i] = list.get(i);
        }
        
        // 배 한번 태울때마다 1씩 증가
        int weight; // 태운 무게
        int num; //  태운 사람수
        int[] index = new int[intArr.length]; // 태운 사람 index
        boolean isExit = false;
        int exit;
        while(true) {
        	weight = 0; // 무게 초기화
        	num = 0; // 사람수 초기화
        	for(int i = 0; i < intArr.length; i++) {
        		if(index[i] <= 240) {
        			weight += intArr[i];
        			index[i] = intArr[i];
        			num++;
        			// 최대 무게 초과 시 다시 내리게 함
        			if(weight > limit) {
        				weight -= intArr[i];
        				index[i] = 0;
        				num--;
        			}
        			if(num == 2 || i == intArr.length - 1) {
        				exit = 0;
        				for(int idx = 0; idx < index.length; idx++) {
        					System.out.println(index[idx]);
        					if(index[idx] != 0) {
        						index[idx] = 250;
        						exit++;
        					}
        					if(exit == index.length) {
        						isExit = true;
        					}
        				}
        				answer++;
        			}
        		}
        	}
        	if(isExit) {
        		break;
        	}
        	
        }
        return answer;
    }
    
}
