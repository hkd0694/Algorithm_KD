package PB_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		int test = Integer.parseInt(st.nextToken());
		Deque<Integer> de = new ArrayDeque<>();
		
		for(int i=1;i<=number;i++) de.add(i);

		int count = 0;
		st = new StringTokenizer(br.readLine());
		for(int j=0;j<test;j++) {
			int index = Integer.parseInt(st.nextToken());
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
