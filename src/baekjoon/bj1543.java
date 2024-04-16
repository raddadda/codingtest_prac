package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1543 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String n2 = br.readLine();
		
		int size = n.length();
		int size2 = n2.length();
		n = n.replace(n2,"");

		System.out.println((size - n.length())/size2);
	
	}

}
