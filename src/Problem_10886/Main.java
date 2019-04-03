package Problem_10886;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		int True = 0;
		int False = 0;
		
		for(int i=0; i<test;i++) {
			int bool = Integer.parseInt(br.readLine());
			if(bool == 1) True++;
			else False++;
		}
		
		if(True > False) bw.write("Junhee is cute!");
		else bw.write("Junhee is not cute!");
		
		bw.flush();
		bw.close();
	}

}
