package level2;

import java.util.*;

public class 전력망을둘로나누기 {
	public int solution(int n, int[][] wires) {
        int answer=Integer.MAX_VALUE;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<wires.length; i++){
            int a=wires[i][0], b=wires[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i=0; i<wires.length; i++){
            int a=wires[i][0], b=wires[i][1];
            int cnt=0;
            int[] chk=new int[n+1]; chk[0]=-1; chk[1]=1;
            
            list.get(a).remove(Integer.valueOf(b));
            list.get(b).remove(Integer.valueOf(a));
            
            connection(list, chk, 1);
            
            for(int j=0; j<chk.length; j++){
                if(chk[j]==1) cnt++;
            }
            answer=Math.min(answer, Math.abs(cnt-(n-cnt)));
            
            list.get(a).add(b);
            list.get(b).add(a);
        }
        return answer;
    }
    
    public void connection(List<List<Integer>> list, int[] chk, int n){
        for(int i=0; i<list.get(n).size(); i++){
            int tmp=list.get(n).get(i);
            if(chk[tmp]==1) continue;
            if(chk[tmp]==0) chk[tmp]=1;
            connection(list, chk, tmp);
        }
    }
}
