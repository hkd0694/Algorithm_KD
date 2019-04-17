package PB_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num <= 9 && num >= 1) {
			for(int i=1; i<=9;i++) {
				System.out.println(num + " * " + i + " = " + num*i);
			}
		}
	}

}
