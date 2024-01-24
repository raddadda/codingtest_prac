package programers;
import java.util.*;
public class p240123 {

	class Solution {
	    
	    public int solution(String s) {
	        int answer = 0;
	        Queue<Character> q = new LinkedList<>();
	       
	        for(int i=0; i<s.length(); i++){
	            q.add(s.charAt(i));
	        }
	        for(int i=0; i<s.length(); i++){
	            Character r = q.remove();
	            q.add(r);
	             Stack<Character> stack = new Stack<>();
	            for(int j=0; j<s.length(); j++){
	                Character l = q.remove();
	                q.add(l);
	                if(stack.isEmpty()){
	                    stack.push(l);
	                }
	                else if(l == ']' && stack.peek() == '['){
	                    stack.pop();
	                }
	                else if(l == '}' && stack.peek() == '{'){
	                    stack.pop();
	                }
	                else if(l == ')' && stack.peek() == '('){
	                    stack.pop();
	                }else{
	                    stack.push(l);
	                }
	            
	            }
	            if(stack.isEmpty()){
	                answer++;
	            }
	            
	        }
	        return answer;
	    }
	}

}
