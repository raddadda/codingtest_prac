package programers;

public class p240412 {
	class Solution {
		//콜라문제
	
	    public int solution(int a, int b, int n) {
	    	
	    	//시간초과가 났다 원인은 워스트케이스일경우 1000000번을 반복해야하기 때문이라고 생각했다.
	    	
	        int answer = 0;
	        int sum=n;
	        while(sum>1){
	            int num1=sum/a;
	            int num2=sum%a;
	            sum = num1+num2;
	            answer+=num1;
	        }
	        
	        return answer;
	    }
	}
}
