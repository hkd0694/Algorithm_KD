package PB_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	private static BigInteger factorial(int num) {
		BigInteger number = BigInteger.ONE;
		for(int i=1; i<=num;i++) number = number.multiply(BigInteger.valueOf(i));
		return number;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		BigInteger result = factorial(num);
		String asd = String.valueOf(result);
		
		int length = asd.length();
		int count = 0;
		
		while(length != 0) {
			if(asd.charAt(length-1) == '0') count++;
			else break;
			length--;
		}
		System.out.println(count);
	}
}
