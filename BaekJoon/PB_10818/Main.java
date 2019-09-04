package PB_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = -1000001;
		int min = 1000001;
		
		for(int i=0;i<test;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(max < num) max = num;
			if(min > num) min = num;
		}
		
		System.out.println(min + " " + max);

	}

}
