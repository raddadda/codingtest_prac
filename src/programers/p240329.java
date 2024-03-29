package programers;

public class p240329 {
	class Solution {
		//문자열 다루기 기본
	    public boolean solution(String s) {
	        if(s.length()!=4 && s.length()!=6){
	                return false;
	        }
	        
	        for(int i=0; i<s.length(); i++){
	            if('0'>s.charAt(i) || s.charAt(i)>'9'){
	                return false;
	            }
	        }
	        return true;
	        
	        //다른 사람 풀이
	        /**
	         * 
	         
	        if(s.length() == 4 || s.length() == 6){
	            try{
	                int x = Integer.parseInt(s);
	                return true;
	            } catch(NumberFormatException e){
	                return false;
	            }
	        }
	        else return false;
	         
	         
	       Integer.parseInt로 예외처리를 통해 푸는 방법
	       NumberFormatException는 숫자형 포맷 오류 발생을 뜻한다.
	       
	         * 
	         */


	    }
	}
}
