package PB_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			String arr[] = input.split(" ");
			if(arr.length == 2) {
				System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			} else {
				break;
			}
		}

	}

}
