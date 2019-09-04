package PB_2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int num = 2;
		
		
		int i = 1;
		int count = 1;
		while(test+1 != i) {
			num+=count;
			count *=2;
			i++;
		}
		
		int result = num * num;
		
		System.out.println(result);
		

	}

}
