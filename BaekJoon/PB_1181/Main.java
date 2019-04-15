package PB_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		String[] array = new String[test];
		
		for(int i=0;i<array.length;i++) {
			array[i] = br.readLine();
		}
		
		int count = 0;
		int length = 1;
		String[] sortArray = new String[test];
		int sortIndex = 0;
		boolean check = true;
		int start = 0;
		
		while(count != array.length) {
			start = sortIndex;
			for(int j=0;j<array.length;j++) {
				if(array[j] == null) continue;
				check = true;
				if(length == array[j].length()) {					
					if(count == 0) {
						sortArray[sortIndex++] = array[j];
						count++;
						array[j] = null;
					} else {
						for(int z=start;z<sortIndex;z++) {
							if(sortArray[z].equals(array[j])) {
								count++;
								check = false;
								break;
							}
						}
						if(check == true) {
							sortArray[sortIndex++] = array[j];
							count++;
						}
						array[j] = null;
					}
				}
			}
			if(start == sortIndex-1) {
				length++;
				continue;
			}  else {
				Arrays.sort(sortArray, start, sortIndex);
				length++;
			}
		}
		
		for(int q = 0; q<sortIndex; q++)
			System.out.println(sortArray[q]);
	}
}
