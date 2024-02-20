package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj15652 {
	static int[] arr;
	static boolean[] visit;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visit = new boolean[N];
		dfs(0);
		System.out.print(sb);
		
	}
	
	static void dfs(int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<N; i++){
			//System.out.print("@"+i);
			if(arr[depth-1]<=i) {
				//System.out.print("!"+i);
				visit[i]= true;
				arr[depth]=i+1;
				dfs(depth+1);
				visit[i]= false;
			}
		}
	}
}
