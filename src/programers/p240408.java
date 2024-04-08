package programers;
import java.util.*;
public class p240408 {

	class Solution {
	    public int[] solution(String s) {
	        int[] answer = new int[s.length()];
	        Map<Character, Integer> map = new HashMap<>();

	        for(int i=0; i<s.length(); i++){
	           //해당 문자가 map에 없다면 -1
	            if(!map.containsKey(s.charAt(i))){
	                answer[i]=-1;
	                map.put(s.charAt(i),i);
	            }else{
	                //해당 문자가 map에 있다면 현재 인덱스 - 이전 인덱스
	                answer[i]=i-map.get(s.charAt(i));
	                map.put(s.charAt(i),i);
	            }
	        }
	        return answer;
	    }
	}
}
