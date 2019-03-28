package Problem_2748;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long test = scanner.nextInt();
		
		long F0 = 0;
		long F1 = 1;
		long F = 0;
		int count = 2;
		
		if(test >= 0 && test <=90) {
			if(test == 0) System.out.println(0);
			else if(test == 1) System.out.println(1);
			else if(test == 2) System.out.println(1);
			else {
				do {
					F = F0+F1;
					F0 = F1;
					F1 = F;
					count++;
				}while(count != test);
				System.out.println(F0+F1);
			}
		}
	}
}
