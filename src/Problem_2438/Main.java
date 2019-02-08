package Problem_2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i, j;
		int num;
		
		num = scanner.nextInt();
		
		for (i = 1; i <= num; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
