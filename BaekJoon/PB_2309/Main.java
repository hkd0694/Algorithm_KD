package PB_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		
		boolean check[] = new boolean[9];
		
		int i = 0;
		int j = 1;
		int count = 0;
		while(count != 36) {
			int sumA = sum;
			if(sumA - arr[i] - arr[j] == 100) {
				check[i] = true;
				check[j] = true;
				break;
			}
			j++;
			if(j == 9) {
				i++;
				j=i+1;
			}
			count++;
		}
		for(int k=0;k<arr.length;k++) {
			if(!check[k]) System.out.println(arr[k]);
		}
	}
}
