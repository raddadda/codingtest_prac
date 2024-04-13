package programers;

public class p240413 {
	class Solution {
		//푸드파이트 대회
	    public String solution(int[] food) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i=0; i<food.length; i++){
	            int cnt=food[i]/2;
	            //String.valueOf()를 통해 문자열로 변환, repeat메서드로 반복시킨다.
	            
	            sb.append(String.valueOf(i).repeat(cnt));
	            
	        }
	        //stringbuilder의 reverse()메서드를 이용하면 간단하게 문자열을 반대로 할 수 있다.
	        String answer = sb + "0";
	        answer += sb.reverse();
	        
	        /**
	        
	        처음에는 while문으로 복잡하게 했는데 StringBuilder의 메서드로 코드를 간결하게 할 수 있다는 것을 배웠다.
	        
	        
	        */
	        return answer;
	    }
	}
}
