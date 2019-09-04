package PB_2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int white = 0;
	private static int blue = 0;
	
	private static void check(int arr[][],int startX, int startY,int endX,int endY) {
		
		int first = arr[startX][startY];
		boolean check = true;
		
		for(int i=startX;i<endX;i++) {
			for(int j=startY;j<endY;j++) {
				if(first != arr[i][j]) {
					check = false;
					break;
				}
			}
			if(!check) break;
		}
		
		if(!check) {
			check(arr,startX,startY,(startX+endX)/2,(startY+endY)/2);
			check(arr,startX,(startY+endY)/2,(startX+endX)/2,endY);
			check(arr,(startX+endX)/2,startY,endX,(startY+endY)/2);
			check(arr,(startX+endX)/2,(startY+endY)/2,endX,endY);
		} else {
			if(first == 1 ) blue++;
			else white++;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[test][test];
		
		for(int i=0;i<arr.length;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		check(arr,0,0,test,test);

		System.out.println(white);
		System.out.println(blue);
		
	}

}
