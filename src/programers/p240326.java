package programers;

public class p240326 {
	class Solution {
		//가운데 글자 가져오기
	    public String solution(String s) {
	        String answer = "";
	        for(int i=0; i<s.length(); i++){
	            if(s.length()%2==0){
	                answer = s.substring(s.length()/2-1,s.length()/2+1);
	            }else{
	                int size = s.length()/2;
	                answer = s.substring(size,size+1);
	            }
	        }
	        return answer;
	    }
	}
}
