package PB_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sik = br.readLine();
		
		String arr[] = sik.split("-");
		int numarr[] = new int[100];
		int index = 0;
		
		String check = "";
		int sum = 0;
		//-를 기준으로 나눠
		for(int i=0;i<arr.length;i++) {
			//식을 하나씪 가지고 와서
			String k = arr[i];
			sum = 0;
			for(int j=0;j<k.length();j++) {
				//문자 하나씩 사져와
				char a = k.charAt(j);
				//만약 +란 기호가 있다?
				if(a == '+') {
					sum += Integer.parseInt(check);
					check = "";
				} else {
					check += a;
				}
			}
			
			sum += Integer.parseInt(check);
			check = "";
			numarr[index++] = sum;
			
		}
		
		sum = 0;
		sum +=numarr[0];
		
		for(int i=1;i<index;i++) {
			sum -= numarr[i];
		}
		
		System.out.println(sum);
		
	}
}
