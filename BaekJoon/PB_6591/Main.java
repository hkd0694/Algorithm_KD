package PB_6591;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	private static void union(long C, long K) {
		
		BigInteger result = BigInteger.ONE;
		BigInteger bun = BigInteger.ONE;
		
		if(C - K > K) {
			for(long i=C;i>=1;i--) {
				if(C-K  == i) break;
				result = result.multiply(BigInteger.valueOf(i));
			}
			for(long j=K;j>=1;j--) bun = bun.multiply(BigInteger.valueOf(j));
		} else {
			for(long i=C;i>=1;i--) {
				if(K == i) break;
				result = result.multiply(BigInteger.valueOf(i));
			}
			for(long j=C-K;j>=1;j--) bun = bun.multiply(BigInteger.valueOf(j));
		}
		BigInteger a = result.divide(bun);
		System.out.println(a);
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken());
			long k = Long.parseLong(st.nextToken());
			if(n == 0 && k== 0) break;
			union(n,k);
		}
	}
}
