package programers;

public class p240402 {
	class Solution {
		//3진법 뒤집기
	    public int solution(int n) {
	        int answer = 0;
	        String a = "";
	        //3진법으로 바꾸는법
	        while(n>0){
	            a = (n%3)+a;
	            n/=3;
	        }
	        a= new StringBuilder(a).reverse().toString();
	        //Integer.parseInt(String s, int redix); => 문자열(s)를 인자값으로 받으면 해당 진수의 Integer형으로 변환시켜주는 것이다.
	        
	        return Integer.parseInt(a,3);
	    }
	}
}
