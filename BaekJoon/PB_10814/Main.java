package PB_10814;

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
		StringTokenizer st;
		String arr[][] = new String[test][3];
		
		for(int i=0;i<test;i++) {			
			st = new StringTokenizer(br.readLine());
			//첫번째로 가입한 순서를 넣는다.
			arr[i][0] = String.valueOf(i);
			//두번째로 나이를 넣는다.
			arr[i][1] = st.nextToken();
			//세번째로 이름을 넣는다.
			arr[i][2] = st.nextToken();
		}
		
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				//만약 나이순으로 비교하는 대신 두번째 배열값인 나이가 같으면 가입한 순서로 비교한다.
				if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
				//만약 두번째 배열값인 나이가 다르면 나이순으로 비교한다.
				return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
			}
		});
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][1] + " " + arr[i][2]);
		}
		
		br.close();
		
	}

}
