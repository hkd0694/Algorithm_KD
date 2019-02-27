package Problem_2108;


//구글링 한 코드 무슨 차이가 있는지 모르겠다..
/*import java.util.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 반복횟수
		int[] s = new int[n]; // 입력받는 정수
		int[] m = new int[8001]; // 최빈값 배열
		int sum = 0;
		int count = 0; //

		for (int i = 0; i <= n - 1; i++) {
			s[i] = sc.nextInt();
		}
		for (int i = 0; i < n ; i++) {
			sum += s[i];
		}
		System.out.println((int)Math.round((double) sum / (double) n));// 산술평균
		Arrays.sort(s);// 배열 정렬
		int median = (int) Math.round((double) n / 2);
		if (n % 2 == 0) {
			System.out.println(((s[median - 1] + s[median])/2)+1);
		}
		else
			System.out.println(s[median - 1]);// 중앙값
		int x = 0;
		for (int i = 0; i <= n - 1; i++) { // 최빈값
			m[s[i] + 4000]++;
			x = Math.max(x, m[s[i] + 4000]);

		}
		int second = 0;
		for (int i = 0; i < m.length; i++) {// -4000(+4000) ~ 4000(+4000)
			if (m[i] == x) {
				count++;
				second = i - 4000;
			}
			if (count == 2) {
				second = i - 4000;
				break;
			}
		}
		System.out.println(second);
		int max = s[0];
		int min = s[0];
		for (int i = 0; i <= s.length - 1; i++) {
			if (s[i] >= max) {
				max = s[i];
			}

		}
		for (int i = 0; i <= n - 1; i++) {
			if (s[i] <= min) {
				min = s[i];
			}
		}
		System.out.println(max - min);
	}
}*/
import java.util.Scanner;
import java.util.Arrays;

//내코드...실행은 되는데 시간초과 남 ㅠㅠ...
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int sum = 0;
		int min = 0;
		int max = 0,count=0;
		int[] intArr;
		int[] IntList = null;
		
		if(test %2 ==1) {
			intArr = new int[test];
			IntList = new int[test];
			for(int i=0;i<test;i++) {
				int x = scanner.nextInt();
				if(i==0) {
					max = x;
					min = x;
				} else {
					if(max < x) {max = x;}
					if(min > x) {min = x;}
				}
				sum+=x;
				IntList[i] = x;
				//IntList.add(x);
			}
			double average = (double)(sum)/(double)(IntList.length);
			Arrays.sort(IntList);
			//Collections.sort(IntList);
			int result=0;
			for(int j=0;j<IntList.length;j++) {
				count=0;
				for(int z = 0; z<j;z++) {
					if(IntList[j] == IntList[z]) {
						intArr[z]++;
						count = 1;
						break;
					}
				}
				if(count!=1)
				intArr[j]++;
			}
			int armax = intArr[0];
			result = IntList[0];
			for(int l=1;l<intArr.length;l++) {
				if(armax < intArr[l]) {
					armax = intArr[l];
					result = IntList[l];
				} else if(armax == intArr[l]) {
					result = IntList[l];
					break;
				}
			}
			//산술평균 출력
			System.out.printf("%.0f",average);
			System.out.println();
			//중앙값 출력
			System.out.println(IntList[IntList.length/2]);
			//최빈값 출력
			System.out.println(result);
			//범위 출력
			System.out.println(max-min);
		}
	}
}
