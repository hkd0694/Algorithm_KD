package PB_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
	    int[][] triangle = new int[test][test]; //입력된 삼각형의 숫자 입력할 2차원 배열
	    int[][] result = new int[test][test];   //합을 저장하는 2차원 배열
	    int max = 0;
	    
	    for(int i=0;i<test;i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int j=0;j<=i;j++) triangle[i][j] = Integer.parseInt(st.nextToken());
	    }
	    
	    result[0][0] = triangle[0][0]; //첫 번째 값 입력

	    for(int i=1; i<test;i++) {
	    	for(int j=0;j<=i;j++) {
	    		if(j == 0) result[i][j] = triangle[i][j] + result[i-1][j]; //제일 왼쪽에 있는 값 계산 과정 
	    		else if(j == i) result[i][j] = triangle[i][j] + result[i-1][j-1];//제일 오른쪽에 있는 값 계산 과정
	    		else { //중앙에 있는 값 계산 과정
	    			if(triangle[i][j] + result[i-1][j-1] > triangle[i][j] + result[i-1][j]) {
	    				result[i][j] = triangle[i][j] + result[i-1][j-1];
	    			} else {
	    				result[i][j] = triangle[i][j] + result[i-1][j];
	    			}
	    		}
	    	}
	    }
	    
	    for(int i=0;i<test;i++) { //맨 마지막 배열의 값들 중 최대값을 찾는 과정
	    	if(max < result[test-1][i])
	    		max = result[test-1][i];
	    }
	    
	    System.out.println(max); 
	    br.close();
	  }
}
