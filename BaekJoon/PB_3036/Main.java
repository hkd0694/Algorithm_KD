package PB_3036;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	private static int gcd(int a, int b) {
		int M1 = a;
		int N1 = b;
		while(M1 != 0) {
			int div = N1%M1;
			N1=M1;
			M1=div;
		}
		return N1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<test;i++) {
			int N = Integer.parseInt(st.nextToken());
			int ok = gcd(N,M);
			
			sb.append(M/ok +"/" + N/ok +"\n");
		}
		
		bw.write(String.valueOf(sb));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
