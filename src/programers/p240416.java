package programers;

import java.util.*;
public class p240416 {
	class Solution {
	    public int[] solution(int k, int[] score) {
	        int[] answer = new int[score.length];
	        List<Integer> list = new ArrayList<>();

	        for(int i=0; i<score.length; i++){
	            list.add(score[i]);
	            if(list.size()>k){
	                list.remove(Collections.min(list));
	            }
	            //Collections.min으로 List의 최소값을 찾을 수 있다.
	            answer[i]=Collections.min(list);
	            
	        }
	        return answer;
	    }
	}
}
