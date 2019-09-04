package PB_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
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
