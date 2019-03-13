package Problem_10845;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		int array[] = new int[test];
		int front = -1, rear = -1;
		for(int i=0;i<=test; i++) {
			String order = scanner.nextLine();			
			if(order.startsWith("push")) {
				String[] divide = order.split(" ");
				if(front == -1) {
					front++;
					rear++;
					array[front] = Integer.parseInt(divide[1]);
				} else {
					front++;
					array[front] = Integer.parseInt(divide[1]);
				}
			} else if (order.equals("pop")) {
				if(front == -1) System.out.println(-1);
				else {
					System.out.println(array[rear]);
					rear++;
					if(front < rear) {
						front = -1;
						rear = -1;
					}
				}
			} else if (order.equals("front")) {
				if(front == -1) System.out.println(-1);
				else System.out.println(array[rear]);
			} else if (order.equals("back")) {
				if(front == -1) System.out.println(-1);
				else System.out.println(array[front]);
			} else if (order.equals("size")) {
				if(front == -1 ) System.out.println(0);
				else			 System.out.println(front-rear+1);
			} else if(order.equals("empty")) {
				if(front == -1) System.out.println(1);
				else			  System.out.println(0);
			}
		}
	}
}
