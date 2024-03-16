package programers;
import java.util.*;
public class p240316 {
	class Solution {
	    public long solution(long n) {
	        StringBuilder sb = new StringBuilder();
	         long answer = 0;

	        String[] arr = String.valueOf(n).split("");
	        Arrays.sort(arr);
	        for(String str : arr){
	            sb.append(str);
	        }
//	         String str = ""+n;
//	         int[] arr = new int[str.length()];
//	         for(int i=0; i<str.length(); i++){
//	             arr[i]=(int)(n%10);
//	         }
//	         Arrays.sort(arr);
//	         for(int num : arr){
	            
//	         }
	        answer = Long.parseLong(sb.reverse().toString());
	        return answer;
	    }
	}
}
