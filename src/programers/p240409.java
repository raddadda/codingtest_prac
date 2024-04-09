package programers;
import java.util.*;

public class p240409 {
	class Solution {
		//문자열 내 마음대로 정렬하기
		
	    public String[] solution(String[] strings, int n) {
	        String[] answer = strings;
	        Arrays.sort(answer);
	        //람다를 이용해서 정렬한다.
	        //integer와 사용하는 방법이 조금 다르다 Arrays.sort(arr,(a,b)->a-b))
	        
	        Arrays.sort(answer,Comparator.comparing((s)->s.substring(n,n+1)));

	        
	        return answer;
	    }
	}
}
