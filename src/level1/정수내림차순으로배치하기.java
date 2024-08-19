package level1;

public class 정수내림차순으로배치하기 {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
    	long answer = 0;
        
        long[] tempArr = new long[String.valueOf(n).length()];

        // 주어진 n을 long배열로 바꾸기
        for(int i = 0; i < tempArr.length; i++){
            tempArr[i] = Long.parseLong(String.valueOf(String.valueOf(n).charAt(i)));
        }
        
        // long배열 요소 내림차순 배열
        for(int i = 0; i < tempArr.length - 1; i++){
            for(int j = 0; j < tempArr.length - 1 - i; j++){
                if(tempArr[j] < tempArr[j+1]){
                    long temp = tempArr[j];
                    tempArr[j] = tempArr[j+1];
                    tempArr[j+1] = temp;
                }
            }
        }
        
        // 이어붙이기
        String tempStr = "";
        for(int i = 0; i < tempArr.length; i++){
            tempStr += String.valueOf(tempArr[i]);
        }
        
        answer = Long.parseLong(tempStr);
        
        return answer;
    }
}
