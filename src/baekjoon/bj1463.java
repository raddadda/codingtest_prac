package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1463 {
	//메모이제이션 할 배열
	static Integer[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		dp = new Integer[N+1];
		dp[0]=dp[1]=0;
		
		System.out.println(d(N));
	}
	static int d(int num) {
		//탐색하지 않았던 N일 경우
		if(dp[num] == null) {
			//6으로 나눠질 경우
			if(num%6==0) {
				dp[num]=Math.min(d(num-1), Math.min(d(num/3), d(num/2)))+1;
			}else if(num%3==0) {
				dp[num]=Math.min(d(num/3), d(num-1))+1;
			}
			else if(num%2==0) {
				dp[num]=Math.min(d(num/2),d(num-1))+1;
			}
			else {
				dp[num] = d(num-1)+1;
			}
		}

		

		return dp[num];
	}
}
