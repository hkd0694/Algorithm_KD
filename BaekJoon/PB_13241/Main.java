package PB_13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long M = Long.parseLong(st.nextToken());
		long N = Long.parseLong(st.nextToken());
		
		long M1 = M;
		long N1 = N;
		
		while(N1 != 0) {
			long div = M1 % N1;
			M1 = N1;
			N1 = div;
		}
		
		long result = M1 * (M/M1) * (N/M1);
		System.out.println(result);
	}
}
