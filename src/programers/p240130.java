package programers;
import java.io.*;
import java.util.*;

public class p240130 {
	static StringBuilder sb = new StringBuilder();
	static boolean[] check;
	static List<Integer>[] arr;
	static int M,N,start;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[N+1];
		check = new boolean[N+1];
		
		for(int i=0; i<N+1; i++){
			arr[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		dfs(start);
		System.out.print(sb);
	}
	
	public static void dfs(int start){
		check[start] = true;
		sb.append(start+" ");
		for(int i=0; i<arr[start].size(); i++) {
			int next = arr[start].get(i);
			if(!check[next]) {
				dfs(next);
			}
		}
	}
}
