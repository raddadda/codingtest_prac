package programers;

public class p240414 {
	class Solution {
		//숫자 문자열과 영단어
	    public int solution(String s) {
	        int answer = 0;
	        String str = s;
	        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};

	        for(int i=0; i<num.length; i++){
	                str=str.replace(num[i],""+i+"");
	        }
	        //처음에replac메서드를 사용한 문자열이 반영이 안되어 오류가 났다.
	        //원인은 해당 문자열을 초기화 시켜주는 것을 하지않았던것이다.
	        answer = Integer.parseInt(str);
	        return answer;
	    }
	}
}
