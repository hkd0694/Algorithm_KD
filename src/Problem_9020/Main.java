package Problem_9020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int count = 0;
		for(int i=0;i<test;i++) {
			int number = scanner.nextInt();
			if(number%2==0 && number > 2) {
				int[] numArray = new int[number];
				numArray[0] = 1;
				for(int j=2;j<=number/2;j++) {
					count = 0;
					for(int z=1; z<number;z++) {
						if(count== 0) {
							count++;
							continue;
						}
						count = j *z-1;
						if(numArray.length > count) {
							numArray[count] = 1; 
						}else {
							break;
						}
					}
				}
				
				int result = number /2;
				
				for(int a=result; a>0;a--) {
					if(numArray[a-1] == 0 && numArray[number-a-1] == 0) {
						System.out.println(Integer.toString(a) + " " + Integer.toString(number-a));
						break;
					}
				}
			}
		}
	}
}
