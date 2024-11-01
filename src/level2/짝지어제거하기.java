package level2;

import java.util.*;

public class 짝지어제거하기 {
	public int solution(String s) {
		Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            char temp=stack.push(c);
            if(stack.size()>1 && temp==stack.get(stack.size()-2)){
                stack.pop();
                stack.pop();
            }
        }
        if(stack.isEmpty()) return 1;
        else return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 짝지어제거하기().solution(s));
	}
}
