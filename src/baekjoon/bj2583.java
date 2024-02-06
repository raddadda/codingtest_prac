package baekjoon;

import java.io.*;
import java.util.*;

public class bj2583 {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int[][] arr;
	static boolean[][] visit;
	static int cnt;
	static int tmp;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		visit= new boolean[M][N];
		cnt = 0;
		
		for(int i=0; i<K; i++){
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int x=x1; x<x2; x++) {
				for(int y=y1; y<y2; y++){
					arr[y][x]=1;
					//System.out.print(x+" "+y);
				}
				//System.out.println();
				
			}
			
			
		}
		for(int i=0; i<M; i++) {
		for(int j=0; j<N; j++) {
			
			System.out.print(i+""+j+" ");
		}
		System.out.println();
	}
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(!visit[i][j]&&arr[i][j]==0) {
					tmp=0;
					bfs(i,j);
					cnt++;
					tmp++;
					sb.append(tmp).append(" ");
					
				}
				
			}
		}
//		
		System.out.println(cnt);
		System.out.print(sb);
	}
	public static void bfs(int x,int y){
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x,y});
		visit[x][y] = true;
		while(!q.isEmpty()){
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i=0; i<4; i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				
				if(nextX<0||nextY<0||nextX>=arr.length||nextY>=arr[0].length) {
					continue;
				}
				
				if(visit[nextX][nextY]||arr[nextX][nextY]==1) {
//					if(!visit[nowX][nowY]&&arr[nowX][nowY]==1){
//						tmp++;
//					}
					continue;
				}
				
				q.offer(new int[] {nextX,nextY});
				tmp++;
				visit[nextX][nextY]=true;
			
			}
		}
	}
}
