package Problem_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0;i<test;i++) {
			StringTokenizer index = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(index.nextToken());
			int M = Integer.parseInt(index.nextToken());
			
			StringTokenizer number = new StringTokenizer(br.readLine());
			int arrayCount[] = new int[N];
			
			for(int j=0;j<N;j++) {
				arrayCount[j] = Integer.parseInt(number.nextToken());		
				queue.add(j);
			}
			int result = arrayCount[M];
			int count = 0;
			boolean check = true;
			
			 do {
				int peek = queue.peek();
				check = true;
				for(int z = 0; z<arrayCount.length;z++) {
					if(z == peek) continue;
					
					if(arrayCount[peek] < arrayCount[z]) {
						queue.add(queue.poll());
						check = false;
						break;
					}
				}
				if(check == true) {
					count++;
					if(arrayCount[peek] == result && peek == M) break;
					arrayCount[queue.poll()] = 0;
				}
			 } while(true);
			 System.out.println(count);
			 queue.clear();
		}
		br.close();
	}
}