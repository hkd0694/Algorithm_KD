package Problem_10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		BigInteger number = scanner.nextBigInteger();
		BigInteger number1 = scanner.nextBigInteger();
		
		number = number.add(number1);
		
		System.out.println(number);
		
	}

}
