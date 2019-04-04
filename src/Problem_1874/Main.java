package Problem_1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int index = 1;
        int i=0;
        for(;i<test;i++) {
        	int num = Integer.parseInt(br.readLine());
        	int start = index;
        	if(stack.isEmpty()) {
        		for(int j=start;j<=num;j++) {
        			stack.push(j);
        			sb.append("+\n");
        			index++;
        		}
        		stack.pop();
        		sb.append("-\n");
        	} else {
        		if(stack.peek() == -1) continue;
        		else if(stack.peek() == num) {
        			stack.pop();
        			sb.append("-\n");
        		} else if(stack.peek() > num) stack.push(-1);
        		 else {
        			for(int z=start;z<=num;z++) {
        				stack.push(z);
        				sb.append("+\n");
        				index++;
        			}
        			stack.pop();
        			sb.append("-\n");
        		}
        	}
        }
        if(stack.isEmpty()) System.out.println(sb);
        else System.out.println("NO");
    }
}
