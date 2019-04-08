package Problem_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0;i<test;i++) {
			String num = br.readLine();
			System.out.print(num.charAt(0));
			System.out.println(num.charAt(num.length()-1));
		}
	}
}
