package PB_1022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int max_unit = 0;
	
	private static String CoodVal(int a, int b) {
		int max = 0;
		if(Math.abs((int)a) > Math.abs((int)b)) max = Math.abs((int)a);
		else max = Math.abs((int)b);
		
		int max_cood = max;
		max = 2* max+1;
		int n = max;
		max = (int)Math.pow((double)max,(double)2);
		
		int start = max;
		int res;
		
		if(a==max_cood && b>-max_cood) {
			res = start-(max_cood-b);
		}
		else if(b == -max_cood && a>-max_cood) {
			start -=(n-1);
			res = start -(max_cood-a);
		} else if(a == -max_cood && b <max_cood) {
			start -=2*(n-1);
			res = start -(max_cood+b);
		} else {
			start -=3*(n-1);
			res = start-(max_cood+a);
		}
		int unit = 0, temp = res;
		
		while(true) {
			temp /=10;
			unit++;
			if(temp == 0) break;
		}
		String res_st = Integer.toString(res);
		for(int i=0; i<max_unit - unit;i++) {
			res_st = " " + res_st;
		}
		
		return res_st;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r1 = Integer.parseInt(st.nextToken());
		int c1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());
		
		int max;
		//최댓값을 구하는 과정
		if(Integer.parseInt(CoodVal(r1,c1)) > Integer.parseInt(CoodVal(r2,c2)))
			max = Integer.parseInt(CoodVal(r1,c1));
		else max = Integer.parseInt(CoodVal(r2,c2));
		
		//최대값의 자릿수를 구하는 과정
		while(true) {
			max /= 10;
			max_unit++;
			if(max == 0) break;
		}
		//max_unit -> 자리수
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=r1;i<=r2;i++) {
			String oneL = CoodVal(i,c1) + " ";
			for(int j=c1+1;j<=c2;j++) {
				oneL += CoodVal(i,j) + " ";
			}
			bw.write(oneL);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
		
		/*int arr[][] = new int[51][51];
		
		int a = arr.length/2;
		int number = 1;
		arr[a][a] = number;
		int c = 1,count = 0;
		int result = 51*51;
		boolean check = true;
		boolean end = true;
		int i = a,j = a;
		number++;
		
		while(true) {
			if(check == true) {
				if(end == false) break;
				count = 0;
				while(count != c) {
					if(number == result) {
						end = false; 
						break;
					}
					arr[i][++j] = number;
					count++ ;number++;
				}
				if(end == false) break;
				count = 0;
				while(count != c) {
					if(number == result) {
						end = false; 
						break;
					}
					arr[--i][j] = number;
					count++; number++;
				}
				if(end == false) break;
				c++;
				check = false;
			} else {
				count = 0;
				while(count != c) {
					if(number == result) {
						end = false; 
						break;
					}
					arr[i][--j] = number;
					count++; number++;
				}
				if(end == false) break;
				count = 0;
				while(count != c) {
					if(number == result) {
						end = false; 
						break;
					}
					arr[++i][j] = number;
					count++; number++;
				}
				if(end == false) break;
				c++;
				check = true;
			}
		}
		
		arr[50][50] = result;
		
		
		
		if((r2- r1 >= 0 && r2-r1 <= 49) || (c2-c1 >= 0 && c2-c1 <= 4)) {
			int go = 0;
			
			if(arr[r1+25][c1+25] > 1000 || arr[r1+25][c2+25] > 1000 || arr[r2+25][c1+25] > 1000 || arr[r2+25][c2+25] > 1000) {
				go = 3;
			} else if(arr[r1+25][c1+25] > 100 || arr[r1+25][c2+25] > 100 || arr[r2+25][c1+25] > 100 || arr[r2+25][c2+25] > 100) {
				go = 2;
			} else if(arr[r1+25][c1+25] > 10 || arr[r1+25][c2+25] > 10 || arr[r2+25][c1+25] > 10 || arr[r2+25][c2+25] > 10) {
				go = 1;
			} else {
				go = 0;
			}
			
			for(i=r1;i<=r2;i++) {
				for(j=c1;j<=c2;j++) {
					switch(go) {
					case 0:
						System.out.print(arr[i+25][j+25] + " ");
						break;
					case 1:
						if(arr[i+25][j+25] < 10) {
							System.out.print(" " + arr[i+25][j+25] + " ");
						} else {
							System.out.print(arr[i+25][j+25] + " ");
						}
						break;
					case 2:
						if(arr[i+25][j+25] < 10) {
							System.out.print("  " + arr[i+25][j+25] + " ");
						} else if(arr[i+25][j+25] < 100) {
							System.out.print(" " + arr[i+25][j+25] + " ");
						} else {
							System.out.print(arr[i+25][j+25] + " ");
						}
						break;
					case 3:
						if(arr[i+25][j+25] < 10) {
							System.out.print("   " + arr[i+25][j+25] + " ");
						} else if(arr[i+25][j+25] < 100) {
							System.out.print("  " + arr[i+25][j+25] + " ");
						} else if(arr[i+25][j+25] < 1000){
							System.out.print(" " + arr[i+25][j+25] + " ");
						} else {
							System.out.print(arr[i+25][j+25] + " ");
						}
						break;
					}
				}
				System.out.println();
			}
			
			br.close();
		} else {
			return;
		}*/
	}
}
