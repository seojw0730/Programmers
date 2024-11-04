package level2;

import java.util.*;

public class 괄호회전하기 {
	public boolean isRight(String s){
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                if(c==')' && stack.pop()!='(') return false;
                if(c==']' && stack.pop()!='[') return false;
                if(c=='}' && stack.pop()!='{') return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
    
    public int solution(String s) {
        int answer=0;
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c);
        }
        for(int i=0; i<s.length(); i++){
            if(isRight(s)) answer++;
            char temp=sb.charAt(0);
            s=sb.deleteCharAt(0).append(temp).toString();
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 괄호회전하기().solution(s));
	}
}
