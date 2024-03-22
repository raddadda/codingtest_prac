package programers;
import java.util.*;
public class p240322 {
	
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	    	//핸드폰 번호 가리기
	        int[] answer = Arrays.stream(arr).filter(factor->factor%divisor==0).toArray();
	        if(answer.length == 0){
	            answer = new int[] {-1};
	        }
	        Arrays.sort(answer);
	        
	        
	        /**
	         *다른사람 풀이
	         *toCharArray() 는 String을 char배열로 바꿔주는 메서드
			char[] ch = phone_number.toCharArray();
			for(int i=0; i<ch.length-4; i++){
				ch[i]='*';
			}
			return String.valueOf(ch);
	         */
	        
	        return answer;
	        
	        
	    }
	}
}
