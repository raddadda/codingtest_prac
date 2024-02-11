package baekjoon;

import java.io.*;
import java.util.*;

public class bj11724 {
	static int[][] map;
	static boolean[] visit;
	static int cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			map[x][y]=map[y][x]=1;
		}
//		for(int i=0; i<N; i++) {
//			if(visit[i]) {
//				
//			}
//		}
		dfs(1);
	}
	
	public static void dfs(int start){
		if(visit[start]) {
			System.out.println("@@");
			return;
		}
		visit[start] = true;
		//cnt++;
		
		for(int i=0; i<map[start].length; i++) {
			if(map[start][i]==1&&visit[i]) {
				dfs(i);
			}
		}
	}
}
