package Problem_10773;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		int array[] = new int[test];
		int count = 0;
		
		for(int i=0;i<test;i++) {
			int number = scanner.nextInt();
			if(number == 0) {
				count--;
				if(array[count] == 0) {
					continue;
				} else {
					array[count] = 0;
				}
			} else {
				if(count < 0) {
					count = 0;
				}
				array[count] = number;
				count++;
			}
		}
		int sum = 0;
		for(int j=0;j<count;j++) {
			sum+=array[j];
		}
		
		System.out.println(sum);
		
	}

}
