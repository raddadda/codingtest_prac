package programers;

public class p240320 {
	class Solution {
		//콜라츠 추측
	    public int solution(int num) {
	        int answer = 0;
	        int cnt=0;
	        if(num==1){
	            return 0;
	        }
	        for(int i=0; i<500; i++){ 
	            if(num%2==0){
	                num=num/2;
	            }else if(num%2>0){
	                num=(num*3)+1;
	            }
	            cnt++;
	            if(num==1){
	                return cnt;
	            }
	        }
	       
	        return -1;
	    }
	}
}
