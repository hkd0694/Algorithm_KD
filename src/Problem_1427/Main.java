package Problem_1427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		ArrayList<Integer> s = new ArrayList<>();
		
		while(test >0) {
			int a = test%10;
			s.add(a);
			test = test/10;
		}
		Collections.sort(s);
		for(int i=s.size()-1;i>=0;i--) {
			System.out.print(s.get(i));
		}
		
	}

}
//제일 빠른 코드
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
	private static int min;
	private static int tmp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int size = input.length();
		int[] num = new int[size];
		br.close();
		for(int i=0; i<size; i++) {
			num[i] =(int)input.charAt(i)-48;
		}
		for(int i=0; i<num.length-1; i++) {
			min = i;
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					min = j;
					tmp = num[min];
					num[min] = num[i];
					num[i] = tmp;
				}
			}
			
		}
		for(int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]);
		}
		
	}
}*/
