package level1;

public class 소수만들기 {
	boolean[] chk;
    int[] arr;
    int answer=0;
    
    public void dfs(int L, int n, int start, int[] nums){
        if(L==n){
            int tmp=0;
            for(int i : arr) tmp+=i;
            if(isPrime(tmp)) answer++;
        }else{
            for(int i=start; i<nums.length; i++){
                if(!chk[i]){
                    chk[i]=true;
                    arr[L]=nums[i];
                    dfs(L+1, n, i+1, nums);
                    chk[i]=false;
                }
            }
        }
    }
    
    public boolean isPrime(int n){
        if(n==1) return false;
        if(n<=3) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        chk=new boolean[nums.length];
        arr=new int[3];
        dfs(0, 3, 0, nums);
        return answer;
    }
}
