package programers;
import java.util.*;
public class p240403 {
	class Solution {
		//예산
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        for(int var : d){
	            if(budget<var){
	                break;
	            }
	            budget-=var;
	            answer++;
	        }
	        
	        return answer;
	    }
	}
}
