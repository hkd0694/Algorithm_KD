package PB_15596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	public static long sum(long arr[]) {
		long result = 0;
		for(int i=0;i<arr.length;i++) result += arr[i];
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		long arr[] = new long[test];
		long t = sum(arr);		
		System.out.println(t);
	}
}
