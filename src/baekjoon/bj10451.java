package baekjoon;

import java.io.*;
import java.util.*;

public class bj10451 {
	static int[] map;
	static boolean[] visit;
	static int cycle;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		for(int i=0; i<T; i++){
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			map = new int[N+1];
			cycle=0;
			for(int j=1; j<=N; j++){
				map[j]= Integer.parseInt(st.nextToken());
			}
			visit = new boolean[N+1];
			for(int j=1; j<=N; j++){
				if(!visit[j]){
					dfs(j);
					cycle++;
				}
			}
			System.out.println(cycle);
			
		}
		
	}
	static void dfs(int start) {
		visit[start] = true;
		int next = map[start];
		if(!visit[next]){
			dfs(next);
		}
	}

}
