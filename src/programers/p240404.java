package programers;

public class p240404 {
	class Solution {
		//크기가 작은 부분문자열
	    public int solution(String t, String p) {
	        int answer = 0;
	        int size = t.length()-p.length()-1;
	        for(int i=0; i<size; i++){
	            String str =t.substring(i,i+3);
	            System.out.println(str);
	        }
	        return answer;
	    }
	}
}
