package Problem_11050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int C = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int result = 1;
		int bun = 1;
		if(C - K > K) {
			for(int i=C;i>=1;i--) {
				if(C-K  == i) break;
				result *=i;
			}
			for(int j=K;j>=1;j--) bun *=j;
		} else {
			for(int i=C;i>=1;i--) {
				if(K == i) break;
				result *=i;
			}
			for(int j=C-K;j>=1;j--) bun *=j;
		}
		System.out.println(result/bun);	  
	}
}
