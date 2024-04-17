package programers;
import java.util.*;

public class p240417 {
	class Solution {
		//과일 장수
	    public int solution(int k, int m, int[] score) {
	        int answer = 0;
	        int min= Integer.MAX_VALUE;
	        List<Integer> list = new ArrayList<>();
	        for(int var : score){
	            list.add(var);
	        }
	        Collections.sort(list);
	        Collections.reverse(list);
	        int cnt=0;
	        int sum=0;
	        for(int var : list){
	            cnt++;
	            min=Math.min(min,var);
	            if(cnt==m){
	                sum+=min*m;
	                cnt=0;
	                min= Integer.MAX_VALUE;
	            }
	        }
	        answer=sum;
	        return answer;
	    }
	}
}
