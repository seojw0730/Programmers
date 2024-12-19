package level2;

import java.util.*;

public class 기능개발 {
	public int days(int progress, int speed){
        if((100-progress)%speed==0) return (100-progress)/speed;
        else return (100-progress)/speed+1;
    }
    
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer=new ArrayList<>();
        int[] days=new int[progresses.length];
        for(int i=0; i<days.length; i++){
            days[i]=days(progresses[i], speeds[i]);
        }
        Stack<Integer> stack=new Stack<>();
        int tmp=days[0];
        for(int i : days){
            if(stack.size()>0 && i>tmp){
                answer.add(stack.size());
                tmp=i;
                stack.clear();
            }
            stack.push(i);
        }
        if(stack.size()>0) answer.add(stack.size());
        return answer.stream().mapToInt(i->i).toArray();
    }
}
