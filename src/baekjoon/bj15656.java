package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj15656 {
	static int[] arr;
	static int[] num;
	static boolean[] visit;
	static int N,M;
	static StringBuilder sb = new  StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		num = new int[N];
		visit = new boolean[N];
		 st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);

		dfs(0);
		System.out.print(sb);
	}
	
	static void dfs(int depth) {
		if(depth == M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=0; i<num.length; i++) {
			//if(!visit[i]) {
				visit[i]=true;
				arr[depth] = num[i];
				dfs(depth+1);
				visit[i]=false;
		//	}
		}
	}
}
