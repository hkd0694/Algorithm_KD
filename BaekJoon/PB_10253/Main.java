package PB_10253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static long result(long bunja, long bunmo) {
		long j = 0;
		if(bunmo%bunja == 0) j = 1;
		else j = bunmo/bunja+1;
		return j;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0;i<test;i++) {
			st = new StringTokenizer(br.readLine());
			long bunja = Long.parseLong(st.nextToken());
			long bunmo = Long.parseLong(st.nextToken());
			
			while(bunja != 1) {
				long ki = result(bunja,bunmo);
				if(ki == 1) {
					bunmo = bunmo/bunja;
					break;
				}
				long bunmoInte = ki * bunmo;
				long bunjaInte = (bunmoInte/bunmo) * bunja - (bunmoInte/ki)*1;
				
				bunmo = bunmoInte;
				bunja = bunjaInte;
				
			}
			System.out.println(bunmo);
		}
	}
}
