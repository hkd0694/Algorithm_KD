package PB_10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		int arr[] = new int[26];
		
		for(int i=0;i<num.length();i++) {
			int d = num.charAt(i);
			arr[d-97]++;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
		br.close();
	}
}
