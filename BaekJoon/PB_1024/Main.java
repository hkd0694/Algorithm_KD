package PB_1024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		//구글링해서 찾은 코드
		//등차수열 합 공식이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        boolean flag = true;
        for (int i = L; i <= 100 && flag; i++) {
            if((2 * N >= i * (i - 1)) && (2 * N - i * (i - 1)) % (2 * i) == 0) {
                int a = ((2 * N - i * (i - 1)) / (2 * i));
                for (int j = 0; j < i; j++) {
                    bw.write((a + j) + " ");
                }
                bw.write("\n");
                flag = false;
            }
        }
 
        if(flag) bw.write("-1 \n");
        bw.close();
		
		//내가 짠 코드 60%에서 자꾸 틀렸다고 뜨는데 반례를 못찾겠다 아무리 해봐도 답은 나옴..
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		long arr[] = new long[1000];
		//long arr[];
		long sum = 0;
		int index = L;
		int suIndex = 0;
		boolean check = true;
		
		while(N/index != 1) {
			
			long div = N/index;
			
			//arr = new long[index];
			
			long firstIndex = div-(index-1);
			if(firstIndex < 0) {
				firstIndex = 1;
			}
			
			for(long i=firstIndex;i<=div;i++) {
				sum = 0;
				suIndex = 0;
				long a = i;
				while(suIndex != index) {
					arr[suIndex] = a;
					sum +=a;
					a++;
					suIndex++;
				}
				if(suIndex > 100) {
					System.out.println(-1);
					return;
				}
				if(sum == N) {
					check = false;
					break;
				}
			}
			
			if(check == false) break;
			index++;
		}
		
		if(check == true) System.out.println(-1);
		else {
			for(int i=0;i<suIndex;i++) {
				System.out.print(arr[i] + " ");
			}
		}*/
	}
}
