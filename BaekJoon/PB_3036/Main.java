package PB_3036;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	private static int gcd(int a, int b) {
		int N1 = a; //두개의 수중 작은 수
		int M1 = b; //두개의 수중 큰 수
		//N1이 0이 될깨까지 while문을 돈다
		while(N1 != 0) {
			//M1을 N1으로 나누어주고 나머지를 div에 저장
			int div = M1%N1;
			//M1을 기존의 N1값으로 저장
			M1=N1;
			//N1을 위에서 구한 div에 값으로 저장
			N1=div;
		}
		//ex) 8 12가 들어오면 
		//N1 M1 -- 8 12
		//N1 M1 -- 4 8
		//N1 M1 -- 0 4
		//N1이 0이되면 while문을 종료시킨다. 
		//종료되면 저장되어 있는 M1의 값이 두값의 최대공약수가 된다.
		return M1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); //가장 첫번째로 주어진 수
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<test;i++) {
			//두번째부터 test까지의 수를 N에다가 하나씩 저장
			int N = Integer.parseInt(st.nextToken());
			//첫번째수와 N과의 최대공약수를 구하는 gcd 함수
			int gcd = gcd(Math.min(M, N),Math.max(M, N));
			//M과 N을 최대공약수로 나누어 몫을 StringBuilder에 저장
			sb.append(M/gcd +"/" + N/gcd +"\n");
		}
		//StringBuilder에 있는 것을 출력해준다.
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
}
