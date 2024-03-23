package programers;
import java.util.*;
public class p240323 {

	class Solution {
		//제일 작은 수 제거하기
	    public int[] solution(int[] arr) {
	       if(arr.length==1){
	            int[] answer= {-1};
	            return answer;
	        }
	       //기존 방법으로 풀기
//	         int min = arr[0];
//	         int[] answer = new int[arr.length-1];
//	         for(int i=0; i<arr.length; i++){
//	             min = Math.min(min,arr[i]); 
//	         }
	       

	       
	       
//	         int idx =0;

//	        for(int i=0; i<arr.length; i++){
//	             if(min == arr[i]){
//	                 continue;
//	             }else{
//	             	answer[idx++] = arr[i];
//	             }
//	         }
	       
	       //stream으로 풀기
	       
	        int min = Arrays.stream(arr).min().getAsInt();
	        int[] answer = Arrays.stream(arr).filter(factor->factor!=min).toArray();
	       
	        
	        return Arrays.stream(arr).filter(i->i!=min).toArray();
	       
	    }
	}
}
