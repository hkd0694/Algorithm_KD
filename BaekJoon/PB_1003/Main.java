package PB_1003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		
		int [][] fibo = new int[41][2];
		fibo[0][0] = 1;
		fibo[1][1] = 1;
		//첫번 쨰 항의 1과 0의 개수는 1 0
		//두번 째 항의 1과 0의 개수는 0 1
		for(int i=2;i<41;i++) {
			for(int j=0;j<2;j++) {
				//N번째 수의 1의 개수는 N-1의 1개수와 N-2의 1개수를 합한 것
				//N번째 수의 0의 개수는 N-1의 0개수와 N-2의 0개수를 합한 것
				fibo[i][j] = fibo[i-1][j] + fibo[i-2][j];
			}
		}
		//규칙만 찾으면 쉽게 풀수있다...
		//재귀함수를 쓸때 동적계획법을 쓰지 않게 되면 시간 초과 뜸!! 굉장히 오래걸림 중복해서 계산한 값들이 엄청 많음
		for(int i=0;i<test;i++) {
			int num = Integer.parseInt(br.readLine());
			bw.write(fibo[num][0] + " " + fibo[num][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
