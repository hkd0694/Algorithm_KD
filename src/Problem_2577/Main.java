package Problem_2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int[] number = new int[10];
		int result = a * b * c;
		
		
		while(result > 0) {
			int re = result%10;
			number[re]++;
			result = result/10;
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}		
	}
}
