package level2;

public class N개의최소공배수 {
	
	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		solution(arr);
	}
	
	public static int solution(int[] arr) {
        int answer = arr[arr.length-1];
        int count;
        
        do{
            answer++;
            count = 0;
            for(int i = 0; i < arr.length; i++){
                if(answer % arr[i] == 0){
                    ++count;
                }
            }
        }while(count < arr.length);
        
        return answer;
    }
}
