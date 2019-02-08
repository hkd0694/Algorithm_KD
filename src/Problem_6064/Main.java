package Problem_6064;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t,m,n,x,y;
	    int mul;
	    t = sc.nextInt();
	    for(int i=0;i<t;i++){
	    	m = sc.nextInt();
	    	n = sc.nextInt();
	    	x = sc.nextInt();
	    	y = sc.nextInt();
	        mul=m*n;
	        int result = -1;
	        if(x<=m&&y<=n){
	            for(int j=x;j<=mul;j+=m){
	                if((j-1)%n+1==y){
	                    result=j;
	                    break;
	                }
	            }
	        }
	        System.out.println(result);
	    }
	}
}

//답은 맞았지만 시간초과 남 ㅠㅠ... 1로 초기화해서 for문을 돌리면 너무 비효율적이다..
/*import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i=0;i<test;i++) {
			int M = scanner.nextInt();
			int N = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int a = 0, b = 0;
			int count = 0;
			if(x == 1 && y == 1) {
				System.out.println(count+1);
			} else {
				while(true) {
					a++; b++;
					count++;
					
					if(a == x && b== y) {
						System.out.println(count);
						break;
					}
					
					if(M == a && N == b) {
						System.out.println("-1");
						break;
					}
					
					if(a >= M) {
						a=0;
					} else if( b >= N) {
						b=0;
					}
				}
			}
		}
	}
}*/
