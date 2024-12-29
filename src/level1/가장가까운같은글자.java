package level1;

public class 가장가까운같은글자 {
	public int[] solution(String s) {
		int[] answer=new int[s.length()];
		for(int i=0; i<answer.length; i++){
			if(s.indexOf(s.charAt(i))==i) answer[i]=-1;
			else answer[i]=i-s.lastIndexOf(s.charAt(i), i-1);
		}
		return answer;
	}
}
