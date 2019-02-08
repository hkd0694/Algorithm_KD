package Problem_2750;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int[] numArray = new int[num];
		int temp;
		
		for(int i=0;i<num;i++) {
			numArray[i] = scanner.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(numArray[i] > numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(numArray[i]);
		}
		
	}

}
