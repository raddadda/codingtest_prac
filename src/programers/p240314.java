package programers;

public class p240314 {
	class Solution {
		//문자열 내 p와 y의 개수
	    boolean solution(String s) {
	        boolean answer = true;
	        int cntP=0;
	        int cntY=0;
	        s=s.toLowerCase();
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)=='p'){
	                cntP++;
	            }
	            if(s.charAt(i)=='y'){
	                cntY++;
	            }
	        }
	        if(cntP==cntY){
	            answer=true;
	        }else{
	             answer=false;
	        }
	            

	        return answer;
	    }
	}
}
