package PB_1547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		boolean arr[] = new boolean[3];
		
		int index = 1;
		arr[index-1] = true;
		StringTokenizer st;
		
		for(int i=0;i<test;i++) {
			st = new StringTokenizer(br.readLine());
			int M1 = Integer.parseInt(st.nextToken());
			int M2 = Integer.parseInt(st.nextToken());
			
			if(arr[M1-1] == false && arr[M2-1] == false) continue;
			else {
				if(arr[M1-1] == true) {
					arr[M1-1] = false;
					arr[M2-1] = true;
				} else if(arr[M2-1] == true) {
					arr[M2-1] = false;
					arr[M1-1] = true;
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			if(arr[i] == true) {
				System.out.println(i+1);
				return;
			}
		}
		
		System.out.println(-1);

	}

}
