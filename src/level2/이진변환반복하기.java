package level2;

public class 이진변환반복하기 {
	public static void main(String[] args) {
			String s = "01110";
			System.out.println(solution(s));
		}
	
	static int[] solution(String s) {
		int[] answer = new int[2];
		// 이진 변환 횟수
		int ans1 = 0;
		// 지워지는 0 개수
		int ans2 = 0;
		StringBuilder sb;
		while(true) {
			// 0 자르기
			sb = new StringBuilder();
			String strArr[] = {};
			strArr = s.split("0");
			for(String e : strArr) {
				System.out.print(e+"/");
			}
			
			for(String e : strArr) {
				sb.append(e);
			}
			System.out.println(sb.toString());
			ans2 += s.length() - sb.toString().length();
			String s2 = sb.toString();
			ans1++;
			if(zeroTest(s2)) {
				break;
			}
			// 이진수 변환
			s = Integer.toBinaryString(s2.length());
		}
		
		answer[0] = ans1;
		answer[1] = ans2;
		return answer;
	}

	static boolean zeroTest(String abc) {
		String[] abcArr = abc.split("0");
		if ((abcArr[0].equals("1"))&&(abcArr.length==1)) {
			return true;
		} else {
			return false;
		}
	}
}
