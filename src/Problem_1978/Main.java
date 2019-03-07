package Problem_1978;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int count = 0;
		int so = 0;
		
		for(int i=0;i<test;i++) {
			int number = scanner.nextInt();
			so = 0;
			if(number == 1) {
				continue;
			} else {
				for(int j=number;j>=1;j--) {
					if(number%j==0)
						so++;
				}
			}
			if(so == 2) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
