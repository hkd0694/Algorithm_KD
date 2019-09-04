package PB_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[test][2];
		
		for(int i=0;i<test;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] start, int[] end) {
				//비교하는 값의 종료시간이 같을 경우 시작 시간으로 정렬
				if(start[1] == end[1]) return Integer.compare(start[0], end[0]);
				//종료시간에 따라 정렬한다.
				return Integer.compare(start[1], end[1]);
			}
		});
		
		int count = 0;
		int end = -1;
		for(int i=0;i<test;i++) {
			if(arr[i][0] >=end) {
				end = arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
