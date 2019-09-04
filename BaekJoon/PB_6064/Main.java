package PB_6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int result;
		int count;
		boolean check;
		
		for(int i=0;i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); 
			int y = Integer.parseInt(st.nextToken()); 
			int m = Integer.parseInt(st.nextToken()); 
			int n = Integer.parseInt(st.nextToken()); 
			//총 경우의 수
			result = x*y;
			//앞에꺼 기준으로 while 돌려야함
			count = m;
			check = true;
			
			while(count <= result) {
				int k = count % y;
				if(k == 0) k = y;
				if(k == n) {
					check = false;
					break;
				}
				count += x;
			}
			if(check) System.out.println(-1);
			else System.out.println(count);
		}
	}
}
