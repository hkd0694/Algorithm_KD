package Problem_1018;

import java.util.Scanner;

public class Main {
	
	static int n,m;
    static int[][] arr;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        m = sc.nextInt(); 
        arr = new int[n][m];
        for(int i=0;i<n;i++) {
            String t = sc.next();
            for(int j=0;j<m;j++)
                arr[i][j] = t.charAt(j);
        }
        int result = Integer.MAX_VALUE;
        for(int i=0;i<=n-8;i++) {
            for(int j=0;j<=m-8;j++) {
                result = Math.min(result, solve(i,j));
            }
        }
        System.out.println(result);
    }
    
    private static int solve(int x,int y) {
        int result = 0;
        int temp = 'B';
        for(int i=x;i<x+8;i++) {
            if(arr[i][y]!=temp) result++;
            for(int j=y+1;j<y+8;j++) {
                if(arr[i][j]==temp) {
                    result++;
                    if(temp=='B') temp = 'W';
                    else temp = 'B';
                }else temp = arr[i][j];
            }
        }        
        int result2 = 0;
        temp = 'W';
        for(int i=x;i<x+8;i++) {
            if(arr[i][y]!=temp) result2++;
            for(int j=y+1;j<y+8;j++) {
                if(arr[i][j]==temp) {
                    result2++;
                    if(temp=='B') temp = 'W';
                    else temp = 'B';
                }else temp = arr[i][j];
            }
        }
        
        return result>result2?result2:result;
    }
    //내 코드.. 출력하면 다 나오는데 계속 틀렸다고 나옴..
	/*public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] a = bf.readLine().split(" ");
		int row = Integer.parseInt(a[0]);
		int col = Integer.parseInt(a[1]);
		
		char[][] array = new char[row][col];
		
		int count;
		
		for(int i=0;i<array.length;i++) {
			String order = bf.readLine();
			count = 0;
			for(int j=0;j<array[i].length;j++) {
				char d = order.charAt(count);
				array[i][j] = d;
				count++;
			}
		}
		int MinCount = 9999; //정사각형의 최솟값을 출력하기위한 변수
		int LeftIndex = 0;
		int LeftIndex1 = 0;
		int RightIndex = 8;
		int BottomIndex = 8;
		
		while(true) {
			count = 0;
			int start = 0;
			boolean SW = false;
				for(int i=LeftIndex1; i<BottomIndex;i++) {
					if(start == 0) {
						if(array[i][LeftIndex] == 'B') SW = true; //[0][0]= 'B'일경우
						else SW = false; //[0][0] = 'W'일경우
					} else {
						if(SW == true) SW = false;
						else SW = true;
					}
					
					for(int j=LeftIndex;j<RightIndex;j++) {
						if(start == 0) {
							start = 1;
							continue;
						}
						if(SW == true) {
							SW = false;
							if(array[i][j] == 'W') continue;
							else count++;
						} else {
							SW = true;
							if(array[i][j] == 'B') continue;
							else count++;
						}
					}
				}
			
			if(count < MinCount) {
				MinCount = count; //최소값 구하는 방식
			}
			System.out.println(count + " " + LeftIndex + " : " + RightIndex+" : " + LeftIndex1 + " : "+BottomIndex);
			//여기에 인덱스 증가시켜야함
			if(RightIndex == col && BottomIndex == row) break;
			
			else {
				if(RightIndex !=col) {
					LeftIndex++;
					RightIndex++;
					continue;
				}
				
				if(BottomIndex != row && RightIndex ==col) {
					LeftIndex = 0;
					BottomIndex++;
					LeftIndex1 = BottomIndex-8;
					RightIndex = 8;
				}
			}
		}
		System.out.println(MinCount);
	}*/
}
