package PB_3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//택시 기하학 공식만 잘알면 쉬운문제;;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int radius = Integer.parseInt(br.readLine());
		
		double pi = Math.PI;

		System.out.printf("%.6f\n", radius*radius*pi);
		System.out.printf("%.6f", radius*radius*2.0);
		
		br.close();
	}

}
