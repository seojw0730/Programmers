package level2;

import java.util.Arrays;

public class 구명보트 {
	
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.println(solution(people, limit));
	}
	
    static int solution(int[] people, int limit) {
    	int answer = 0;
    	// 오름차순 정렬
        Arrays.sort(people);
        int index = 0;
        
        // 가장 많은 사람과 적은 사람 합쳐서
        for(int i = people.length - 1; i >= index; i--){
            answer++;
            // limit 이하면 index 하나 올려서 다음으로 적은 사람
            if(people[i] + people[index] <= limit){
                index++;
            }
        }
        
        return answer;
    }
    
}
