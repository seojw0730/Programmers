package level2;

import java.util.*;

public class 주차요금계산 {
	public int minutes(String start, String end){
        StringTokenizer st=new StringTokenizer(start, ":");
        int startH=Integer.parseInt(st.nextToken());
        int startM=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(end, ":");
        int endH=Integer.parseInt(st.nextToken());
        int endM=Integer.parseInt(st.nextToken());
        return (60*endH+endM)-(60*startH+startM);
    }
    
    public int totalTime(String[][] record, String number){
        int total=0;
        List<Integer> indexes=new ArrayList<>();
        for(int i=0; i<record.length; i++){
            if(record[i][1].equals(number)) indexes.add(i);
        }
        for(int i=0; i<2*(indexes.size()/2); i+=2){
            total+=minutes(record[indexes.get(i)][0], record[indexes.get(i+1)][0]);
        }
        if(indexes.size()%2==1) total+=minutes(record[indexes.get(indexes.size()-1)][0], "23:59");
        return total;
    }
    
    public int[] solution(int[] fees, String[] records) { 
        StringTokenizer st;
        String[][] record=new String[records.length][3];
        List<String> carNum=new LinkedList<>();
        for(int i=0; i<records.length; i++){
            st=new StringTokenizer(records[i], " ");
            record[i][0]=st.nextToken();
            record[i][1]=st.nextToken();
            record[i][2]=st.nextToken();
            if(!carNum.contains(record[i][1])) carNum.add(record[i][1]);
        }
        Collections.sort(carNum);
        int time=fees[0], fee=fees[1], addTime=fees[2], addFee=fees[3];
        int[] answer=new int[carNum.size()];
        for(int i=0; i<answer.length; i++){
            int totalTime=totalTime(record, carNum.get(i));
            if(totalTime<=time) answer[i]=fee;
            else answer[i]=fee+(int)Math.ceil((totalTime-time)/(double)addTime)*addFee;
        }
        return answer;
    }
}
