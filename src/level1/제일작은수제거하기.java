package level1;

public class 제일작은수제거하기 {
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		int[] answer = solution(arr);
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
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}else {
			int min = 2000000000;
			int minIdx = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
					minIdx = i;
				}
			}
			
			answer = new int[arr.length - 1];
			
			for(int i = 0; i < arr.length; i++) {
				if(i < minIdx) {
					answer[i] = arr[i];
				}else if(i > minIdx) {
					answer[i - 1] = arr[i]; 
				}
			}
			
			return answer;
		}
    }
}
