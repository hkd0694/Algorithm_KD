package Problem_1966;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		for(int i=0;i<test;i++) {
			int N = scanner.nextInt(); //문서의 수
			int M = scanner.nextInt(); //queue의 어떤위치에 있는지를 알려주는 수
			Queue<Integer> change = new LinkedList<>();
			for(int j=0;j<N;j++) {
				int im = scanner.nextInt();
				change.add(im);
			}
			int count = 0;
			while(true) {
				int peek = change.peek();
				boolean ok = true;
				Iterator<Integer> a = change.iterator();
				while(a.hasNext()) {
					if(peek<a.next()) {
						ok = false;
						break;
					}
				}
				if(ok == true) {
					change.poll();
					count++;
					if(M == 0) break;
				} else {
					int head = change.poll();
					change.add(head);
				}
				
				M = (M-1>=0)? M-1:change.size()-1;
			}
			System.out.println(count);
		}
	}
}