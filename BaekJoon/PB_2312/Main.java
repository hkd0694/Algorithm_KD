package PB_2312;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0;i<test;i++) {
			int num = Integer.parseInt(br.readLine());
			int array[] = new int[num];
			StringBuilder sb = new StringBuilder();
			int su = 2;
			int j=0;
			while(num != 1) {
				if(num%su == 0) {
					array[j++] = su;
					num = num/su;
				} else su++;
			}
			int length = 0;
			su = array[0];
			int index = 0;
			if(j == 1)  bw.write(array[0] + " 1\n");
			else {
				while(length != j) {
					if(array[length] != array[length+1]) {
						sb.append(array[length] + " " + String.valueOf(length-index+1) + "\n");
						length++;
						index = length;
					} else length++;
				}
				bw.write(String.valueOf(sb));
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
