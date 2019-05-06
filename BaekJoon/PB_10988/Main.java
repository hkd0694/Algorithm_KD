package PB_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		boolean check = true;
		
		//단어의 길이의 2/1만큼 for문을 돌려준다.
		for(int i=0;i<word.length()/2; i++) {
			//만약 word의 i번째 문자와 문자의 길이에서 -i만큼 한 문자를 비교해서 만약 같지 않으면 check를 false로 해준다.
			if(word.charAt(i) != word.charAt(word.length()-i-1)) {
				check = false;
				//check가 false면 더이상 for문을 하지않고 break해준다.
				break;
			}
		}
		if(check == true) System.out.println(1);
		else System.out.println(0);
		
		br.close();
	}
}
