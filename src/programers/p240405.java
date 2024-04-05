package programers;

public class p240405 {
	class Solution {
		//이상한 문자 만들기
	    public String solution(String s) {
	        StringBuilder answer = new StringBuilder();
	        String[] arr = s.split(" ");
	        for(int i=0; i<arr.length; i++){
	            String[] str = arr[i].split("");
	            for(int j=0; j<str.length; j++){
	                if(j%2==0){
	                    str[j]=str[j].toUpperCase();
	                }
	               answer.append(str[j]);
	            }
	            answer.append(" ");
	        }
	        answer.deleteCharAt(answer.length()-1);
	        return answer.toString();
	    }
	}
}
