package Problem_1475;

import java.util.Scanner;

//너무 길다 내껀..
public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
			int[] numArray = new int[10];
			int a;
			if(number == 0) {
				System.out.println("1");
			} else {
				while(number > 0) {
					a = number % 10;
					for(int i=0;i<numArray.length;i++) {
						if(i == a) {
							if(i == 6 || i== 9) {
								if(numArray[6] < numArray[9]) {
									numArray[6]++;
								} else if(numArray[6] == numArray[9]) {
									numArray[a]++;
								} else if(numArray[6] > numArray[9]) {
									numArray[9]++;
								}
							} else {
								numArray[i]++;
							}
						} 
					}
					number = number/10;
				}
				int max = 0;
				for(int k=0;k<numArray.length;k++) {
					if(max < numArray[k])
						max = numArray[k];
				}
				System.out.println(max);
			}		
	}

}

// 코드 짧고 메모리 , 시간 가장 좋은 코드...
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String N = br.readLine();
		int[] count = new int[10];
		
		for (int i = 0; i < N.length(); i++) {
			count[N.charAt(i)-'0'] ++;
		}
		count[6] = (int)Math.ceil((count[6]+count[9])/2.0);
		count[9] = 0;
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < count.length; i++) {
			if(count[i] > max ) max = count[i];
		}
		System.out.println(max);
	}
}*/
