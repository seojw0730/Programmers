package level2;

class JadenCase문자열만들기 {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
	}
	
	static String solution(String s) {
		String answer = "";
		// 문자열로 변환
		char[] arrChar = new char[s.length()];
		
		// 모두 소문자로 변환
		for (long i = 0; i < arrChar.length; i++) {
			arrChar[(int) i] = String.valueOf(s.charAt((int) i)).toString().toLowerCase().charAt(0);
		}
		
		// 첫 문자 대문자로, 마지막 문자 소문자로 변환
		arrChar[0] = String.valueOf(arrChar[0]).toString().toUpperCase().charAt(0);
		arrChar[arrChar.length - 1] = String.valueOf(arrChar[arrChar.length - 1]).toString().toLowerCase().charAt(0);
		
		// 모든 단어 첫 문자 대문자로 변환
		for (long i = 1; i < arrChar.length - 1; i++) {
			if ((arrChar[(int) i] == ' ') && (arrChar[(int) i + 1] != ' ')) {
				arrChar[(int) i + 1] = String.valueOf(arrChar[(int) i + 1]).toUpperCase().charAt(0);
			}
		}
		
		// 문자열로 변환
		for (long i = 0; i < arrChar.length; i++) {
			answer += arrChar[(int) i];
		}
		
		/* 문자열이 한 자리 소문자일 경우 대문자로 변환 */
		if (arrChar.length == 1) {
			answer = String.valueOf(arrChar[0]).toString().toUpperCase();
		}
        return answer;
	}
}
