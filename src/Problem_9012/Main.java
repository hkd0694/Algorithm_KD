package Problem_9012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		Stack<String> stack = new Stack<String>();

		for(int i=0;i<test;i++) {
			String order = br.readLine();
			int j = 0;
			for(;j<order.length();j++) {
				if(order.charAt(j) =='(') {
					stack.push(String.valueOf(order.charAt(j)));
					continue;
				} else if(order.charAt(j) == ')') {
					if(stack.isEmpty()) break;
					else stack.pop();
				}
			}
			if(j != order.length()) bw.write("NO\n");
			else {
				if(!stack.isEmpty()) bw.write("NO\n");
				else bw.write("YES\n");
			}	
			stack.clear();	
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
