package programers;

import java.util.*;
public class p240327_2 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        //문자열 내림차순으로 배치하기
	        String[] str = s.split("");
	        //내림차순으로 하는법Collections.reverseOrder
	        Arrays.sort(str,Collections.reverseOrder());
	        for(String a : str){
	            answer += a;
	        }
	        return answer;
	    }
	}
}
