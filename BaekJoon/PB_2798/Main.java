package PB_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken());
		int Maxnum = Integer.parseInt(st.nextToken());
		
		
		int arr[] = new int[count];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int i=0,j=0,k=0;
		int sum = 0;
		for(i=0;i<arr.length-2;i++) {
			j = i+1;
			for(;j<arr.length-1;j++) {
				k = j+1;
				for(;k<arr.length;k++) {
					sum = arr[i] + arr[j] +arr[k];
					if(sum > max && sum <=Maxnum) max = sum;
					sum = 0;
				}
			}
		}
		
		System.out.println(max);
		
	}
}
