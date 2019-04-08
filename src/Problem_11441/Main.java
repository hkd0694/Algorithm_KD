package Problem_11441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[test];
		
		for(int i=0;i<test;i++) array[i] = Integer.parseInt(st.nextToken());
		
		int num = Integer.parseInt(br.readLine());
		
		for(int j=0;j<num;j++) {
			StringTokenizer number = new StringTokenizer(br.readLine());
			int sum = 0;
			int num1 = Integer.parseInt(number.nextToken());
			int num2 = Integer.parseInt(number.nextToken());
			
			for(int z = num1-1;z<num2;z++) {
				sum += array[z];
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}
}
