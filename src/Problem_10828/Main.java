package Problem_10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<test;i++) {
			String order = br.readLine();
			
			switch(order) {
			case "size":
				bw.write(String.valueOf(stack.size()));
				bw.newLine();
				break;
			case "empty":
				if(stack.isEmpty()) bw.write("1");
				else bw.write("0");
				bw.newLine();
				break;
			case "pop":
				if(stack.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(stack.pop()));
				bw.newLine();
				break;
			case "top":
				if(stack.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(stack.peek()));
				bw.newLine();
				break;
			default:
				String[] a = order.split(" ");
				stack.push(Integer.parseInt(a[1]));
				break;
			}
			
		}
		bw.flush();
		bw.close();
	}

}
