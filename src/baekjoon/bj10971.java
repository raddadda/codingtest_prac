package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj10971 {
	static int[][] map;
	static boolean[] visit;
	static int N;
	static int max =Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				map[j][i]=Integer.parseInt(st.nextToken());
			}
		}
		visit = new boolean[N+1];
		for(int i=1; i<=N; i++){
			visit[i]=true;
			dfs(i,i,0,0);
			visit[i]=false;
		}
		System.out.println(max);
		System.out.println(map[0].length);
	}
	
	static void dfs(int start,int now,int sum,int cnt){
		if(cnt==N-1){
			if(map[now][start]!=0) {
				sum+= map[now][start];
				if(sum<max) {
					max=sum;
				} 
			}
			return;
		}
		
		for(int i=1; i<map[0].length; i++){
			if(map[now][i]!=0&&!visit[i]){
				visit[i]=true;
				dfs(start,i,sum+map[now][i],cnt+1);
				visit[i]=false;
			}
		}
	}
}
