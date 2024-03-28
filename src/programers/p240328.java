package programers;

public class p240328 {
	class Solution {
		//부족한 금액 계산하기
	    public long solution(int price, int money, int count) {
	        long answer = 0;
	        long sum=0;
	        for(int i=1; i<=count; i++){
	            sum+=price*i;
	        }
	        //예외처리
	        if(sum-money<0){
	            return 0;
	        }
	        answer = sum-(long)money;
	        return answer;
	    }
	}
}
