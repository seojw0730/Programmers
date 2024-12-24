package level1;

public class 이상한문자만들기 {
	public String solution(String s) {
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                cnt=0;
                sb.append(" ");
            }else sb.append(cnt++%2==0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i)));      
        }
        return sb.toString();
    }
}
