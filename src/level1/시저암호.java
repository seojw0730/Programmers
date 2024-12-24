package level1;

public class 시저암호 {
	public String solution(String s, int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char tmp=s.charAt(i);
            if(Character.isLowerCase(tmp)){
                sb.append((int)(tmp+n)>'z' ? (char)(tmp+n-26) : (char)(tmp+n));
            }else if(Character.isUpperCase(tmp)){
                sb.append((int)(tmp+n)>'Z' ? (char)(tmp+n-26) : (char)(tmp+n));
            }else{
                sb.append(tmp);
            }
        }
        return sb.toString();
    }
}
