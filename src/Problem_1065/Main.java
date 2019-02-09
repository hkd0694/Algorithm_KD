package Problem_1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int count = 0;
		
		if(number <=1000) {
			for(int i=1;i<=number;i++) {
				if(hansu(i) == true){
					count ++;
				}
			}
			System.out.println(count);
		}

	}
	
	public static boolean hansu(int number) {
		
		if(number <100) {
			return true;
		}
		else {
			int a = number /100;
			int b = number %100 /10;
			int c = number %10;
			if(c-b == b-a) {
				return true;
			} else {
				return false;
			}
		}		
	}

}