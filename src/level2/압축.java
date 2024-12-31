package level2;

import java.util.*;

public class 압축 {
	public int[] solution(String msg) {
        List<Integer> answer=new ArrayList<>();
        
        // 1.
        List<String> dic=new ArrayList<>();
        for(int i=0; i<26; i++) dic.add(String.valueOf((char)('A'+i)));
        
        int start=0;
        while(true){
            int end=start+1;
            // 2.
            while(end<msg.length() && dic.contains(msg.substring(start, end))) end++;
            // 3.
            if(end==msg.length()){
                if(dic.contains(msg.substring(start, end))){
                    answer.add(dic.indexOf(msg.substring(start, end))+1);
                    break;
                }else{
                    answer.add(dic.indexOf(msg.substring(start, end-1))+1);
                    start=end-1;
                    continue;
                }
            }
            else answer.add(dic.indexOf(msg.substring(start, end-1))+1);
            // 4.
            dic.add(msg.substring(start, end));
            start=end-1;
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
