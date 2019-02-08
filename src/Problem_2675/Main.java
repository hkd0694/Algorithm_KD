package Problem_2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i=0;i<test;i++) {
			int rep = scanner.nextInt();
			String word = scanner.next();
			
			for(int j=0;j<word.length();j++) {
				char a = word.charAt(j);
				for(int z=0;z<rep;z++) {
					System.out.print(a);
				}
			}
			System.out.println();
		}
		
	}
}