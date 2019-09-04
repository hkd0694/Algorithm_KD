package PB_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int result = num1 * num2;
		
		int i = 0;
		
		while(i != 3) {
			int divide = num2 % 10;
			System.out.println(num1 * divide);
			num2 /= 10;
			i++;
		}
		
		System.out.println(result);

	}

}
