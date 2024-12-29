package level1;

public class 덧칠하기 {
	public int solution(int n, int m, int[] section) {
        int answer=0;
        int paintS=0, paintE=0;
        for(int i=0; i<section.length; i++){
            if(section[i]>paintE){
                answer++;
                paintS=section[i];
                paintE=paintS+m-1;
            }
        }
        return answer;
    }
}
