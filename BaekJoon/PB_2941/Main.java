package PB_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int count = 0;
		
		for(int i=0;i<word.length();) {
			
			char a = word.charAt(i);
			
			if((a == 's' || a == 'z' || a=='d' || a=='l' || a =='n' || a =='c') && (i+2 <= word.length()) ) {
				String ab = word.substring(i,i+2);
				if(ab.equals("c=") || ab.equals("c-") || ab.equals("dz") || ab.equals("d-") || ab.equals("lj") || ab.equals("nj") || ab.equals("s=") || ab.equals("z=")) {
					if(ab.equals("dz")) {
						ab = word.substring(i,i+3);
						if(ab.equals("dz=")) {
							count++;
							i=i+3;
						} else {
							count++;
							i++;
						}
					} else {
						count++;
						i=i+2;
					}
				} else {
					count++;
					i++;
				}
			} else {
				count++;
				i++;
			}
		}
		System.out.println(count);
	}
}
