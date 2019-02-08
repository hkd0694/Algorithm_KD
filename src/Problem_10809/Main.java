package Problem_10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] al = new int[26];
		int count,asd;
		String word = scanner.next();
		
		for(int i=0;i<al.length; i++) {
			al[i]--;
		}
		
		for(int i=0; i<word.length();i++) {
			char a = word.charAt(i);
			count = i;
			asd = 0;
			for(char j='a';j<='z';j++) {
				if(a == j) {
					if(al[asd] !=-1) {
						continue;
					}
					al[asd] = count;
				}
				asd++;
			}
		}
		
		for(int i=0;i<al.length;i++) {
			System.out.print(al[i] + " ");
		}
		
	}
}
