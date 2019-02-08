package Problem_2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int Nnum1=0,Nnum2=0;
		
		do {
			Nnum1 += num1 %10;
			Nnum2 += num2 %10;
			Nnum1 *=10;
			Nnum2 *=10;
			num1 /=10;
			num2 /=10;
		}while(num1 > 0 && num2 >0);
		
		Nnum1 /=10;
		Nnum2 /=10;
		
		if(Nnum1 > Nnum2) {
			System.out.println(Nnum1);
		}else {
			System.out.println(Nnum2);
		}
		
	}
}