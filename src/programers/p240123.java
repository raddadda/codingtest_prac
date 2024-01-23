package programers;
import java.util.*;
public class p240123 {

	class Solution {
	    
	    public int solution(String s) {
	        int answer = 0;
	        Queue<Character> q = new LinkedList<>();
	        Stack<Character> stack = new Stack<>();
	        for(int i=0; i<s.length(); i++){
	            q.add(s.charAt(i));
	            stack.add(s.charAt(i));
	        }
	        for(int i=0; i<s.length(); i++){
	            if(q.isEmpty()==true){
	                break;
	            }
	            Character top = q.peek();
	            q.remove();
	  
	            if(stack.peek() == '{' && top=='}'){

	                answer++;
	            }
	            if(stack.peek() == '[' && top==']'){
	                answer++;
	            }
	            if(stack.peek() == '(' && top==')'){
	                answer++;
	            }
	            stack.push(top);
	        }
	        
	        return answer;
	    }
	}

}
