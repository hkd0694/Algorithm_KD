package Problem_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	private static void DFS(boolean[][] dfs, int V) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(V);
		while(!stack.isEmpty()) {
			int peek = stack.pop();
			for(int i=dfs.length;i>0;i--) {
				if(dfs[peek-1][i-1] == true) {
					if(stack.contains(i)) {
						int re = stack.indexOf(i);
						stack.remove(re);
						stack.push(i);
					} else {
						stack.push(i);
					}
				}
				dfs[peek-1][i-1] = false;
				dfs[i-1][peek-1] = false;
			}
			System.out.print(peek + " ");
		}
	}
	
	private static void BFS(boolean[][] bfs, int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		while(!queue.isEmpty()) {
			int q = queue.peek();
			for(int i=0;i<bfs.length;i++) {
				if(bfs[q-1][i] == true) {
					if(!queue.contains(i+1)) queue.add(i+1);
					bfs[q-1][i] = false;
					bfs[i][q-1] = false;
				}
			}
			System.out.print(queue.poll() + " ");
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		boolean BFSArray[][] = new boolean[N][N];
		boolean DFSArray[][] = new boolean[N][N];
		
		for(int i=0;i<M;i++) {
			StringTokenizer visit = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(visit.nextToken());
			int num2 = Integer.parseInt(visit.nextToken());
			BFSArray[num1-1][num2-1] = true;
			BFSArray[num2-1][num1-1] = true;
			DFSArray[num1-1][num2-1] = true;
			DFSArray[num2-1][num1-1] = true;
		}
		DFS(BFSArray,V);
		System.out.println();
		BFS(DFSArray,V);
		br.close();
	}
}
