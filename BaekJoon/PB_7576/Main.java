package PB_7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	private static int dx[] = {-1,1,0,0};
	private static int dy[] = {0,0,1,-1};
	private static int days = 0;
	
	private static void BFS(int arr[][],Deque<Integer> dequeue,int count) {
		
		int index = count;
		
		while(!dequeue.isEmpty()) {
			int a = 0;
			int queueIndex = 0;
			while(a != index) {
				int i = dequeue.pollFirst();
				int j = dequeue.pollFirst();
				boolean check = true;
				for(int z=0;z<4;z++) {
					int xIndex = dx[z] + i;
					int yIndex = dy[z] + j;
					if(xIndex < 0 || xIndex >= arr.length || yIndex < 0 || yIndex >= arr[0].length) {
						continue;
					} else {
						if(arr[xIndex][yIndex] == 1 || arr[xIndex][yIndex] == -1) continue;
						arr[xIndex][yIndex] = 1;
						dequeue.addLast(xIndex);
						dequeue.addLast(yIndex);
						queueIndex++;
						check = false;
					}
				}
				a++;
			}
			index = queueIndex;
			days++;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(days-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		Deque<Integer> dequeue = new LinkedList<Integer>();
		int count = 0;
		int arr[][] = new int[N][M];
		int first = 1;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					dequeue.add(i);
					dequeue.add(j);
					count++;
				}
			}
		}
		if(dequeue.isEmpty()) {
			System.out.println(0);
			return;
		}
		BFS(arr,dequeue,count);
		br.close();
	}
}
