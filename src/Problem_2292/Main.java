package Problem_2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int result;
		int asd = 0;
		int resultcount = 0;
		
		if(test >=1 && test <=1000000000) {
		do {
			result = 1;
				resultcount++;
				for(int i=0;i<2;i++) {
					result *= count;
				}
				asd = 3*result + 3*count +1;
			
			count++;
		}while(test > asd);
		
		System.out.println(resultcount);
	}
		}

}
