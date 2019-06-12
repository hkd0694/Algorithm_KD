package PB_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int divide(int arr) {
		
		int ck = 0;
		int su = 10;
		
		if(arr / su == 0) {
			ck += arr;
		} else {
			int sh = arr;
			while(sh / su != 0) {
				ck += sh%su;
				sh =sh/su;
			}
			ck += sh%su;
		}
		return ck;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int i = 1;
		int result = 0;
		boolean check = true;
		while (i < test) {
			result = divide(i);
			int Q = result + i;
			if(Q == test) {
				check = false;
				break;
			}
			i++;
		}
		if(!check) System.out.println(i);
		else System.out.println(0);
	}
}
