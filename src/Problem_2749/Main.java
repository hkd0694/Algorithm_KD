package Problem_2749;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        int pisano = 1500000; // 피사노 주기
        long[] arr = new long[pisano];
        arr[0] = 0; arr[1] = 1;
 
        for(int i=2 ; i<pisano && i<=n ; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000;  // 피보나치 수를 1,000,000 으로 나눈 나머지 값을 저장 
        }
 
        if(n >=pisano){
            n %= pisano;
        }
 
        System.out.println(arr[(int) n]);
    }

	/*public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BigInteger F0 = BigInteger.ZERO;
		BigInteger F1 = BigInteger.ONE;
		BigInteger F2 = BigInteger.ZERO;
		
		BigInteger number = scanner.nextBigInteger();
		long divide = 1000000;
		
		
		for(BigInteger i = BigInteger.ONE; i.compareTo(number)== -1; i=i.add(BigInteger.ONE)) {
			
			if(number == BigInteger.ZERO) {
				System.out.println(0);
				return;
			} else if(number == BigInteger.ONE) {
				System.out.println(1);
				return;
			} else {
				F2 = F0.add(F1);
				F0 = F1;
				F1 = F2;
			}
		}
		
		System.out.println(F2.remainder(BigInteger.valueOf(divide)));

	}*/
}
