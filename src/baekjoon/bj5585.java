package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj5585 {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(br.readLine());
		int[] arr = {500,100,50,10,5,1};
		cost = 1000-cost;
		int num = 0;
		for(int i=0; i<6; i++) {
			if(cost/arr[i]>0) {
				num+=cost/arr[i];
				cost = cost % arr[i];
			}
		}
		System.out.print(num);
	}
	
}
