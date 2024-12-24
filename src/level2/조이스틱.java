package level2;

public class 조이스틱 {
	public int alphabet(char c){
        if(c<='N') return (int)(c-'A');
        else return (int)('Z'-c)+1;
    }
    
    public int move(String name){
        int answer=Integer.MAX_VALUE;
        answer=Math.min(answer, twoway(name));
        answer=Math.min(answer, forward(name));
        answer=Math.min(answer, backward(name));
        return answer;
    }
    
    public int twoway(String name){
        int answer=0;
        int len=name.length(), start=0, end=0, cnt=0, max=Integer.MIN_VALUE;
        int[] tmp=new int[len];
        for(int i=0; i<len; i++){
            if(name.charAt(i)=='A'){
                tmp[i]=++cnt;
                max=Math.max(max, tmp[i]);
            }else cnt=0;
        }
        for(int i=0; i<len; i++){
            if(tmp[i]==max){
                start=i-max+1;
                end=i;
                break;
            }
        }
        if(start==0) return backward(name);
        if(end==len-1) return forward(name);
        answer=Math.min(2*(start-1)+(len-(end+1)), 2*(len-(end+1))+(start-1));
        return answer;
    }
    
    public int forward(String name){
        int answer=0;
        for(int i=name.length()-1; i>=0; i--){
            if(name.charAt(i)!='A'){
                answer=i;
                break;
            }
        }
        return answer;
    }
    
    public int backward(String name){
        int answer=0;
        for(int i=1; i<name.length(); i++){
            if(name.charAt(i)!='A'){
                answer=name.length()-i;
                break;
            }
        }
        return answer;
    }
    
    public int solution(String name) {
        int alpha=0;
        for(int i=0; i<name.length(); i++){
            alpha+=alphabet(name.charAt(i));
        }
        return move(name)+alpha;
    }
}
