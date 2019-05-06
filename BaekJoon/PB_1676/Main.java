package PB_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	private static BigInteger factorial(int num) {
		BigInteger number = BigInteger.ONE;
		for(int i=1; i<=num;i++) number = number.multiply(BigInteger.valueOf(i));
		return number;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		BigInteger result = factorial(num); //factorial 의 수를 result 변수안에 넣음.
		String NumberString = String.valueOf(result);//받은 result을 문자열로 변경
		
		int length = NumberString.length(); //문자열로 바꾼 숫자의 길이를 구하는 변수
		int count = 0;
		
		while(length != 0) {
			//문자열로 바뀐 NumberString의값의 맨 마지막 인덱스부터 그 값이 0이면 count를 증가시키고,
			//만약 0이 아닌 숫자가 오면 바로 break를 해줌으로써 while문을 종료시킨다.
			if(NumberString.charAt(length-1) == '0') count++;
			else break;
			length--;
		}
		System.out.println(count);
		br.close();
	}
}
