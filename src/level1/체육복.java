package level1;

import java.util.*;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer=0;
        int[] students=new int[n];
        Arrays.fill(students, 1);
        for(int i : lost) students[i-1]--;
        for(int i : reserve) students[i-1]++;
        boolean rent=false;
        for(int i=0; i<n; i++){
            rent=false;
            if(students[i]>1){
                if(i>0 && students[i-1]==0){
                    students[i-1]++;
                    students[i]--;
                    rent=true;
                }
                if(i<n-1 && !rent && students[i+1]==0){
                    students[i+1]++;
                    students[i]--;
                }
            }
        }
        for(int i : students){
            if(i>0) answer++;
        }
        return answer;
    }
}
