package level2;

public class 피로도 {
	int[] chk;
    int answer=0;
    
    public void dfs(int L, int k, int[][] dungeons){
        if(L==dungeons.length){
            int cnt=0;
            for(int i=0; i<chk.length; i++){
                if(chk[i]==1) cnt++;
            }
            answer=Math.max(answer, cnt);
        }else{
            for(int i=0; i<dungeons.length; i++){
                if(chk[i]==0){
                    if(k>=dungeons[i][0]){
                        chk[i]=1;
                        dfs(L+1, k-dungeons[i][1], dungeons);
                    }else{
                        chk[i]=-1;
                        dfs(L+1, k, dungeons);
                    }
                    chk[i]=0;
                }
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        chk=new int[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
}
