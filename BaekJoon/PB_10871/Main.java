package PB_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		if((N>=1 && N <= 10000) || (X >= 1 && X <= 10000)) {
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				int num = Integer.parseInt(st.nextToken());
				if(num < X) System.out.print(num + " ");
			}
		}
	}
}
