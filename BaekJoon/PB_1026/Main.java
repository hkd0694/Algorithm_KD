package PB_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int A[] = new int[test];
		int B[] = new int[test];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<A.length;i++) A[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int j=0;j<B.length;j++) B[j] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int count = 0;
		
		while(count != test) {
			int max = -1;
			int min = 101;
			int maxIndex = 0;
			int minIndex = 0;
			
			for(int i=0;i<A.length;i++) {
				if(A[i] < min) {
					min = A[i];
					minIndex = i;
				}
				if(B[i] > max) {
					max = B[i];
					maxIndex = i;
				}
			}
			
			sum += A[minIndex] * B[maxIndex];
			A[minIndex] = 101;
			B[maxIndex] = -1;
			count++;
		}
		
		System.out.println(sum);
		br.close();
	}
}
