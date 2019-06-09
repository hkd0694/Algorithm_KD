package PB_1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	//-1, 0, 1 count할 배열
	private static int[] result = new int[3];
	
	private static void check(int arr[][], int first, int v, int h, int length) {
		
		boolean a = true;
		
		for(int i=v;i<length+v;i++) {
			for(int j=h;j<length+h;j++) {
				if(arr[i][j] != first) {
					//만약 값이 다를 경우 9개로 쪼갠 후 재귀함수로 돌려야함
					a = false;
					//현재 길이에서 3을 나눈다.
					int len = length / 3;
					//쪼갠 9개를 다시 check 함수에 넣어서 다시 값을 체크 한다.
					for(int q=v;q<length+v;q=q+len) {
						for(int w = h; w<length+h;w=w+len) {
							check(arr,arr[q][w],q,w,len);
						}
					}
					break;
				}
			}
			if(a==false) break;
		}
		
		//a 가 true일 경우 해당 배열이 모두 같으 것이기 때문에 조건문에 맞춰 배열을 증가 시킨다.
		if(a) {
			if(arr[v][h] == -1) result[0]++;
			else if(arr[v][h] == 0) result[1]++;
			else if(arr[v][h] == 1) result[2]++;
		}
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[test][test];
		
		StringTokenizer st;
		
		for(int i=0;i<test;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<test;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int first = arr[0][0];
		
		check(arr,first,0,0,arr.length);
		
		for(int i=0;i<3;i++) System.out.println(result[i]);
		
	}
}
