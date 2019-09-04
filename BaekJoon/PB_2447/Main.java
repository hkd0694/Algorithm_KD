package PB_2447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();
		
	public static void star(int num, int i, int j) {
		
		if((i/num) %3 == 1 && (j/num)%3 == 1) {
			sb.append(" ");
		}
		else {
			if(num/3 == 0) {
				sb.append("*");
			}
			else star(num/3,i,j);
		}
	} 

	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				star(n,i,j);
			}
			sb.append("\n");
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		
	}
}
