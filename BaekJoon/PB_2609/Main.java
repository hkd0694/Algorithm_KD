package PB_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int M1 = M;
		int N1 = N;
		
		while(N1 != 0) {
			int div = M1 % N1;
			M1 = N1;
			N1 = div;
		}
		
		int result = M1 * (M/M1) * (N/M1);
		System.out.println(M1);
		System.out.println(result);
	}
}
