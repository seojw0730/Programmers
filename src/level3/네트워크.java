package level3;

public class 네트워크 {
	boolean[] chk;
    
    public void dfs(int row, int n, int[][] computers){
        for(int i=0; i<n; i++){
            if(!chk[i] && row!=i && computers[row][i]==1){
                chk[i]=true;
                dfs(i, n, computers);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        if(n==1) return 1;
        
        int answer=0;
        chk=new boolean[n];
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                if(!chk[j] && computers[i][j]==1){
                    chk[j]=true;
                    answer++;
                    dfs(j, n, computers);
                }
            }
        }
        return answer;
    }
}
