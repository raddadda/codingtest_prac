package programers;

public class p240410 {
	class Solution {
		//하샤드 수
	    public boolean solution(int x) {
	        boolean answer = true;
	        int sum=0;
	        int num=x;
	        while(num>0){
	            sum+=num%10;
	            num/=10;
	        }
	       
	        if(x%sum!=0){
	            answer=false;
	        }
	        return answer;
	    }
	}
}
