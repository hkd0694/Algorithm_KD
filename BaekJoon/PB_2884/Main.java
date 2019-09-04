package PB_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		int Rminute;
		
		if(minute >= 45) {
			Rminute = minute - 45;
			System.out.println(hour + " " + Rminute);
		} else {
			hour--;
			if(hour < 0) hour = 23;
			Rminute = 60 + minute - 45;
			System.out.println(hour + " " + Rminute);
		}
	}
}
