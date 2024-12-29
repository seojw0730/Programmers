package level1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
	public String[] solution(String[] strings, int n) {
        List<String> answer=new LinkedList<>();
        for(String s : strings) answer.add(s);
        Collections.sort(answer, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.charAt(n)==o2.charAt(n)) return o1.compareTo(o2);
                return String.valueOf(o1.charAt(n)).compareTo(String.valueOf(o2.charAt(n)));
            }
        });
        return answer.toArray(new String[answer.size()]);
    }
}
