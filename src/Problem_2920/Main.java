package Problem_2920;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[8];
		int count = 0;
		for(int i=0;i<array.length;i++) {
			array[i] = scanner.nextInt();
			if(array[i] == i+1) {
				count++;
			}else if(i + array[i] == array.length) {
				count--;
			}
		}
		
		if(count == 8) {
			System.out.println("ascending");
		} else if(count == -8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
	}
}