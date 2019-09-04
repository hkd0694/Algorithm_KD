package PB_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = -1;
		int count = 0;
		for(int i=1;i<=9;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(max < num) {
				max = num;
				count = i;
			}
		}
		
		System.out.println(max);
		System.out.println(count);

	}

}
