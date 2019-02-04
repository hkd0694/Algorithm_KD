package Problem_1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		long test = scanner.nextLong();
		long count;
		
		for(int i=0;i<test;i++) {
			long start = scanner.nextLong();
			long end = scanner.nextLong();
			long dis = end - start;
			long cnt = 0;
			long ans = 1;
			while(cnt<dis) {
				ans++;
				cnt+=(ans/2);
			}
			System.out.println(ans-1);
			}			
		}
	}
