package baekjoon;

import java.io.*;
import java.util.*;

public class bj2667 {
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[] aparts;
	static int n;
	static int apartNum = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		visit = new boolean[N][N];
		aparts = new int[N*N]; 
		for(int i=0; i<N; i++){
			String s = st.nextToken();
			for(int j=0; j<N; j++) {
				map[i][j]=s.charAt(j-'0');
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1 && !visit[i][j]) {
					apartNum++;
					bfs(i,j);
				}
				
			}
		}
		
	}
	public static void bfs(int x,int y){
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x,y});
		visit[x][y]= true;
		aparts[apartNum]++;
		while(!q.isEmpty()){
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				if(nextX<0||nextY<0||map.length<=nextX||map[0].length<=nextY) {
					continue;
				}
				if(map[nextX][nextY]==0 || visit[nextX][nextY]) {
					continue;
				}
				q.offer(new int[] {nextX,nextY});
				
				visit[nextX][nextY]=true;
			}
		}
	}
}
