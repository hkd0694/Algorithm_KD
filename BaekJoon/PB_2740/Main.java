package PB_2740;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int row1 = Integer.parseInt(st.nextToken());
		int col1 = Integer.parseInt(st.nextToken());
		int i,j;
		int matrix1[][] = new int[row1][col1];
		
		for(i=0;i<matrix1.length;i++) {
			st = new StringTokenizer(br.readLine());
			for(j=0;j<matrix1[i].length;j++) matrix1[i][j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		row1 = Integer.parseInt(st.nextToken());
		col1 = Integer.parseInt(st.nextToken());
		
		int matrix2[][] = new int[row1][col1];
		
		for(i=0;i<matrix2.length;i++) {
			st = new StringTokenizer(br.readLine());
			for(j=0;j<matrix2[i].length;j++) matrix2[i][j] = Integer.parseInt(st.nextToken());
		}
		
		if(matrix1[0].length == matrix2.length) {
			for(i=0;i<matrix1.length;i++) {
				int count = 0;
				while(count != matrix2[0].length) {
					int sum = 0;
					for(j=0; j<matrix2.length;j++) sum += matrix1[i][j] * matrix2[j][count];
					bw.write(sum +" ");
					count++;
				}
				bw.write("\n");
			}			
		} else {
			return;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
