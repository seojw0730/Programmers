package level2;

public class 쿼드압축후개수세기 {
	public int[][] change(int i1, int j1, int n, int[][] arr){
        int zero=0, one=0;
        for(int i=i1; i<i1+n; i++){
            for(int j=j1; j<j1+n; j++){
                if(arr[i][j]==0) zero++;
                if(arr[i][j]==1) one++;
            }
        }
        if(zero==n*n){
            for(int i=i1; i<i1+n; i++){
                for(int j=j1; j<j1+n; j++){
                    arr[i][j]=-1;
                }
            }
            arr[i1][j1]=0;
        }
        if(one==n*n){
            for(int i=i1; i<i1+n; i++){
                for(int j=j1; j<j1+n; j++){
                    arr[i][j]=-1;
                }
            }
            arr[i1][j1]=1;
        }
        return arr;
    }
    
    public int[] solution(int[][] arr) {
        int[] answer=new int[2];
        int n=arr.length, repeat=1;
        
        if(n==1){
            if(arr[0][0]==0) answer[0]++;
            if(arr[0][0]==1) answer[1]++;
            return answer;
        }
        
        while(n>1){
            for(int i=0; i<repeat; i++){
                for(int j=0; j<repeat; j++){
                    arr=change(n*i, n*j, n, arr);
                }
            }
            n/=2; repeat*=2;
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==0) answer[0]++;
                if(arr[i][j]==1) answer[1]++;
            }
        }
        return answer;
    }
}
