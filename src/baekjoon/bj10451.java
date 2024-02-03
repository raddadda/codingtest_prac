package baekjoon;

import java.io.*;
import java.util.*;

public class bj10451 {
	static int[] map;
	static boolean[] check;
	static int cycle;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
	
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			map = new int[M+1];
			cycle=0;
			for(int j=1; j<=M;j++){
				map[j] = Integer.parseInt(st.nextToken());
			}
			check = new boolean[M+1];
			for(int j=1; j<=M;j++){
				if(!check[j]) {
					dfs(j);
					cycle++;
				}
			}
		}
	}
	static void dfs(int start){
		check[start] = true;
		int next = map[start];
		if(!check[next]){
			dfs(map[start]);
		}
	}
}
