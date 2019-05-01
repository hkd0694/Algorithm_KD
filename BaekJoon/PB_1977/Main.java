package PB_1977;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int num = 1;
		int sum = 0;
		int min = 100001;
		while(true) {
			int result = num*num;			
			if(result >= M && result <= N) {
				sum += result;
				if(min > result) min = result;
			}
			if(result > N) break;
			num++;
		}
		
		if(sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
