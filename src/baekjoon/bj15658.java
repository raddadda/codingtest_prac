package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj15658 {
	static int[] arr;
	static int[] op;
	static int result;
	static int N;
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		op = new int[4];
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			op[i]= Integer.parseInt(st.nextToken());
		}
		dfs(1,arr[0]);
		System.out.println(max);
		System.out.println(min);
    }
    
    static void dfs(int depth,int result) {
    	if(depth == N) {
    		min = Math.min(min, result);
    		max = Math.max(max, result);
    		return;
    	}
    	for(int i=0; i<4; i++) {
    		if(op[i]==0) {
    			continue;
    		}
    		op[i]--;
    		switch(i) {
    		case 0:
    			dfs(depth+1,result+arr[depth]);
    			break;
    		case 1:
    			dfs(depth+1,result-arr[depth]);
    			break;
    		case 2:
    			dfs(depth+1,result*arr[depth]);
    			break;
    		case 3:
    			dfs(depth+1,result/arr[depth]);
    			break;
    		}
    		op[i]++;
    	}
    }
}
