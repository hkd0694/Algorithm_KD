package PB_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0;i<test;i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int result1, result2;
			
			if(num1 > num2) {
				result1 = num2; result2 = num1;
			} else {
				result1 = num1; result2 = num2;
			}
			
			while(result1 != 0) {
				int a = result2%result1;
				result2 = result1;
				result1 = a;
			}
			
			int result = result2 * (num1/result2) * (num2/result2);		
			System.out.println(result);
		}
		br.close();
	}
}
