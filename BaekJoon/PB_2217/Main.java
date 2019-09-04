package PB_2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int arr[] = new int[test];
				
		for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(br.readLine());
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		int length = arr.length;
		
		int max = -1;
		
		//오름차순으로 정렬이 되어있기 때문에 뒤에서부터의 각 인덱스의 값의 최댓값을 구해
		//max 변수와 비교
		for(int i=length-1;i>=0;i--) {
			int a = arr[i] * (test-i);
			if(a > max) max = a;
			
		}
		
		System.out.println(max);
		
		//시간초과 뜬다.. N값이 10만개 이다보니 도는게 많은듯..
		/*int i = 0;
		
		long max = -1;
		
		while(i != length) {
			int count = 1;
			long first = arr[i];
			for(int j=i;j<length;j++) {
				if(arr[j] > first) count++;
			}
			first *=count;
			if(max < first) max = first;
			i++;
		}
		System.out.println(max);*/
	}
}
