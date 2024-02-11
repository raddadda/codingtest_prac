package baekjoon;

import java.io.*;
import java.util.*;
public class bj1389 {
	static int[][] map;
	private static int INF = 99999;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		
		for(int i=1; i<= N; i++) {
			for(int j=1; j<= N; j++) {
				if(i!=j) {
					map[i][j]=INF;
				}
			}
		}
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y] = map[y][x] = 1;
		}

		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					map[i][j]= Math.min(map[i][j],map[i][k]+map[k][j]);
				}
				//System.out.println();
			
			}
		}
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		
		for(int i=1; i<=N; i++) {
			int sum =0;
			for(int j=1; j<=N; j++) {
				sum+=map[i][j];
			}
			if(min > sum) {
				min = sum;
				minIdx = i;
			}
		}
		
		System.out.println(minIdx);
	}
}
