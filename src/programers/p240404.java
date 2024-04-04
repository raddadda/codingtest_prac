package programers;

public class p240404 {
	class Solution {
		//크기가 작은 부분문자열
	    public int solution(String t, String p) {
	        int answer = 0;
	        int size = t.length()-p.length()+1;
	        for(int i=0; i<size; i++){
	            String str =t.substring(i,i+p.length());
	            
	            /**
	             * 처음에는 Integer.parseInt() 로 했지만 그러면 str값이 int에는 오버플로우가 된다.
	             * 따라서 Long으로 바꿔줘야 str값이 들어갈 수 있다.
	             **/
	            if(Long.parseLong(str) <= Long.parseLong(p)){
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
}
