package PB_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//점화식을 잘세우면 쉬운 문제;;;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int dp[] = new int[number+1];
		
		for(int i=2;i<=number;i++) {
			dp[i] = dp[i-1] +1;
			if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
		}
		
		System.out.println(dp[number]);
		
		br.close();
	}
}
