package level2;

import java.util.*;

class Element implements Comparable<Element>{
    int num;
    List<Integer> list;
    
    Element(int num, List<Integer> list){
        this.num=num;
        this.list=list;
    }
    
    @Override
    public int compareTo(Element o){
        return this.num-o.num;
    }
}

public class 튜플 {
	public int[] solution(String s) {
        StringTokenizer st=new StringTokenizer(s, "{");
        int num=st.countTokens();
        List<Element> list=new LinkedList<>();
        for(int i=0; i<num; i++){
            String tmp=st.nextToken();
            List<Integer> tmpList=new ArrayList<>();
            if(num==1){
                tmp=tmp.substring(0, tmp.length()-2);
            }else{
                if(i==0) tmp=tmp.substring(0, tmp.length()-2);
                else tmp=tmp.substring(0, tmp.length()-2);
            }
            
            StringTokenizer st2=new StringTokenizer(tmp, ",");
            int cnt=st2.countTokens();
            for(int j=0; j<cnt; j++){
                tmpList.add(Integer.parseInt(st2.nextToken()));
            }
            list.add(new Element(cnt, tmpList));
        }
        Collections.sort(list);
        
        List<Integer> answer=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).num; j++){
                int tmp=list.get(i).list.get(j);
                if(!answer.contains(tmp)) answer.add(tmp);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}