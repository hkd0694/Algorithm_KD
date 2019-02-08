package Problem_1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		boolean resultArray[] = new boolean[test];
		
		for(int i=0;i<test;i++) {
			String word = scanner.next();
			boolean al[]  = new boolean[26];
			
			char first = word.charAt(0);
			al[(int)first-97] = true;
			resultArray[i] = true;
			
			for(int j=1;j<word.length();j++) {
				char asd = word.charAt(j-1);
				char presentword = word.charAt(j);
				
				if(asd == presentword)
					continue;
				else {
					int index = (int)presentword;
					
					if(al[index - 97] == true) {
						resultArray[i] = false;
						break;
					} else {
						al[index-97] = true;
						continue;
					}
				}
				
			}
			
		}
		
		int result = 0;
		
		for(int i=0;i<resultArray.length;i++) {
			if(resultArray[i] == true) result++;
		}
		System.out.println(result);
		
    }

}