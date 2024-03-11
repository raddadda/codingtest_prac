package programers;

public class p240311 {

	public class Solution {
		//자릿수 더하기
	    public int solution(int n) {
	        int answer = 0;

	        while(true){
	            answer+=n%10;
	            if(n/10==0){
	                break;
	            }
	            n=n/10;
	        }
	        return answer;
	    }
	}
}
