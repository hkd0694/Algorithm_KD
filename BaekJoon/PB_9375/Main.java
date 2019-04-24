package PB_9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0;i<test;i++) {
			int number = Integer.parseInt(br.readLine());
			int index = 0;
			String arr[] = new String[number];
			int arrIndex[] = new int[number];
			for(int j=0;j<number;j++) {
				String clothes[] = br.readLine().split(" ");
				int z = 0;
				if(j == 0) {
					arr[index] = clothes[1];
					arrIndex[index]++;
					index++;
				} else {
					while(z != index) {
						if(arr[z].equals(clothes[1])) {
							arrIndex[z]++;
							break;
						}
						z++;
					}
					if(z == index) {
						arr[index] = clothes[1];
						arrIndex[index]++;
						index++;
					}
				}
			}
			
			long result = 1;
			for(int v=0;v<index;v++) {
				result *= (arrIndex[v]+1);
			}
			
			System.out.println(result -1);
		}
	}
}