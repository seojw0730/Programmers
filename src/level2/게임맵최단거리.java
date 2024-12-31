package level2;

import java.util.*;

public class 게임맵최단거리 {
	public int solution(int[][] maps) {
        int answer=Integer.MAX_VALUE;
        int[] dx={1, 0, -1, 0}, dy={0, 1, 0, -1};
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0, 0});
        boolean finish=false;
        int[][] visit=new int[maps.length][maps[0].length]; visit[0][0]=1;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len; i++){
                int[] tmp=q.poll();
                if(tmp[0]==maps.length-1 && tmp[1]==maps[0].length-1){
                    finish=true;
                    answer=Math.min(answer, visit[tmp[0]][tmp[1]]);
                    continue;
                }
                for(int j=0; j<4; j++){
                    int nx=tmp[0]+dx[j], ny=tmp[1]+dy[j];
                    if(0<=nx && nx<maps.length && 0<=ny && ny<maps[0].length && maps[nx][ny]==1 && visit[nx][ny]==0 && visit[tmp[0]][tmp[1]]+1<answer){
                        visit[nx][ny]=visit[tmp[0]][tmp[1]]+1;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        if(!finish) return -1;
        return answer;
    }
}
