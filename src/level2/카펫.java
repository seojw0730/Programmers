package level2;

public class 카펫{
	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		System.out.println(solution(brown, yellow));
	}
	
	static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		
		// 노란색 타일이 i줄일 경우
		for(int i = 1; i < yellow + 1; i++) {
			// 갈색 타일은 노란색 타일을 한 겹으로 둘러 쌓음
			if(brown == (2 * ((yellow / i + yellow % i) + i) + 4)) {
				answer[0] = (yellow / i) + 2;
				answer[1] = i + 2;
				break;
			}
		}
		return answer;
	}
}