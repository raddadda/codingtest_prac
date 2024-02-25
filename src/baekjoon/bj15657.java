package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj15657 {
	static int N,M;
	static int[] arr;
	static int[] num;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		num= new int[N];
		arr= new int[N];
		visit = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		dfs(0,0);
		System.out.print(sb);
	}
	
	static void dfs(int depth,int tmp){
		if(depth == M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=tmp; i<num.length; i++){
		//	if(!visit[i]) {
				visit[i]= true;
				arr[depth]= num[i];
				dfs(depth+1,i);
				visit[i]= false;
		//	}
		}
	}
}
