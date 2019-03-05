package Problem_9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		char stack[] = new char[50];
		int size = -1;
		
		for(int i=0;i<test; i++) {
			String b = scanner.next();
			size = -1;
			if(b.length() >=2 && b.length() <=50) {
				
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j) == ')') {
						while(size != -1) {
							if(stack[size] == '(') {
								break;
							} else {
								size--;
							}
						}
						if(size !=-1) {
							size--;
						} else {
							stack[0] = 'c';
							break;
						}
						
					} else {
						size++;
						stack[size] = b.charAt(j);
					}
				}
				
				if(stack[0] == 'c' || size != -1) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
				
			}

			
		}
	}

}
