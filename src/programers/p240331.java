package programers;
import java.util.Scanner;

public class p240331 {
	class Solution {
		//직사각형 별찍기
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for(int i=0; i<b; i++){
	            for(int j=0; j<a; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	      //Scanner를 쓸때는 sc.nextInt(); 이용한다. 
	    }
	}
}
