package level1;

public class 푸드파이트대회 {
	public String solution(int[] food) {
        StringBuilder sb=new StringBuilder();
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                sb.append(i);
            }
        }
        StringBuilder sb2=new StringBuilder(sb.toString()).reverse();
        for(int i=0; i<food[0]; i++){
            sb.append("0");
        }
        sb.append(sb2.toString());
        return sb.toString();
    }
}
