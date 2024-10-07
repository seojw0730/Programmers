package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최솟값만들기 {

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		System.out.println(solution(A, B));
	}
	
	static int solution(int[] A, int[] B){
        int answer = 0;
        
        List<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++) {
        	lista.add(A[i]);
        }
        Collections.sort(lista);
        
        List<Integer> listb = new ArrayList<Integer>();
        for(int i = 0; i < B.length; i++) {
        	listb.add(B[i]);
        }
        Collections.sort(listb, Collections.reverseOrder());
        
        for(int i = 0; i < lista.size(); i++) {
        	answer += lista.get(i) * listb.get(i);
        }

        return answer;
    }
}
