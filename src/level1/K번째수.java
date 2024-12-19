package level1;

import java.util.*;

public class K번째수 {
	public int slice(int[] arr, int i, int j, int k){
        int[] tmp=new int[j-i+1];
        for(int a=0; a<tmp.length; a++){
            tmp[a]=arr[a+i-1];
        }
        Arrays.sort(tmp);
        return tmp[k-1];
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        for(int i=0; i<commands.length; i++){
            answer[i]=slice(array, commands[i][0], commands[i][1], commands[i][2]);
        }
        return answer;
    }
}
