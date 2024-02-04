package baekjoon;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj2331 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		list.add(A);
		
		while(true) {
			int tmp = list.get(list.size()-1);
			int answer=0;
			
			while(tmp!=0) {
				answer += (int)Math.pow(tmp%10,(double)P);
				tmp /= 10;
			}
			
			if(list.contains(answer)) {
				int result = list.indexOf(answer);
				System.out.print(result);
				break;
			}
			list.add(answer);
		}
		
		
		
		
	

	}
	public static void dfs(){
		
	} 
}
