package Problem_8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int sum;
		int plus;
		
		for(int i=0;i<num;i++) {
			String ox = scanner.next();
			sum = 0; plus = 1;
			for(int j=0;j<ox.length();j++) {
				char al = ox.charAt(j);
				if(al == 'O') {
					sum +=plus;
					plus++;
				}else if(al == 'X'){
					plus = 1;
				}
			}
			System.out.println(sum);
		}
	}
}