package PB_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		int array[][] = new int [test][2];
		
		for(int i=0;i<array.length;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		//2차원 배열 정렬할때 사용방법 comparetor사용!! 배열 첫번째 요소로 정렬을 우선 한다.
		//만약 첫번째 요소들의 값이 같을 경우 두번째 값으로 정렬을 해준다..
		//함수를 알고 있으면 쉬운 문제
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for(int j=0;j<array.length;j++)
			System.out.println(array[j][0] + " " + array[j][1]);
		
		
		//내가 짠코드 맞긴 하지만 계속 시간초과 나옴;; 검색해봤는데 함수가 있었음!! 기억 하자
		
		/*Arrays.sort(sortArray);
		index = 0;
		int indexArray[] = new int[test];
		int count = 0;
		while(index != test) {
			int a = 0;
			int start = count;
			for(int j=0;j<array.length;j++) {
				if(array[j][0] == -100001) continue;
				if(sortArray[index] == array[j][0]) {
					array[j][0] = -100001;
					indexArray[count++] = array[j][1];
					a++;
				}
			}
			if(a == 1) {
				bw.write(sortArray[index] + " " + indexArray[index] + "\n");
				index++;
			} else {
				Arrays.sort(indexArray, start,count);
				int b = start;
				while(b != count) {
					bw.write(sortArray[index++] + " " + indexArray[b++] + "\n");
				}
			}
		}*/
	}
}
