package PB_11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(num != 1) {
			int i = 2;
			for(;i<=num;i++) {
				if(num % i == 0) {
					sb.append(i+"\n");
					break;
				}
			}
			num /=i;
		}

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		
	}

}
