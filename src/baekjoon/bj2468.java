package baekjoon;

import java.io.*;
import java.util.*;

public class bj2468 {
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	//static int cnt=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		//visit = new boolean[N][N];
		int maxHeight=0;
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j =0; j<N; j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
				if(map[i][j] > maxHeight) {
					maxHeight = map[i][j];
				}
			}
		}
		int max = 0;
		for(int height=0; height<maxHeight+1; height++){
			visit = new boolean[N][N];
			int cnt=0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(!visit[i][j]&&map[i][j]>height) {
						cnt+=bfs(i,j,height);
					}
				}
			}
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
		
	}
	public static int bfs(int x,int y,int height) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x,y});
		visit[x][y] = true;
		
		while(!q.isEmpty()){
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++){
				int nextX=nowX+dx[i];
				int nextY=nowY+dy[i];
				
				if(nextX<0||nextY<0||map.length<=nextX||map[0].length<=nextY){
					continue;
				}
				if(visit[nextX][nextY]||map[nextX][nextY]<=height) {
					continue;
				}
				q.offer(new int[] {nextX,nextY});
				
				visit[nextX][nextY]= true;
			}
		}
		return 1;
	}
}
