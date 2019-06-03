import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubble_Sort {
	
	//버블 정렬로 정렬해주는 배열 
	//빅오표기법 
	//best -> O(n2) avg -> O(n2) worst -> O(n2) 
	//sec -> 22.894
	private static int[] bubble(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			int temp;
			for(int j=0;j<i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	//백준 알고리즘 돌려보면 
	//메모리	: 14292KB
	//시간	: 136ms
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int arr[] = new int[test];
		for(int i=0;i<test;i++) arr[i] = Integer.parseInt(br.readLine());
		
		System.out.println("정렬 하기 전 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
		//버블 정렬
		bubble(arr);
		System.out.println("정렬 한 후 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
