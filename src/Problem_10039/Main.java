package Problem_10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		int[] grade = new int[5];
		
		for(int i=0; i<grade.length;i++) {
			grade[i] = scanner.nextInt();
			
			if(grade[i] <40) {
				sum +=40;
			}else {
				sum +=grade[i];
			}
			
		}
		System.out.println(sum/5);
		
	}
}