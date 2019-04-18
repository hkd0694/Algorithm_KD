package PB_2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<3;i++) {
			int array[] = new int[4];
			int count =0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<array.length;j++) {
				array[j] = Integer.parseInt(st.nextToken());
				if(array[j] == 1) count++;
			}
			switch(count) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}	
		}
		br.close();
	}
}
