package programers;

public class p240418 {
	class Solution {
		//덧칠하기
	    public int solution(int n, int m, int[] section) {
	        int answer = 0;
	        
	        int tmp = 1;
	        
	        //처음에는 while문으로 했더니 시간초과가 났다. 나중에 한번 더 풀어봐야할 것.
	        //그리디알고리즘을 통해 해결 할 수 있다.
	        for (int i = 0; i < section.length; i++) {
	            if (tmp <= section[i]) {
	                answer += 1;
	                tmp = section[i] + m;
	            }
	        }
	        
	        return answer;
	    }
	}
}
