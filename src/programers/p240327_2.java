package programers;

import java.util.*;
public class p240327_2 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        String[] str = s.split("");
	        Arrays.sort(str,Collections.reverseOrder());
	        for(String a : str){
	            answer += a;
	        }
	        return answer;
	    }
	}
}
