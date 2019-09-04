package PB_1074;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int stoi(String s) { return Integer.parseInt(s);}
 
    static int N;
    static int r;
    static int c;
    static int count = 0;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = stoi(st.nextToken());
        int r = stoi(st.nextToken());
        int c = stoi(st.nextToken());
 
        int n = getSize(N);
        int count = 0;
        int x = 0;
        int y = 0;
 
        /**
         * 사각형 절반으로 나눠서 각 사분면으로 계산
         * n이 1이 된다는 것은 x, y 좌표가 r, c랑 같아진다는 것
         */
        while(n > 0) {
            n /= 2; 
            // 2사분면 (왼 위)
            if(r < x+n && c < y+n) {
                count += n * n * 0;
            }
            // 1사분면 (오른 위)
            else if(r < x+n) {
                count += n * n * 1;
                y += n;
            }
            // 3사분면 (왼 아래)
            else if(c < y+n) {
                count += n * n * 2;
                x += n;
            }
            // 4사분면 (오른 아래)
            else {
                count += n * n * 3;
                x += n;
                y += n;
            }
 
            if(n == 1) { 
                System.out.println(count);
                break;
            }
        }
    }
 
    static int getSize(int n) {
        int result = 1;
        for(int i=0; i<n; i++)
            result *= 2;
        return result;
    }
}

/*public class Main {
	
	public static int count = 0;
	
	public static void Zcount(int arr[][], int startX, int startY,int endX,int endY,int r, int c) {
		
		
		
		for(int i=startX;i<endX;i++) {
			for(int j=startY;j<endY;j++) {
				if(arr[i][j] == arr[r][c]) {
					System.out.println(count);
				}
				count++;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int num = 1;
		
		for(int i=1;i<N;i++) num *=N;
		
		int arr[][] = new int[num][num];
		
		int startX = 0;
		int startY = 0;
		int endX = arr.length;
		int endY = arr.length;
		
		Zcount(arr,startX,startY,endX/2,endY/2,r,c); //0,0,4,4
		Zcount(arr,startX,endY/2,endX/2,endY,r,c);   //0,2,2,4
		Zcount(arr,endX/2,startY,endX,endY/2,r,c);	 //2,0,4,2
		Zcount(arr,endX/2,endY/2,endX,endY,r,c);	// 2,2,4,4
	}
}
*/