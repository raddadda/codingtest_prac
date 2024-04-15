package programers;

public class p240415 {
	class Solution {
	    public String solution(String[] cards1, String[] cards2, String[] goal) {
	        int idx1 = 0; 
	        int idx2 = 0;
	        
	        // goal 배열 순회
	        for (String list : goal) {
	        	
	        	//goal배열 순회중 cards와 같은게 있다면 idx를 1더한다.
	            if (idx1 < cards1.length && list.equals(cards1[idx1])) {
	                idx1++;
	            } else if (idx2 < cards2.length && list.equals(cards2[idx2])) {
	                idx2++;
	            } else {
	                return "No"; 
	            }
	        }
	        
	        return "Yes";
	    }
	}
}
