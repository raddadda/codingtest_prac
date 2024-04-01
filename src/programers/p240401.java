package programers;

public class p240401 {
	class Solution {
	    //최대공약수와 최소공배수 구하는법
	    static int d(int n,int m){
	        //유클리드호제법 이용하기
	        int r = 0;
	        //n이 더 커야한다
	        while(m>0){
	            r=n%m;
	            n=m;
	            m=r;
	        }
	        return n;
	    }
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        
	        int left = Math.max(n,m);
	        int right = Math.min(n,m);
	        answer[0] = d(left,right);
	        answer[1] = n*m/answer[0];
	        return answer;
	    }
	}
}
