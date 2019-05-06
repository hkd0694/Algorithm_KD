package PB_1057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int number = Integer.parseInt(st.nextToken());
		int jimin = Integer.parseInt(st.nextToken());
		int hansu = Integer.parseInt(st.nextToken());
		
		int a = number;
		int round = 1;
		boolean check = true;
		while(a!=1) {
			if(jimin % 2 == 0) {
				if(hansu == jimin-1) {
					check = false;
					break;
				}
				else {
					if(hansu % 2 == 0) hansu /=2;
					else hansu = hansu/2+1;
					jimin /=2;
				}
			} else {
				if(hansu == jimin+1) {
					check = false;
					break;
				}
				else {
					if(hansu % 2 == 0) hansu /=2;
					else hansu =hansu/2+1;
					jimin = jimin/2 +1;
				}
			}
			if(a % 2 == 0) a = a/2;
			else a = a/2+1;
			round++;
		}
		if(check == false) System.out.println(round);	
		else System.out.println(-1);
		br.close();
	}
}
