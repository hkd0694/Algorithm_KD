package Problem_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int front = -1;
	private static int rear = -1;
	
	private static int QueueSize(int[] array) {
		if(front == -1) return 0;
		else{
			return rear-front+1;
		}
	}
	
	private static int QueueFront(int[] array) {
		if(front > rear || front == -1) return -1;
		else {
			return array[front];
		}
	}
	
	private static int QueueBack(int[] array) {
		if(front > rear || front == -1) return -1;
		else {
			return array[rear];
		}
	}
	
	private static int QueueEmpty(int[] array) {
		if(front > rear || front == -1) return 1;
		else return 0;
	}
	
	private static int QueuePop(int[] array) {
		if(front > rear || front == -1) return -1;
		else if(front == rear) {
			int g = array[front];
			front = -1; rear = -1;
			return g;
		}
		else {
			return array[front++];
		}
	}
	
	private static void QueuePush(int[] array , String order) {
		String number[] = order.split(" ");
		if(front == -1) {
			front++; rear++;
			array[rear] = Integer.parseInt(number[1]);			
		} else {
			rear++;
			array[rear] = Integer.parseInt(number[1]);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int array[] = new int[test];
				
		for(int i=0;i<test;i++) {
			String order = br.readLine();
			
			switch(order) {
			case "size":
				System.out.println(QueueSize(array));
				break;
			case "front":
				System.out.println(QueueFront(array));
				break;
			case "back":
				System.out.println(QueueBack(array));
				break;
			case "empty":
				System.out.println(QueueEmpty(array));
				break;
			case "pop":
				System.out.println(QueuePop(array));
				break;
			default:
				QueuePush(array,order);
				break;
			}
		}
		
	}
}
