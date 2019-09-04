package PB_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean arr[] = new boolean[42];
		int count = 0;
		
		for(int i=0;i<10;i++) {
			int num = Integer.parseInt(br.readLine());
			
			int div = num % 42;
			
			if(!arr[div]) {
				arr[div] = true;
				count++;
			}
		}		
		System.out.println(count);
	}
}
