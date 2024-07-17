package level1;

import java.util.LinkedList;
import java.util.List;

public class 달리기경주 {
	
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] answer = solution(players, callings);
		for(String s : answer) {
			System.out.println(s);
		}
	}
	
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        List<String> list = new LinkedList<String>();
        for(int i = 0; i < players.length; i++) {
        	list.add(i, players[i]);
        }
        for(int i = 0; i < callings.length; i++) {
        	int index = list.indexOf(callings[i]);
        	String call = list.remove(index);
        	list.add(index-1, call);
        }
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
