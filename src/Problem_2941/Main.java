package Problem_2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		int count = 0;
		
		for(int i=0; i<word.length();) {
			char al = word.charAt(i);
			String alpa;
			if(i+2 >word.length()) {
				alpa = "";
			}else {
			alpa = word.substring(i, i+2);
			}
			
			if(al == 'c') {
				if(alpa.equals("c=")) {
					i=i+2;
				} else if(alpa.equals("c-")){
					i=i+2;
				}else {
					i++;
				}
				count++;
			}else if(al == 'd') {
				if(alpa.equals("dz")) {
					alpa = word.substring(i,i+3);
					if(alpa.equals("dz=")) {
						i=i+3;
					} 
					else {
						i++;
					}
				} else if(alpa.equals("d-")){
					i=i+2;
				}else {
					i++;
				}
				count++;
			}else if(al == 'l' || al == 'n') {
				if(alpa.equals("lj")) {
					i=i+2;
				} else if(alpa.equals("nj")){
					i=i+2;
				}else {
					i++;
				}
				count++;
			}
			else if(al == 's' || al =='z') {
				if(alpa.equals("s=")) {
					i=i+2;
				} else if(alpa.equals("z=")){
					i=i+2;
				}else {
					i++;
				}
				count++;
			} else {
				count++;
				i++;
			}
		}
		
		System.out.println(count);
		
	}
}