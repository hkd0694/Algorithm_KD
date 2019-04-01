package Problem_5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			
			String order = br.readLine();
			long length = Integer.parseInt(br.readLine());
			String array = br.readLine();
			
			String number = null;
			
			boolean SW = true;
			
			Deque<Integer> queue = new LinkedList<>();
			
			if(length == 0) {
				queue.add(-2);
			} else if(length == 1) {
				number = array.substring(1, array.length()-1);
				int asd = Integer.parseInt(number);
				queue.add(asd);
			} else {
				number = array.substring(1, array.length()-1);
				String arr[] = number.split(",");
				for(int z = 0;z<arr.length;z++) queue.add(Integer.parseInt(arr[z]));
			}
			
			for(int x=0;x<order.length();x++) {
				if(order.charAt(x) == 'R') {
					if(SW == true) SW = false;
					else SW = true;
				} else {
					if(!queue.isEmpty()) {
						if(queue.peekFirst() == -2) {
							queue.addFirst(-1);
							break;
						}
						if(SW == false) queue.pollLast();
						 else queue.pollFirst();
					}
					else {
						queue.addFirst(-1);
						break;
					}
				}
			}
			if(queue.size() ==0) {
				System.out.println("[]");
			}
			else if(queue.peekFirst() == -1) {
				System.out.println("error");
			} else {
				System.out.print("[");
				if(queue.peekFirst() == -2) {
					System.out.println("]");
					continue;
				}
				while(queue.size() != 1) {
					if(SW == false) System.out.print(queue.pollLast() + ",");
					else System.out.print(queue.pollFirst() + ",");
				}
				System.out.println(queue.pollFirst() + "]");
			}
		}
	}
}
