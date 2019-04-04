package Problem_1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		double[] array = new double[test];
		
		Stack<Double> stack = new Stack<Double>();
		
		String order = br.readLine();
		
		for(int i=0;i<test;i++) array[i] = Integer.parseInt(br.readLine());
		
		for(int j=0; j<order.length();j++) {
			switch(order.charAt(j)) {
			case '*': case '+':
			case '-': case '/':
				double num1 = stack.pop();
				double num2 = stack.pop();
				if(order.charAt(j) == '*') stack.push(num2 * num1);
				else if(order.charAt(j) == '-') stack.push(num2 - num1);
				else if(order.charAt(j) == '+') stack.push(num2 + num1);
				else stack.push(num2 / num1);
				break;
			default:
				stack.push(array[order.charAt(j) - 'A']);
				break;
			}
		}
		System.out.format("%.2f",stack.pop());
	}
}