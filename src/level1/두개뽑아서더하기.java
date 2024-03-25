package level1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		Set<Integer> a = new TreeSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
					a.add(numbers[i] + numbers[j]);
			}
		}
		Iterator<Integer> ir = a.iterator();
		int[] answer = new int[a.size()];
		
		for(int i = 0; i < a.size(); i++) {
			answer[i] = ir.next();
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
