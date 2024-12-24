package level2;

public class 행렬의곱셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer=new int[arr1.length][arr2[0].length];
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                int temp=0;
                for(int k=0; k<arr2.length; k++){
                    temp+=arr1[i][k]*arr2[k][j];
                }
                answer[i][j]=temp;
            }
        }
        return answer;
    }
}
