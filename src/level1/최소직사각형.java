package level1;

public class 최소직사각형 {
	public int solution(int[][] sizes) {
        int w=Integer.MIN_VALUE, h=Integer.MIN_VALUE;
        for(int i=0; i<sizes.length; i++){
            int wT=Math.max(sizes[i][0], sizes[i][1]), hT=Math.min(sizes[i][0], sizes[i][1]);
            if(wT>w) w=wT;
            if(hT>h) h=hT;
        }
        return w*h;
    }
}
