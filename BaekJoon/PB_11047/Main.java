package PB_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[count];
		
		for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(br.readLine());
		
		
		int k = arr.length-1;
		int money = 0;
		
		while(num != 0) {
			if(arr[k] > num) {
				k--; 
				continue;
			} else {
				num -=arr[k];
				money++;
			}
		}
		
		System.out.println(money);
	}
}
