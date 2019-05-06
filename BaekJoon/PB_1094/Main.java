package PB_1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bar = Integer.parseInt(br.readLine());
		
		int d = 64;
		int arr[] = new int[64];
		int arrIndex = 0;
		arr[arrIndex] = d;
		while(true) {
			int sum = 0;
			for(int i=0;i<=arrIndex;i++) sum += arr[i];
			
			
			if(sum > bar) {
				d /= 2;
				arr[arrIndex] = d;
			} else {
				d /= 2;
				arr[++arrIndex] = d;
			}
			
			if(sum == bar) break;
		}
		System.out.println(arrIndex);
	}
}
