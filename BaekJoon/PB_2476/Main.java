package PB_2476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[] = new int[3];
		
		int MaxResult = 0; //최종 결과값을 저장할 변수
		
		for(int i=0;i<test;i++) {
			st = new StringTokenizer(br.readLine());
			//가장 큰 주사위를 저장할 변수
			int max = 0;
			//동일한 값을 count해주는 변수
			int count = 0;
			//동일한 값이 있다면 그 배열의 인덱스를 저장할 변수
			int index = 0;
			
			for(int j=0;j<3;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(max < arr[j]) max = arr[j]; //주사위 수중 가장 큰값을 구하는 변수
				int z = 0;
				//배열 값에 동일한 주사위 수를 찾는 while문
				while(z != j) {
					if(arr[j] == arr[z]) {
						//만약 하나가 동일하다면 count = 1이 될것이고
						//만약 모두 동일하다면 count가 1이상의 값이 나올것이다.
						count++;
						//동일하다면 그 배열의 인덱스 값을 저장하는 index 변수
						index = z;
					}
					z++;
				}
			}
			//상금을 계산하는 변수
			int result = 0;
			//count = 0이면 주사위 수가 모두 다른 것이므로 가장 큰 수를 저장한 max에다가 100을 곱해준다.
			if(count == 0) result = max*100;
			//count = 1이면 주사위 수가 동일한 것이 1개 존재하므로 그 인덱스를 저장했던 index에다가 *100을 곱해준다.
			else if(count == 1) result = arr[index] * 100 + 1000;
			//count가 1이상일 경우 주사위 수가 모두 같으므로 배열 첫번째 값에다 *1000을 해준다.
			else result = arr[0] * 1000 + 10000;
			
			//MaxResult변수에 가장 큰 상금을 저장한다.
			if(result > MaxResult) MaxResult = result;
		}
		
		System.out.println(MaxResult);
		br.close();
	}
}
