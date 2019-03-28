package Problem_2902;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		String result ="";
		String[] sung = name.split("-");
		
		for(int i=0;i<sung.length;i++) {
			if(sung[i].charAt(0) > 64 && sung[i].charAt(0) <91)
				result +=sung[i].charAt(0);
			else break;
		}
		if(result.length() == sung.length) 	System.out.println(result);

	}

}
