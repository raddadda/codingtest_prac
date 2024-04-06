package programers;

public class p240406 {
	class Solution {
		//최소직사각형
	    public int solution(int[][] sizes) {
	        int answer = 0;
	        for(int i=0; i<sizes.length; i++){
	            if(sizes[i][0]<sizes[i][1]){
	                int tmp = sizes[i][0];
	                sizes[i][0]= sizes[i][1];
	                sizes[i][1]= tmp;
	            }
	        }
	        int left=0;
	        int right=0;
	        for(int i=0; i<sizes.length; i++){

	            left = Math.max(sizes[i][0],left);
	            right = Math.max(sizes[i][1],right);
	        }
	        answer = left*right;
	        return answer;
	    }
	}
}
