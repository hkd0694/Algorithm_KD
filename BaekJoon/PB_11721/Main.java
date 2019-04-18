package PB_11721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		String len = br.readLine();
		int i=0;
		while(i != len.length()) {
			sb.append(String.valueOf(len.charAt(i)));
			i++;
			if(i%10 == 0) {
				sb.append("\n");
			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
}
