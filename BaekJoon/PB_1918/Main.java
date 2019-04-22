package PB_1918;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	private static int priority(String operator) {
		switch(operator) {
		case "*": case "/":
			return 1;
		case "+": case "-":
			return 2;
		case "(":
			return 3;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String result = br.readLine();
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		
		for(int i=0;i<result.length();i++) {
			char d = result.charAt(i);
			switch(d) {
			case '*': case '-':
			case '/': case '+':
				if(stack.isEmpty()) {
					stack.push(String.valueOf(d));
				} else {
					while(priority(stack.peek()) <= priority(String.valueOf(d))){
						sb.append(stack.pop());
						if(stack.isEmpty()) break;
					}
					stack.push(String.valueOf(d));
				}
				break;
			case '(':
				stack.push(String.valueOf(d));
				break;
			case ')':
				while(!stack.peek().equals("(")) {
					sb.append(stack.pop());
				}
				stack.pop();
				break;
			default:
				sb.append(String.valueOf(d));
				break;	
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		bw.write(String.valueOf(sb));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
