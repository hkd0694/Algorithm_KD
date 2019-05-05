package PB_2755;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int sum = 0; //총학점
		double gradeSum = 0;
		
		for(int i=0; i<test;i++) {
			st = new StringTokenizer(br.readLine());
			String title = st.nextToken();
			int credit = Integer.parseInt(st.nextToken());
			String grade = st.nextToken();
			switch(grade) {
			case "A+":
				gradeSum += credit * 4.3;
				break;
			case "A0":
				gradeSum += credit * 4.0;
				break;
			case "A-":
				gradeSum += credit * 3.7;
				break;
			case "B+":
				gradeSum += credit * 3.3;
				break;
			case "B0":
				gradeSum += credit * 3.0;
				break;
			case "B-":
				gradeSum += credit * 2.7;
				break;
			case "C+":
				gradeSum += credit * 2.3;
				break;
			case "C0":
				gradeSum += credit * 2.0;
				break;
			case "C-":
				gradeSum += credit * 1.7;
				break;
			case "D+":
				gradeSum += credit * 1.3;
				break;
			case "D0":
				gradeSum += credit * 1.0;
				break;
			case "D-":
				gradeSum += credit * 0.7;
				break;
			case "F":
				gradeSum += credit * 0.0;
				break;
			}
			sum+=credit;
		}
		System.out.printf("%.2f", gradeSum/sum);
	}
}
