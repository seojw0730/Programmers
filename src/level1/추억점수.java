package level1;

import java.util.*;

public class 추억점수 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer=new int[photo.length];
        List<String> nameList=new ArrayList<>();
        for(String s : name) nameList.add(s);
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(nameList.contains(photo[i][j])) answer[i]+=yearning[nameList.indexOf(photo[i][j])];
            }
        }
        return answer;
    }
}
