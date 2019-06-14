package PB_1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//구글링한 코드
public class Main {
	
	static int[][] video;
	  static StringBuffer sb;
	  public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = null;
	    int N = Integer.parseInt(br.readLine());
	    char[] low = null;
	    video = new int[N][N];
	    sb = new StringBuffer();
	     
	    for(int i = 0; i < N; i++){
	      st = new StringTokenizer(br.readLine());
	      low = st.nextToken().toCharArray();
	      for(int j = 0; j < N; j++){
	        video[i][j] = Integer.parseInt(low[j]+"");
	      }
	    }
	    compression(0, 0, video.length);
	    System.out.println(sb.toString());
	  }
	  public static void compression(int X, int Y, int size) {
	    int temp = video[X][Y];
	    boolean isSame = true;
	    for(int i = X; (i < X+size) && isSame; i++){
	      for(int j = Y; (j < Y+size) && isSame; j++){
	        if(temp != video[i][j])
	          isSame = false;
	      }
	    }
	    if(isSame)
	      sb.append(temp);
	    else{
	      sb.append("(");
	      compression(X, Y, size/2);
	      compression(X, Y+size/2, size/2);
	      compression(X+size/2, Y, size/2);
	      compression(X+size/2, Y+size/2, size/2);
	      sb.append(")");
	    }
	  }

	//내가 짠 코드. 왜틀렸는지 모르겠다 정답은 잘나옴
	/*private static StringBuffer sb = new StringBuffer();
	
	private static void QuadTree(int arr[][], int length,int aX, int aY, int bX, int bY) {
		
		System.out.print("(");
		int count = 0;
		while(count != 4) {
			int startX = 0; int startY = 0;
			int endX = 0; int endY = 0;
			
			switch(count) {
			case 0:
				startX = aX; startY = aY;
				endX = bX-length; endY = bY-length;
				break;
			case 1:
				startX = aX; startY = aY+length;
				endX = bX-length; endY = bY;
				break;
			case 2:
				startX = aX+length; startY = aY;
				endX = bX; endY = bY -length;
				break;
			case 3:
				startX = aX + length; startY = aY+length;
				endX = bX; endY = bY;
				break;
			}
			int first = arr[startX][startY];
			boolean ck = true;
			for(int i=startX; i<endX;i++) {
				for(int j=startY; j<endY;j++) {
					if(first != arr[i][j]) {
						ck = false;
						break;
					}
				}
				if(!ck) break;
			}
			
			if(!ck) QuadTree(arr, length/2, startX, startY, endX, endY);
			else System.out.print(first);
			count++;
		}
		System.out.print(")");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[test][test];
		int f = 0;
		boolean check = true;
		
		for(int i=0;i<test;i++) {
			String su = br.readLine();
			for(int j=0;j<test;j++) {
				if(i==0 && j==0) f = arr[i][j];
				arr[i][j] = Integer.parseInt(String.valueOf(su.charAt(j)));
				if(f != arr[i][j]) check = false;
			}
		}
		
		if(test == 1) {
			System.out.println(arr[0][0]);
			return;
		}
		
		if(!check) QuadTree(arr,test/2,0,0,test,test);
		else System.out.println(arr[0][0]);
		
		//bw.write(String.valueOf(sb));
		//bw.flush();
		//bw.close();
		br.close();
	}*/
}
