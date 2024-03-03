package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj9095 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		arr = new int[11];
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for(int i=4; i<=10; i++) {
			arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
		}
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			sb.append(arr[num]).append('\n');
		}
		System.out.print(sb);
		
		
	}

	
}
