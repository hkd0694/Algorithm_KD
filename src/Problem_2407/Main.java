package Problem_2407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int C = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		BigInteger result = BigInteger.ONE;
		BigInteger bun = BigInteger.ONE;
		
		if(C - K > K) {
			for(int i=C;i>=1;i--) {
				if(C-K  == i) break;
				result = result.multiply(BigInteger.valueOf(i));
			}
			for(int j=K;j>=1;j--) bun = bun.multiply(BigInteger.valueOf(j));
		} else {
			for(int i=C;i>=1;i--) {
				if(K == i) break;
				result = result.multiply(BigInteger.valueOf(i));
			}
			for(int j=C-K;j>=1;j--) bun = bun.multiply(BigInteger.valueOf(j));
		}
		BigInteger a = result.divide(bun);
		System.out.println(a);	
		br.close();
	}
}
