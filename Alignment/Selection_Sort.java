import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selection_Sort {
	//선택 정렬로 정렬해주는 배열 
	//빅오표기법 
	//best -> O(n2) avg -> O(n2) worst -> O(n2) 
	//sec -> 10.438
	private static int[] selection(int arr[]) {
		int least;
		for(int i=0;i<arr.length;i++) {
			least = i;
			int temp;
			for(int j=least;j<arr.length;j++) {
				if(arr[least] > arr[j]) least = j;
			}
			temp = arr[i];
			arr[i] = arr[least];
			arr[least] = temp;
		}
		return arr;
	}
	
	//백준 알고리즘 돌려보면 
	//메모리	: 14256KB
	//시간	: 128ms
	//선택정렬이 더 빠르네?..
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int arr[] = new int[test];
		for(int i=0;i<test;i++) arr[i] = Integer.parseInt(br.readLine());
		
		System.out.println("정렬 하기 전 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
		//선택 정렬
		selection(arr);
		System.out.println("정렬 한 후 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
