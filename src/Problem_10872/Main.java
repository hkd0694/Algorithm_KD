package Problem_10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int fact = scanner.nextInt();
		
		int result = 1;
		
		for(int i = fact; i>=1;i--) {
			result *= i;
		}
		
		System.out.println(result);
		
	}

}
