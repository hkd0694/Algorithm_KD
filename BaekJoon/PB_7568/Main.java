package PB_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		//입력할 키와 몸무게 넣을 배열
		int arr[][] = new int[test][2];
		//각각의 등수를 저장할 배열/
		int rank[] = new int[test];
		StringTokenizer st;
		
		for(int i=0;i<arr.length;i++) {
			st =  new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int i=0;
		//처음 값부터 하나씪 모두 비교 (브루트포스)
		while(i != test) {
			int count = 1;
			for(int j=0;j<test;j++) {
				if(j==i) continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count++;
				}
			}
			rank[i] = count;
			i++;
		}
		for(int k=0;k<test;k++) System.out.print(rank[k] + " ");
	}
}
