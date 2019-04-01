package Problem_2164;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		Deque<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=test;i++) {
			queue.add(i);
		}
		
		if(queue.size() == 1) System.out.println(1);
		else {
			while(queue.size() != 1) {
				queue.pollFirst();
				int number = queue.pollFirst();
				queue.addLast(number);
			}
			
			System.out.println(queue.peek());
			
		}
	}

}
