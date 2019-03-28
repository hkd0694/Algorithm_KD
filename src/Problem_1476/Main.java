package Problem_1476;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int E = scanner.nextInt();
		int S = scanner.nextInt();
		int M = scanner.nextInt();
		
		int ECount = 0;
		int SCount = 0;
		int MCount = 0;
		int result = 0;
		while(true) {
			
			ECount++;
			SCount++;
			MCount++;
			result++;
			
			if(ECount >15) ECount = 1;
			
			if(SCount >28) SCount = 1;
			
			if(MCount >19) MCount = 1;
			
			if(ECount == E && SCount == S && MCount == M) break;
			
		}
		
		System.out.println(result);

	}

}
