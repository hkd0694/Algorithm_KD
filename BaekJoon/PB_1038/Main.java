package PB_1038;

import java.io.*;
//구글링 코드.
public class Main {
    private static void solve(long n) {
        int count = 0;
        long num = 0;
        
        while (true) {
            boolean isDsc = true;
            long temp = num;
            long jump = 1;
            long before = -1;
            
            // 일의자리부터 한자리씩 비교
            while (temp != 0) {
                if (temp % 10 <= before)  isDsc = false;
                // jump를 최대치로 늘리기 위함.
                if (!isDsc && temp % 10 > before) break;
                // jump는 어떤 자릿수에서 감소하는 수가 아닌지를 식별한다.
                jump *= 10;
                before = temp % 10;
                temp /= 10;
            }
            
            if (isDsc) {
                if (n == count++) break;
                num++;
            } else  {
                // 불필요한 부분 점프.
                // 11 -> 20 으로 넘어가야한다. 무작정 점프 수만큼 넘어버리면 11 -> 21, 22 -> 32
                // 뒷 자리를 0으로 초기화 시켜줘야한다.
                jump /= 10;
                num += jump;
                num = num / jump * jump;
                //System.out.println(jump + " " + num);
                continue;
            }
        }
        System.out.println(num);
    }
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 10) System.out.println(n);
        else if (n > 1022) System.out.println("-1");
        else solve(n);
    }
}

//내가 짠 코드 시간초과;;
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int count = 0;
	private static boolean check = true;
	
	private static boolean minus(int k) {
		
		if(k <= 10) {
			return false;
		} else {
			String value = String.valueOf(k);
			boolean c = false;
			for(int i=0;i<value.length()-1;i++) {
				if(Integer.parseInt(String.valueOf(value.charAt(i))) <= Integer.parseInt(String.valueOf(value.charAt(i+1))))
					c = true;
				if(c) return c;
			}
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int k = 0;
		
		if(test > 1022) {
			System.out.println(-1);
			return;
		}
		
		while(true) {
			boolean ck;
			ck = minus(k);
			if(ck) {
				k++; continue;
			}
			if(!ck && count == test) {
				check = ck;
				break;
			}
			k++;
			count++;
		}
		System.out.println(k);
	}
}*/
