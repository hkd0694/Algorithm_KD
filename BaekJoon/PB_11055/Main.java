package PB_11055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int a[] = new int[test+1];
		int d[] = new int[test+1];
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=test;i++) a[i] = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=test;i++) {
			d[i] = a[i];
			for(int j=1;j<i;j++) {
				if(a[j]<a[i] && d[i] <d[j]+a[i]) d[i] = d[j]+a[i];
			}
			if(max <d[i]) max = d[i];
		}
		System.out.println(max);	
	}
}
