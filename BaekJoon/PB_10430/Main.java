package PB_10430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		
		if(num1 >= 2 && num3 <= 10000) {
			System.out.println((num1+num2)%num3);
			System.out.println((num1%num3 + num2%num3)%num3);
			System.out.println((num1*num2)%num3);
			System.out.println((num1%num3 * num2%num3) % num3);
		}
	}
}
