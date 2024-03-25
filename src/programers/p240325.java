package programers;

public class p240325 {
	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        String[] arr = {"수","박"};
	        for(int i=0; i<n; i++){
	            if(i%2==0){
	                answer+="수";
	            }else{
	                answer+="박";
	            }
	        }
	        return answer;
	    }
	}
}
