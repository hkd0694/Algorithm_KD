package PB_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int div(int num1,int num2) {
		boolean check = true;
		
		for(int i=1;i<=num2/2; i++) {
			if(num2 % i == 0 && i == num1) {
				check = false;
				break;
			}
		}
		
		if(!check) return 1;
		
		return 0;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());

			if(num1 == 0 && num2 == 0) break;
			
			int count = 0;
			
			count = div(num1,num2);
			
			if(num1 % num2 == 0) count = 2;
			
			if(count == 0) System.out.println("neither");
			else if (count == 1) System.out.println("factor");
			else System.out.println("multiple");
			
		}
	}
}
