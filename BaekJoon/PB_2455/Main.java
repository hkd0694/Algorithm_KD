package PB_2455;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int result = 0;
		int max = 0;
		for(int i=0;i<4;i++) {
			st = new StringTokenizer(br.readLine());
			result -= Integer.parseInt(st.nextToken());
			result += Integer.parseInt(st.nextToken());
			
			if(max < result) max = result;
		}
		
		System.out.println(max);
		
		br.close();

	}

}
