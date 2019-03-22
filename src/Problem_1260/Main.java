package Problem_1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void DFS(boolean arr[][],int start) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			int d = stack.pop();
						
			for(int i=arr.length;i>=1;i--) {
				if(arr[d-1][i-1] == true) {
					if(stack.contains(i)) {
						int re = stack.indexOf(i);
						stack.remove(re);
						stack.push(i);
					} else {
						stack.push(i);
					}
				}
				arr[d-1][i-1] = false;
				arr[i-1][d-1] = false;
			}
			System.out.print(d + " ");
		}
	}
	
	public static void BFS(boolean arr[][],int start) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		
		while(!queue.isEmpty()) {
			for(int i=1;i<=arr.length;i++) {
				if(arr[queue.peek()-1][i-1] == true) {
					arr[queue.peek()-1][i-1] = false;
					arr[i-1][queue.peek()-1] = false;
					if(queue.contains(i)) {
						continue;
					}
					queue.add(i);
				}
			}
			System.out.print(queue.peek() + " ");
			queue.poll();
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int V = scanner.nextInt();
		int E = scanner.nextInt();
		int start = scanner.nextInt();
		
		boolean arr[][] = new boolean[V][V];
		boolean arr1[][] = new boolean[V][V];
		
		for(int i=0;i<E;i++) {
			int EStart = scanner.nextInt();
			int EEnd = scanner.nextInt();
			arr[EStart-1][EEnd-1] = true;
			arr[EEnd-1][EStart-1] = true;
			arr1[EStart-1][EEnd-1] = true;
			arr1[EEnd-1][EStart-1] = true;
		}
		
		DFS(arr,start);
		System.out.println();
		BFS(arr1,start);
	}
}
