package PB_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[num];
		
		for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int i = 0;
		int sum = 0;
		while(i != arr.length) {
			for(int j=0;j<=i;j++) {
				sum += arr[j];
			}
			i++;
		}
		
		System.out.println(sum);

	}

}
