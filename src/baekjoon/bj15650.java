package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj15650 {
	static boolean[] visit;
	static int[] arr;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr=new int[M];

		dfs(1,0);
		System.out.println(sb);
	}
	static void dfs(int tmp,int depth) {
		
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=tmp; i<=N; i++){
			arr[depth] = i;
			dfs(i+1,depth+1);
			
		}
		
	}
}
