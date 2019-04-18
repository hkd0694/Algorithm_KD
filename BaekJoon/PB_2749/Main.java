package PB_2749;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        int DIV = 1000000;
        int pisano = 1500000;
        
        t = t%pisano;
        
        long[] fibo = new long[pisano+1];
        fibo[1] = 1;
        
        for(int i=2; i <= pisano; i++) {
            fibo[i] = (fibo[i-1] + fibo[i-2])%DIV;
        }
        
        System.out.println(fibo[(int)t]);
    }
	
	/*public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long[] list = new long[(int) (n+1)];
        int mod = 1000000;
        int period = pisano_period(mod);
        list[0] = 0;
        list[1] = 1;
        for (int i = 2; i < list.length; i++) {
            list[i] = list[i - 2] + list[i - 1];
            list[i] %= mod;
        }
        System.out.println(list[(int) (n % period)]);
    }
	//피사노 주기!!
    public static int pisano_period(int m) {
        int period = 0;
        int number1 = 1, number2 = 1;
        do {
            int temp = number1;
            number1 = number2;
            number2 = (temp + number2) % m;
            period++;
        } while (!(number1 == 1 && number2 == 1));
        return period;
    }*/

}
