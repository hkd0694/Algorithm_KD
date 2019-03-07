package Problem_1929;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int so = 1;
		int count = 0;
		
		int array[] = new int[N];
		
		array[0] = 1;
		
		for(int j=2;j<=N/2;j++) {
			count = 0;
			for(int i=1;i<N;i++) {
				if(count ==0) {
					count++;
					continue;
				}
				count = i*j-1;
				if(array.length > count) {
					array[count] = 1; 
				}else {
					break;
				}
			}
		}
		
		for(int x=M-1;x<N;x++) {
			if(array[x] == 0)
				System.out.println(x+1);
		}
		
	}
}
