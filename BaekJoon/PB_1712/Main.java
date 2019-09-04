package PB_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long fix = Long.parseLong(st.nextToken());
		long change = Long.parseLong(st.nextToken());
		long price = Long.parseLong(st.nextToken());
		
		if(change >= price) System.out.println(-1);
		else {
			long ch = fix + change;
			long result = 0;
			long count = 0;
			while(ch >= result) {
				count ++;
				ch = fix + (change * count);
				result += price;
			}
			System.out.println(count);
		}
	}
}
