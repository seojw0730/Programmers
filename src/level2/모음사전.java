package level2;

import java.util.*;

public class 모음사전 {
	String[] alpha={"A", "E", "I", "O", "U"};
    List<String> dic=new LinkedList<>();
    
    public void dfs(int L, int n, String str){
        if(L==n){
            dic.add(str);
        }else{
            for(int i=0; i<alpha.length; i++){
                StringBuilder sb=new StringBuilder(str);
                sb.append(alpha[i]);
                dfs(L+1, n, sb.toString());
            }
        }
    }
    
    public int solution(String word) {
        int answer=0;
        for(int i=1; i<=alpha.length; i++){
            dfs(0, i, "");
        }
        Collections.sort(dic);
        for(int i=0; i<dic.size(); i++){
            if(dic.get(i).equals(word)) answer=i+1;
        }
        return answer;
    }
}
