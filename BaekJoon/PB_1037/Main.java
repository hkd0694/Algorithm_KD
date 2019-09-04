package PB_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long arr[] = new long[N];
		
		for(int i=0;i<arr.length;i++) arr[i] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);
		
		long result = arr[0] * arr[arr.length-1];
		
		System.out.println(result);
		

	}

}
