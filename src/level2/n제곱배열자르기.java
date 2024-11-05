package level2;

import java.util.*;

public class n제곱배열자르기 {
	public int[] solution(int n, long left, long right) {
        int[] answer=new int[(int)(right-left)+1];
        long row=left/n, col=left%n, cnt=0;
        while(cnt<=right-left){
            if(col<=row) answer[(int)cnt]=(int)row+1;
            else answer[(int)cnt]=(int)col+1;
            col++;
            if(col==n){
                row++;
                col=0;
            }
            cnt++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long left=sc.nextLong();
		long right=sc.nextLong();
		sc.close();
		System.out.println(new n제곱배열자르기().solution(n, left, right));
	}
}
