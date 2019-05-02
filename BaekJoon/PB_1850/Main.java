package PB_1850;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		long M = Long.parseLong(st.nextToken());
		long N = Long.parseLong(st.nextToken());
		
		long M1 = M;
		long N1 = N;
		
		while(M1 != 0) {
			long div = N1 % M1;
			N1 = M1;
			M1 = div;
		}
		
		for(int i=1; i<= N1; i++) sb.append("1");
		
		bw.write(String.valueOf(sb));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
