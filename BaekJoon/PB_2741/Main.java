package PB_2741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num <= 100000) {
			for(int i=1;i<=num;i++) System.out.println(i);
		}
		
		br.close();

	}

}
