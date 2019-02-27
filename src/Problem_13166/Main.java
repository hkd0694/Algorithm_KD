package Problem_13166;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		for(int i=0;i<test;i++) {
			int friend1 = scanner.nextInt();
			int number1 = scanner.nextInt();
			int friend2 = scanner.nextInt();
			int number2 = scanner.nextInt();
			if((friend1 >= 1 && friend1 <test*2) && (friend2 >= 1 && friend2 <test*2)) {
				System.out.println("dd");
			}
		}
		
		System.out.println(9);
		
	}
}
