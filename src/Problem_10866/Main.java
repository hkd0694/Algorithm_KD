package Problem_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> de = new ArrayDeque<>();
		
		int test = Integer.parseInt(reader.readLine());
		
		for(int i=0;i<test;i++) {
			
			String order = reader.readLine();
			
			switch(order) {
			case "size":
				System.out.println(de.size());
				break;
			case "empty":
				if(de.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(de.isEmpty()) System.out.println(-1);
				else System.out.println(de.peekFirst());
				break;
			case "back":
				if(de.isEmpty()) System.out.println(-1);
				else System.out.println(de.peekLast());
				break;
			case "pop_front":
				if(de.isEmpty()) System.out.println(-1);
				else {
					System.out.println(de.pollFirst());
				}
				break;
			case "pop_back":
				if(de.isEmpty()) System.out.println(-1);
				else {
					System.out.println(de.pollLast());
				}
				break;
			default:
				String[] d = order.split(" ");
				if(d[0].equals("push_front")) {
					if(de.isEmpty()) {
						de.push(Integer.parseInt(d[1]));
					} else {
						de.addFirst(Integer.parseInt(d[1]));;
					}
				} else {
					if(de.isEmpty()) {
						de.push(Integer.parseInt(d[1]));
					} else {
						de.addLast(Integer.parseInt(d[1]));;
					}
				}
				break;
			}
		}
	}
}
