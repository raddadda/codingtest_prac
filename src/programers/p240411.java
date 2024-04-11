package programers;
import java.util.*;
public class p240411 {
	//두개 뽑아서 더하기
	class Solution {
	    public ArrayList<Integer> solution(int[] numbers) {
	        
	        HashSet<Integer> set = new HashSet<>();
	        for(int i=0; i<numbers.length; i++){
	            for(int j=i+1; j<numbers.length; j++){
	                set.add(numbers[i]+numbers[j]);
	            }
	             
	        }
	        //set을 list로 바꾸기
	        ArrayList<Integer> answer = new ArrayList<>(set);
	        Collections.sort(answer);
	        return answer;
	    }
	}
}
