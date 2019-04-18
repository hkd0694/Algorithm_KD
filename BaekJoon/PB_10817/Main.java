package PB_10817;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if ((a >= 1 && a <= 100) || (b >= 1 && b <= 100) || (b >= 1 && b <= 100)) {
			if (a >= b && b <= c) {
				if (a >= c) {
					System.out.println(c);
				}
				else {
					System.out.println(a);
				}
			}
			else if (b >= c && c <= a) {
				if (b >= a) {
					System.out.println(a);
				}
				else {
					System.out.println(b);
				}
			}
			else if (b >= a && a <= c) {
				if (b >= c) {
					System.out.println(c);
				}
				else {
					System.out.println(b);
				}
			}
		}
		
	}

}
