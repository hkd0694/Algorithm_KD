package PB_1718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		String lock = br.readLine();
		//암호화키 넣을 배열 arr
		int arr[] = new int[lock.length()];
		StringBuilder sb = new StringBuilder();
		//arr배열에 암호화 키를 문자열 길이만큼 각 소문자의 아스키코드 값을 넣어준다.
		//ex)소문자 l일 경우 l의 아스키코드는 108인데 108에서 -96을 빼주면 12가 나옴
		for(int i=0;i<lock.length();i++) arr[i] = lock.charAt(i)-96;
		//암호화키 인덱스를 계속해서 반복해줄 index 값.
		int lockIndex = 0;
		for(int i=0;i<text.length();i++) {
			//만약 text의 한글자 값이 ' '이면 공백을 출력하고 lockIndex를 증가시켜준다.
			//lockIndex가 lock 문자열의 길이와 같다면 계속 반복해주어야 하기때문에 0으로 초기화한다.
			if(text.charAt(i) == ' ') {
				sb.append(" ");
				lockIndex++;
				if(lockIndex == lock.length()) lockIndex = 0; 
				continue;
			}
			//평문의 아스키코드 값을 n에다 저장한다.
			int n = text.charAt(i)-96;
			//arr[lockIndex]값을 index에 저장 
			//암호화할 문자가 "love"이면 첫번 째 n의 값은 12가 들어온다.
			int index = arr[lockIndex];
			//index가 0이 될때까지 반복
			while(index != 0) {
				n--;
				//만약 n이 0이라면 a보다 앞의 수는 없기때문에 n값을 'z'인 26으로 초기화
				if(n==0) n = 26;
				index--;
			}
			//계산된 값을 다시 char형으로 바꿔준다.
			sb.append((char)(n+96));
			lockIndex++;
			//lockIndex가 lock 문자열의 길이와 같다면 계속 반복해주어야 하기때문에 0으로 초기화한다.
			if(lockIndex == lock.length()) lockIndex = 0; 
		}
		//결과값 출력
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}
}
