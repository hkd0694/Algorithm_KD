package Problem_1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	private static int priority(String a) {
		switch(a) {
		case "+": case "-":
			return 2;
		case "*": case "/":
			return 1;
		default:
			return 3;
		}
	}	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String order = br.readLine();
		Stack<String> stack = new Stack<String>();
		
		for(int i=0;i<order.length();i++) {
			switch(order.charAt(i)) {
			case '-': case '*':
			case '/': case '+':	
				if(stack.isEmpty()) stack.push(String.valueOf(order.charAt(i)));
				else {
					int OP = priority(String.valueOf(order.charAt(i)));
					while(priority(stack.peek()) <= OP) {
						sb.append(stack.pop());
						if(stack.isEmpty()) break;
					}
					stack.push(String.valueOf(order.charAt(i)));
				}
				break;
			case '(':
				stack.push(String.valueOf(order.charAt(i)));
				break;
			case ')':
				if(!stack.isEmpty()) {
					String g = stack.pop();
					while(!g.equals("(")) {
						sb.append(g);
						g = stack.pop();
					}
				}
				break;
			default:
				sb.append(order.charAt(i));
				break;
			}
		}
		
		if(stack.isEmpty()) System.out.println(sb);
		else {
			while(!stack.isEmpty())
				sb.append(stack.pop());
			System.out.println(sb);
		}
	}
}
