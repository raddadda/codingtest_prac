package programers;

import java.util.*;
public class p240126 {

	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};
	
	public int solution(int[][] maps){
		int answer = 0;
		
		boolean visit[][] = new boolean[maps.length][maps[0].length];
		
		bfs(0,0,maps,visit);
		if(visit[maps.length-1][maps[0].length-1]) {
			answer=maps[maps.length-1][maps[0].length-1];
		}else {
			answer=-1;
		}
		return answer;
	}
	
	public void bfs(int x,int y,int[][] maps,boolean[][] visit){
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x,y});
		
		while(!q.isEmpty()){
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++){
				int nextX = nowX +dx[i];
				int nextY = nowY +dy[i];
				
				if(nextX<0 || nextY <0 || nextX>=maps.length || nextY>=maps[0].length) {
					continue;
				}
				if(maps[nextX][nextY] == 0 || visit[nextX][nextY]) {
					continue;
				}
				q.offer(new int[] {nextX,nextY});
				maps[nextX][nextY] = maps[nowX][nowY]+1;
				
				visit[nextX][nextY]=true;
			}
		}
	} {
		
	}
}
