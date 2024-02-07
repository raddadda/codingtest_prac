package baekjoon;

import java.io.*;
import java.util.*;

public class bj2606 {
	static List<Integer>[] relation;
	static boolean[] check;
	static int res= -1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		relation = new ArrayList[M+1];
		check = new boolean[M+1];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			relation[x].add(y);
			relation[y].add(x);
		}
		
		recur(1,0);
	}
	static void recur(int x,int cnt) {
//		if(x ==){
//			res = cnt;
//			return cnt;
//		}
		
		for(int i=0; i<relation[x].size(); i++) {
			int next = relation[x].get(i);
			if(!check[next]) {
				recur(next,cnt+1);
			}
		}
	}
}
