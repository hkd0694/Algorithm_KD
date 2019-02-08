package Problem_1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		String Uword = word.toUpperCase();
		int[] al = new int[26];
		boolean check = true;
		
		for(int i=0;i<Uword.length();i++) {
			int a = Uword.charAt(i);
			al[a-65]++;
		}
		
		int max = 0;
		int count=0;
		
		for(int i=0;i<al.length;i++) {
			if(max < al[i]) {
				max = al[i];
				count = i;
				check = true;
			} else if(max == al[i]) {
				check = false;
			}
		}
		
		if(check == false) {
			System.out.println("?");
		} else {
			System.out.println((char)(count+65));
		}
		
		
		
	}
}