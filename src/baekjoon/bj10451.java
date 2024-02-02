package baekjoon;

import java.io.*;
import java.util.*;

public class bj10451 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
	
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] arr1 = new int[M];
			for(int j=0; j<M;j++){
				arr1[j] = Integer.parseInt(st.nextToken());
			

			}

		}
	}
}
