package PB_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int result = 0;
		for(int i=666;i<10000000;i++) {
			String a = String.valueOf(i);
			int check = 0;
			for(int j=0;j<a.length();j++) {
				char k = a.charAt(j);
				if(k == '6') {
					check++;
					if(check == 3) {
						count++;
						break;
					}
				} else {
					check = 0;
				}
			}
			
			if(check == 3 && count == num) {
				result = i;
				break;
			}
			
		}
		
		System.out.println(result);
	}
}
