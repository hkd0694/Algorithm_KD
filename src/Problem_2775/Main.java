package Problem_2775;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		
		for(int i=0;i<test;i++) {
			int people;
			int floor = scanner.nextInt();
			int rooms = scanner.nextInt();
			
			int[] array = new int[rooms];
			for(int j=0;j<=floor;j++) {
				for(int z=1;z<=rooms;z++) {
					people = 0;
					if(j==0) {
						array[z-1] = z;
					} else {
						for(int k=array.length-z;k>=0;k--) {
							people+=array[k];
						}
						array[array.length-z] =people;
					}
				}
				if(j == floor-1)
					break;
			}
			
			int sum = 0;
			
			for(int q=0;q<array.length;q++)
				sum+=array[q];
			System.out.println(sum);
		}
	}

}


/*import java.io.BufferedReader; 메모리,시간 가장 빠른 코드...
import java.io.InputStreamReader;

public class Main {
	private static int[][] resident = new int[15][15];
	private static final String NEW_LINE = "\n";
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		num();
		
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			int k =Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(resident[k][n - 1]).append(NEW_LINE);
		}
		
		System.out.println(sb.toString());
	}
	
	private static void num() {
		for(int i = 0; i < 15; i++) {
			resident[i][0] = 1;
			resident[0][i] = i + 1;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				resident[i][j] = resident[i][j - 1] + resident[i - 1][j];
			}
		}
	}
}
*/