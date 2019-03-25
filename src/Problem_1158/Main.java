package Problem_1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		int count = 0;
		System.out.print("<");
		while(queue.size() > 1) {
			int q = queue.peek();
			count++;
			if(count % M == 0) {
				System.out.print(queue.poll() + ", ");
				continue;
			} else {
				queue.poll();
				queue.add(q);
			}
		}
		System.out.print(queue.poll() + ">");
	}
}
