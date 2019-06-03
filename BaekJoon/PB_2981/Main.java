package PB_2981;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    //최댓값에서 최솟값의 차이를 구한 후 그 수의 약수를 저장한다. 그 약수들을 하나씩 나누어 나머지가 같은 수를 출력해주면 끝
	private static int max = 0;				//최댓값
	private static int min = 1000000001;	//최솟값
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		
		int arr[] = new int[test];
		
		for(int i=0;i<test;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
		
		int div = max - min;
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(div);
		
		for(int i=2;i<=Math.sqrt(div);i++) {
			if(div % i == 0) {
				if(i == div/i) {
					list.add(i);
				} else {
					list.add(i);
					list.add(div/i);
				}
			}
		}
		
		Collections.sort(list);
		
		int index = 0;
		StringBuilder sb = new StringBuilder();
		
		while(index != list.size()) {
			boolean check = true;
			int a = (int) (arr[0]%list.get(index));
			for(int i=1;i<arr.length;i++) {
				if(a != arr[i]%list.get(index)) {
					check = false;
					break;
				}
			}
			if(check == true) sb.append(list.get(index) + " ");
			index++;
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
		//시간 초과남...
		
		//long arr[] = new long[test];
		/*int index = 0;
		
		for(int i=0;i<test;i++) {
			arr[i] = Long.parseLong(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int su = 2;
		while(su != max) {
			int count = 0;
			int div = (int)arr[0]%su;
			boolean check = true;
			if(index != 0) {
				if(su > arr[0]) count++;
			}
			for(int j=1;j<test;j++) {
				if(index != j && su > arr[j]) count++;									
				if(div != arr[j]%su) check = false;
				
				if(check == false || count >= 2) break;
			}
			
			if(check == true) sb.append(su + " ");
			
			if(count >= 2) break;
			su++;
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();*/
	}
}
