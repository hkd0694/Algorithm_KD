package PB_1000;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int x = System.in.read()-'0';
		System.in.read();
		int y = System.in.read()-'0';		
		System.out.println(x+y);
	}
}
