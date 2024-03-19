package programers;

public class p240319 {
	//서울에서김서방찾기
	class Solution {
	    public String solution(String[] seoul) {
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i<seoul.length; i++){
	            if(seoul[i].contains("Kim")){
	                sb.append("김서방은 ").append(i).append("에 있다");
	              
	            }
	        }
	        
	        return sb.toString();
	    }
	}
}
