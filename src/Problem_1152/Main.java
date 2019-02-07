package Problem_1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String st = scanner.nextLine();
		
		String asd[] = st.split(" ");
		
		for(int i=0; i<asd.length; i++) {
			if(asd[i].equals("")) {
				continue;
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}