package begin;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class 컨트롤제트 {
	public static void main(String[] args) {
		String s = "10 Z 20 Z 1";
		int answer = 0;
		StringTokenizer st = new StringTokenizer(s);
		int num = st.countTokens();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			list.add(st.nextToken());
		}
		boolean exit = false;
		for (int i = 0; i < list.size(); i++) {
			while (true) {
				for (int j = 0; j < list.size() - 1; j++) {
					if (list.get(j + 1).equals("Z")) {
						list.remove(j);
						list.remove(j);
					}
				}
				for (int j = 0; j < list.size(); j++) {
					if (!list.get(j).equals("Z")) {
						exit = true;
						break;
					}
				}
				if (exit) {
					break;
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			answer += Integer.parseInt(list.get(i));
		}
		System.out.println("answer:" + answer);
	}
}
