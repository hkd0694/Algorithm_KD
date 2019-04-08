package Problem_11401;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, K;
	static int MOD = 1000000007;
	static int[][] C;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(br.readLine());
		N = Integer.parseInt(sc.nextToken());
		K = Integer.parseInt(sc.nextToken());

		System.out.println(fac(N)*Rsqrt(fac(N-K)*fac(K)%MOD,MOD-2)%MOD);

	}
	static long Rsqrt(long	a, long m){
		long ret = 1;
		for (long v = a; m>0; m /= 2, v=(long)v*v % MOD) {
			if((m&1)==1) ret = ret*v % MOD;
		}
		return ret;
	}
	static long fac(int v){
		long ret = 1;
		for (int i = 1; i <= v; i++) {
			ret = ret * i % MOD;
		}
		return ret;
	}
	static void pt(String str){
		System.out.println("=========="+str+"=========");
		for (int j = 0; j <= K; j++) {
			for (int i = 1; i <= N; i++) {
				System.out.printf("%4s", C[i][j]);
			}
			System.out.println();
		}

	}

}
