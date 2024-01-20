package programers;
import java.util.*;

public class p240120 {

	class Solution {
	    public int solution(int k, int[] tangerine) {
	        int answer = 0;
	        
	        int arr[] = new int[tangerine.length];
	        
	        for(int i=0; i<tangerine.length; i++){
	            arr[tangerine[i]]++;
	        }
	        Arrays.sort(arr);
	        
	        int tmp=0;
	        for(int i=tangerine.length-1; i>=0; i--){
	            if(tmp>=k){
	                break;
	            }
	            tmp+=arr[i];
	            answer++;
	        }
	        return answer;
	    }
	}
}
