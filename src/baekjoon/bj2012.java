package baekjoon;

import java.io.*;
import java.util.*;

public class bj2012 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N+1];
		
		arr[0] = 0;
		
		for (int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long answer = 0;
		for (int i= 1; i<N+1; i++) { 
			answer += Math.abs(i-arr[i]); 
		}
		System.out.println(answer);
    }
}
