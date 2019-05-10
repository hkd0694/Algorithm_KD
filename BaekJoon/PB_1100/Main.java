package PB_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		boolean check = false;
		
		for(int i=0;i<8;i++) {
			String order = br.readLine();
			if( check == true) check = false;
			else check = true;
			for(int j=0;j<order.length();j++) {
				char value = order.charAt(j);
				if(check == true && value=='F') {
					check = false;
					count++;
				} else {
					if(check == true) check = false;
					else check = true;
				}
			}
		}
		System.out.println(count);
	}
}
