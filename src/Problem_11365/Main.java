package Problem_11365;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String index = scanner.nextLine();
			if(index.length() < 500) {
				if(index.equals("END")) break;
				else {
					for(int i=index.length()-1;i>=0;i--) {
						System.out.print(index.charAt(i));
					}
				}
				System.out.println();
			}
		}
	}
}
