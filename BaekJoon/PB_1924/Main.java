package PB_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) throws IOException {
		
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int sum = 0;
		if((month >= 1 && month <= 12) || (day >= 1 && day <= 12)) {
			for(int i=0;i<month-1;i++) {
				if(month <= 1) sum = 0;
				else sum+=days[i];
			}
			sum+=day;
			switch(sum%7) {
			case 0:
				System.out.println("SUN\n");
				break;
			case 1:
				System.out.println("MON\n");
				break;
			case 2:
				System.out.println("TUE\n");
				break;
			case 3:
				System.out.println("WED\n");
				break;
			case 4:
				System.out.println("THU\n");
				break;
			case 5:
				System.out.println("FRI\n");
				break;
			case 6:
				System.out.println("SAT\n");
				break;
			}
		}
		br.close();
	}

}
