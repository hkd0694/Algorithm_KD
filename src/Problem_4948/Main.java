package Problem_4948;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int go = 2;
		int result = 0;
		
		for(;;) {
			result = 0;
			int number = scanner.nextInt();
			if(number == 0) break;
			boolean array[] = new boolean[number*2];
			array[0] = true;
			if(number == 1) {
				System.out.println(1);
				continue;
			}
			go = 2;
			for(int i=number+1;i<=number*2;i++) {
				count = 0;
				for(int j=1;j<=array.length;j++) {
					if(count == 0) {
						count++;
						continue;
					}
					if(array.length <= go*j-1) break;
					else {
						array[go*j-1] = true;
					}
				}
				go++;
			}
			
			for(int x=number+1;x<=number*2;x++) {
				if(array[x-1] == false)  result++;
			}
			System.out.println(result);
		}
	}
}
