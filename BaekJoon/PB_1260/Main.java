package PB_1260;

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
			//스택에 맨위에 있는 수를 빼낸다.
			int peek = stack.pop();
			//스택은 처음 넣은것이 마지막에 나오기 때문에 뒤에있는 dfs.length값부터 찾아서 넣는다.
			for(int i=dfs.length;i>0;i--) {
				//만약 값이 true이면
				if(dfs[peek-1][i-1] == true) {
					//스택안에 이미 들어가 있는 값이면
					if(stack.contains(i)) {
						//그 값을 찾아 제거해주고 다시 스택에 넣는다.
						int re = stack.indexOf(i);
						stack.remove(re);
						stack.push(i);
						//그 값이 없으면 스택에 바로 넣는다.
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