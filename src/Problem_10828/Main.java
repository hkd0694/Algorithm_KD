package Problem_10828;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		int []stack = new int[test];
		int top = -1;
		String order = null;
		for(int i=0;i<=test; i++) {
			order = scanner.nextLine();
			System.out.println(order);
			if(order.startsWith("push")) {
				top++;
				String[] a = order.split(" ");
				stack[top] = Integer.parseInt(a[1]);
			} 
			else if(order.equals("pop")) {
				if(top == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[top]);
					stack[top] = 0;
					top--;
				}
			}
			else if(order.equals("top")) {
				if(top != -1) {
					System.out.println(stack[top]);
				} else {
					System.out.println(-1);
				}
			} 
			else if(order.equals("size")) {
				System.out.println(top+1);
			} 
			else if(order.equals("empty")) {
				if(top == -1) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}
	}

}
