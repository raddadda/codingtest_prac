package programers;

public class p240329 {
	class Solution {
		//문자열 다루기 기본
	    public boolean solution(String s) {
	        boolean answer = true;
	        chk(s);
	        return answer;
	    }
	    
	    static boolean chk(String s){
	        
	        if(s.length()!=4 && s.length()!=6){
	                return false;
	        }
	        for(int i=0; i<s.length(); i++){
	            if('0'<=s.charAt(i)-'0' && s.charAt(i)-'0'<='9'){
	               return true;
	            }
	        }

	        
	        return false;
	    }
	}
}
