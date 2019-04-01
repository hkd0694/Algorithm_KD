package Problem_4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> stack = new Stack<>();
		
		while(true) {
			String order = scanner.nextLine();
			
			if(order.length() == 1 && order.charAt(0) == '.') break;
			
			for(int i=0;i<order.length();i++) {
				if(order.charAt(i) == '(' || order.charAt(i) == '[') {
					stack.push(String.valueOf(order.charAt(i)));
				}
				else if(order.charAt(i) == ']') {
					if(stack.empty()) {
						stack.push("1");
						break;
					}
					String a = stack.pop();
					if(a.equals("[")) continue;
					else {
						stack.push("1");
						break;
					}
				}
				else if(order.charAt(i) == ')') {
					if(stack.empty()) {
						stack.push("1");
						break;
					}
					String a1 = stack.pop();
					if(a1.equals("(")) continue;
					else{
						stack.push("1");
						break;
					}
				}
				else continue;
			}
			
			if(stack.isEmpty()) System.out.println("yes");
			else System.out.println("no");
			
			stack.clear();
			
		}

	}

}
