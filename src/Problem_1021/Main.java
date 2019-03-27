package Problem_1021;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		Deque<Integer> de = new ArrayDeque<>();
		int number = scanner.nextInt();
		int test = scanner.nextInt();
		for(int i=1;i<=number;i++) de.add(i);
		
		int count = 0;
		
		for(int j=0;j<test;j++) {
			int index = scanner.nextInt();
			Iterator<Integer> iterator = de.iterator();
			int Fcount = 0;
			while(iterator.hasNext()) {
				int a = iterator.next();
				if(a == index) {
					break;
				} else {
					Fcount++;
				}
			}
			int Lcount = de.size() - Fcount;
			if(Fcount <= Lcount) {
				while(index != de.peekFirst()) {
					int Fde = de.pollFirst();
					de.addLast(Fde);
					count++;
				}
				de.pollFirst();
			} else {
				while(index != de.peekFirst()) {
					int Lde = de.pollLast();
					de.addFirst(Lde);
					count++;
				}
				de.pollFirst();
			}
		}
		System.out.println(count);
	}
}
