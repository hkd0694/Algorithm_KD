package Problem_1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		
		int minW=0,minH=0;
		
		if(x>=1 && y>=1) {
			int windex = w/2;
			int hindex = h/2;
			
			if(windex >= x) {
				minW = x;
			} else {
				minW = w-x;
			}
			if(hindex >= y) {
				minH = y;
			} else {
				minH = h-y;
			}
		}
		if(minH>=minW) System.out.println(minW);
		else System.out.println(minH);
	}

}
