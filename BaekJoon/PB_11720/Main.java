package PB_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		String number = br.readLine();
		
		if(number.length() == num) {
			int i = 0;
			while(i != num) {
				sum += Integer.parseInt(String.valueOf(number.charAt(i)));
				i++;
			}
			System.out.println(sum);
		}
	}
}
