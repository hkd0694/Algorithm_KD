package PB_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number = br.readLine();
		
		int arr[] = new int[number.length()];
		
		for(int i=0;i<number.length();i++) {
			char a = number.charAt(i);
			arr[i] = Integer.parseInt(String.valueOf(a));
		}
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]);

	}

}
