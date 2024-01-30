package baekjoon;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class bj2178 {
	static int[][] map;
	static boolean[][] visit;
	static int N;
	static int M;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i=0; i<N; i++){
			String s = br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		visit = new boolean[N][M];
		visit[0][0] = true;
		bfs(0,0);
		if(visit[N-1][M-1]){
			System.out.print(map[N-1][M-1]);
		}
		

		
		
	}
	public static void bfs(int x,int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()){
			int[] now=q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i=0; i<4; i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				if(nextX<0||nextY<0||map.length<=nextX||map[0].length<=nextY){
					continue;
				}
				if(map[nextX][nextY]==0||visit[nextX][nextY]) {
					continue;
				}
				q.add(new int[] {nextX,nextY});
				map[nextX][nextY] = map[nowX][nowY]+1;
				visit[nextX][nextY] = true;
			}
		}
	}
}
