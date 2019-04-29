package PB_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[26]; //알파벳 인덱스를 저장할 배열 선언
		
		String len = br.readLine();
		String result = len.toUpperCase(); //입력받은 문자열을 모두 대문자로 변경
		for(int i=0;i<len.length();i++) {
			// a 변수에다가 한문자의 아스키코드 값를 반환
			int a = result.charAt(i);
			//알파벳 대문자의 아스키 코드가 A~Z(65~90)까지 이므로 a에다가 65를 빼준 배열의 값 index값 ++
			arr[a-65]++;
		}
		
		int max = 0;		// 가장 많이 나온 알파벳 값을 저장할 변수
		int maxIndex = 0;	// 가장 많이 나온 알파벳 배열 인덱스 값을 저장할 변수
		boolean check = true; // max가 동일한 값이 나오는지 판단하는 boolean 값 변수
		
		for(int j=0;j<arr.length;j++) {
			if(max < arr[j]) { //만약 인덱스 값이 큰게 나오면
				max = arr[j]; //max를 변경
				maxIndex = j; //그 max값의 index를 저장
				check = true;
			} else if(max == arr[j]) {
				//만약 max와 arr[j]가 동일하다면 max값이 동일한 것이므로 false로 바꿔줌
				check = false;
			}
		}
		//만약 check가 false면 max값이 중복된 것이므로 ?를 출력한다.
		if(check == false) System.out.println("?");
		//check가 true이므로 max값을 가진 maxIndex값에다가 아스키코드값인 65를 더해서 char형으로 변경해주면 대문자로 출력된다.
		else System.out.println((char)(maxIndex+65));
		br.close();
	}
}
