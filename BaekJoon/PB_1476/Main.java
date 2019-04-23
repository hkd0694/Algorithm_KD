package PB_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ECount = 0;
		int SCount = 0;
		int MCount = 0;
		int result = 0;
		while(true) {
			ECount++;
			SCount++;
			MCount++;
			result++;
			if(ECount > 15) ECount = 1;
			if(SCount > 28) SCount = 1;
			if(MCount > 19) MCount = 1;
			if(ECount == E && SCount == S && MCount == M) break;
		}
		System.out.println(result);
	}
}
