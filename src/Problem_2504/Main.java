package Problem_2504;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	String order = br.readLine();
    	Stack<String> stack = new Stack<String>();
    	int Result = 0;
    	int i=0;
    	for(;i<order.length();i++) {
    		Result = 0;
    		if(order.charAt(i) == '(' || order.charAt(i) == '[') {
    			stack.push(String.valueOf(order.charAt(i)));
    			continue;
    		} 
    		else if(order.charAt(i) == ')') {
    			if(stack.isEmpty()) break;
    			String RoundOut = stack.peek();
    			if(RoundOut.equals("[")) break;
    			else if(RoundOut.equals("(")) {
    				stack.pop();
    				stack.push("2");
    			}
    			else {
    				while(!RoundOut.equals("(")) {
    					if(RoundOut.equals("[")) {
    						bw.write("0"); bw.flush();
    						bw.close(); return;
    					}
    					Result += Integer.parseInt(stack.pop());
    					if(stack.isEmpty()) {
    						bw.write("0"); bw.flush();
    						bw.close(); return;
    					}
    					RoundOut = stack.peek();
    				}
    				stack.pop();
    				Result *=2;
    				stack.push(String.valueOf(Result));
    			}
    		} 
    		else if(order.charAt(i) == ']') {
    			if(stack.isEmpty()) break;
    			String SqareOut = stack.peek();
    			if(SqareOut.equals("(")) break;
    			else if(SqareOut.equals("[")) {
    				stack.pop();
    				stack.push("3");
    			}
    			else {
    				while(!SqareOut.equals("[")) {
    					if(SqareOut.equals("(")) {
    						bw.write("0"); bw.flush();
    						bw.close(); return;
    					}
    					Result += Integer.parseInt(stack.pop());
    					if(stack.isEmpty()) {
    						bw.write("0"); bw.flush(); 
    						bw.close(); return;
    					}
    					SqareOut = stack.peek();
    				}
    				stack.pop();
    				Result *=3;
    				stack.push(String.valueOf(Result));
    			}
    		}
    	}
    	
    	Result = 0;
    	
    	if(i != order.length()) bw.write("0");
    	else {
    		while(!stack.isEmpty()) {
    			if(stack.peek().equals("[") || stack.peek().equals("(")) {
    				bw.write("0"); bw.flush();
    				bw.close(); return;
    			} else {
    				Result += Integer.parseInt(stack.pop());
    			}
    		}
    		bw.write(String.valueOf(Result));
    	}
        bw.flush();
        bw.close();
    }
}
