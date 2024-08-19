package level1;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		int[] answer = solution(arr, divisor);
		System.out.print("[");
		for(int i = 0; i < answer.length; i++) {
			if(i < answer.length - 1) {
				System.out.print(answer[i] + ", ");
			}else {
				System.out.print(answer[i]);
			}
		}
		System.out.print("]");
	}
	
	public static int[] solution(int[] arr, int divisor) {
        int size = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		size++;
        	}else {
        		arr[i] = 0;
        	}
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
        	for(int j = 0; j < arr.length - 1 - i; j++) {
        		if(arr[j] < arr[j+1]) {
        			int temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;
        		}
        	}
        }
        
        int[] answer = new int[size];
        
        if(size == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }else {
        	for(int i = 0; i < answer.length; i++) {
        		answer[i] = arr[i];
        	}
        	
        	for(int i = 0; i < answer.length - 1; i++) {
        		for(int j = 0; j < answer.length - 1 - i; j++) {
        			if(answer[j] > answer[j+1]) {
        				int temp = answer[j];
        				answer[j] = answer[j+1];
        				answer[j+1] = temp;
        			}
        		}
        	}
        	
        	return answer;
        }
    }
}
