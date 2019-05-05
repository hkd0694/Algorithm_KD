package PB_2631;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//LIS(최장 증가 수열)을 이용한 문제

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n];
		int[] array = new int[n];
		int ans = 0;
		
		for (int i = 0; i < n; i++) array[i] = Integer.parseInt(br.readLine());
		//(3,7,5,2,6,1,4) 가 들어온다면 
		for (int i = 0; i < n; i++) {
		    if (dp[i] == 0)dp[i] = 1;
		    for (int j = 0; j < i; j++) {
		        if (array[i] > array[j]) {
		            if (dp[i] < dp[j] + 1) {
		                dp[i] = dp[j] + 1;
		            }
		        }
		    }
		}
		//위의 예제로 한다면
		//최종 dp[7] = {1,2,2,1,3,1,2} 이 된다.
		//array[7] = {3,7,5,2,6,1,4}
		//LIS는 3,5,6이 된다. dp가 동일하다면 가장 길이가 긴 것이 LIS가 된다.
		for(int i=1;i<n;i++) {
		  if (ans < dp[i]) {
		    ans = dp[i];
		  }
		}
		//최종 배열길이 에서 LIS로 선택된 개수를 빼주면 최소 수가 된다.
		System.out.println(n - ans);
	}
}