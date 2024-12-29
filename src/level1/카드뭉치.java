package level1;

public class 카드뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1=0, idx2=0, idx=0;
        while(idx<goal.length){
            String tmp=goal[idx];
            if(idx1<cards1.length && tmp.equals(cards1[idx1])) idx1++;
            else if(idx2<cards2.length && tmp.equals(cards2[idx2])) idx2++;
            else return "No";
            idx++;
        }
        return "Yes";
    }
}
