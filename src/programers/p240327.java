package programers;

public class p240327 {
	class Solution {
		//약수의 개수와 덧셈
	    public int solution(int left, int right) {
	        int answer = 0;
	        int cnt=0;
	        //약수를 구할때
	        //루트를 이용해서 탐색범위를 줄여 실행시간을 줄일 수 있다. O(n)-> O(루트n)
	        for(int i=left; i<=right; i++){
	            for(int j=1; j*j<=i; j++){
	                if(j*j==i){
	                    cnt++;
	                }else if(i%j==0){
	                    cnt+=2;
	                }
	            }
	            if(cnt%2==0){
	                answer+=i;
	            }else{
	                answer-=i;
	            }
	            cnt=0;
	        }
	        return answer;
	    }
	}
}
