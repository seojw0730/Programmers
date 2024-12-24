package level2;

public class 삼각달팽이 {
	public int[] solution(int n) {
        int[] answer=new int[n*(n+1)/2];
        int[][] tmp=new int[n][];
        for(int i=0; i<n; i++){
            tmp[i]=new int[i+1];
        }
        int cnt=1, i=0, j=0, direction=1;
        while(cnt<=answer.length){
            tmp[i][j]=cnt++;
            switch(direction){
                case 1:
                    i++;
                    if(i==n || tmp[i][j]>0){
                        i--;
                        j++;
                        direction=2;
                    }
                    break;
                case 2:
                    j++;
                    if(j==tmp[i].length || tmp[i][j]>0){
                        j-=2;
                        i--;
                        direction=3;
                    }
                    break;
                default:
                    i--; j--;
                    if(tmp[i][j]>0){
                        i+=2;
                        j++;
                        direction=1;
                    }
                    break;
            }
        }
        int idx=0;
        for(i=0; i<tmp.length; i++){
            for(j=0; j<tmp[i].length; j++){
                answer[idx++]=tmp[i][j];
            }
        }
        return answer;
    }
}
