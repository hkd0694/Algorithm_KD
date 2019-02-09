package Problem_10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n, x;
		int num, i;
		
		n = scanner.nextInt();
		x = scanner.nextInt();
		
		if ((n >= 1 && n <= 10000) || (x >= 1 && x <= 10000)) {
			for (i = 0; i < n; i++) {
				num = scanner.nextInt();
				if (num < x) {
					System.out.println(num);
				}
			}
			
		}
	}

}
