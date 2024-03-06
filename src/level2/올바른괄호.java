package level2;

import java.util.ArrayList;

public class 올바른괄호 {

//	class Solution {
//		String[] arrStr = new String[] {};
//		ArrayList<String> list = new ArrayList<String>();
//
//		boolean solution(String s) {
//			boolean answer = true;
//
//			arrStr = new String[s.length()];
//
//			for (int i = 0; i < s.length(); i++) {
//				arrStr[i] = String.valueOf(s.charAt(i));
//			}
//
//			add();
//
//			boolean exit = true;
//
//			while (true) {
//				exit = true;
//
//				remove(exit);
//
//				if ((list.size() == 0) || (exit)) {
//					answer = true;
//					break;
//				}
//			}
//
//			if (list.size() != 0) {
//				answer = false;
//			}
//
//			return answer;
//		}
//
//		public void add() {
//			for (int i = 0; i < arrStr.length; i++) {
//				list.add(arrStr[i]);
//			}
//		}
//
//		public void remove(boolean exit) {
//			for (int i = 0; i < list.size() - 1; i++) {
//				if ((list.get(i).equals("(")) && (list.get(i + 1).equals(")"))) {
//					list.remove(i);
//					list.remove(i);
//					exit = false;
//				}
//			}
//		}
//
//	}

	public static void main(String[] args) {
		String s = "()()";
		boolean answer = true;

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				list.add(String.valueOf(s.charAt(j)));
			}
		}
		
		System.out.println(list.size());

		boolean exit = true;

		while (true) {
			exit = true;

			for (int i = 0; i < list.size() - 1; i++) {
				if ((list.get(i).equals("(")) && (list.get(i + 1).equals(")"))) {
					list.remove(i);
					list.remove(i);
					exit = false;
				}
			}

			if ((list.size() == 0) || (exit)) {
				answer = true;
				break;
			}

		}

		if (list.size() != 0) {
			answer = false;
		}

		System.out.println("answer:" + answer);
	}

}
