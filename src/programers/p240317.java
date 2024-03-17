package programers;

public class p240317 {
	class Solution {
	    public long solution(int a, int b) {
	        long answer = 0;
	        int num1 = 0;
	        int num2 = 0;
	        num1=Math.max(a,b);
	        num2=Math.min(a,b);
	        for(int i=num2; i<=num1; i++){
	            answer+=i;
	        }
	        return answer;
	    }
	}
}
