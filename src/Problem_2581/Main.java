package Problem_2581;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int min = 10001;
		int sum = 0;
		int count = 0;
		int so;
		
		if(M <= 10000 && N <= 10000 && M<=N) {
			for(int i=M;i<=N;i++) {
				so = 0;
				if(i==1) {
					continue;
				} else {
					for(int j=i;j>0;j--) {
						if(i%j==0) so++;
					}
					if(so == 2) {
						sum+=i;
						count++;
						if(min > i)min = i;
					}
				}
			}
			
			if(count == 0) {
				System.out.println(-1);
			} else {
				System.out.println(sum);
				System.out.println(min);
			}
		}
	}

}
