package PB_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int search(int arr[][],int y) {
		
		int first = arr[0][y];
		
		boolean check = true;
		int count = 0;
		
		for(int i=1;i<3;i++) {
			if(first == arr[i][y]) check =false;
		}
		
		if(check) return first;
		else {
			for(int i=1;i<3;i++) {
				if(first != arr[i][y]) return arr[i][y];
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][] = new int[3][2];
		
		StringTokenizer st;
		
		for(int i=0;i<arr.length;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int X = arr[0][0];
		int Y = arr[0][1];
		
		for(int i=0;i<2;i++) {
			int index = search(arr,i);
			System.out.print(index + " ");
		}	
	}
}