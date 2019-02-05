package Problem_10250;

import java.util.Scanner;
//내코드
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i=0; i<test; i++) {
			int floor = scanner.nextInt();
			int room = scanner.nextInt();
			int guest = scanner.nextInt();
			
			int count = 0,f = 1;
			
			do {
				for(int j=1;j<=floor;j++) {
					count ++;
					if(count == guest) {
						int result = (j*100) +f;
						System.out.println(result);
						break;
					}
				}
				f++;
			}while(count < guest);
			
		}
		
	}

}
//메모리,시간 가장 좋은 코드
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int h, w, n;
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			if(n%h != 0) str.append(n%h);
			else str.append(h);
			
			if(n/h < 9 || (n/h==9) && (n%h==0)) str.append(0);
			if (n%h != 0) str.append(n/h + 1);
			else str.append(n/h);
			str.append("\n");
		}
		System.out.print(str.toString());
	}
}*/
