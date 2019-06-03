import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insertion_Sort {
	
	//선택 정렬로 정렬해주는 배열 
	//빅오표기법 
	//best -> O(n) avg -> O(n2) worst -> O(n2) 
	//sec -> 7.438
	private static int[] insertion(int arr[]) {
		int key;
		for(int i=0;i<arr.length-1;i++) {
			key = arr[i+1];
			int count = i+1;
			int j = count;
			for(;j>=1;j--) {
				if(key < arr[j-1]) {
					arr[j] = arr[j-1]; 
				}else {
					break;
				}
			}
			arr[j] = key;
		}
		return arr;
	}

	//백준 알고리즘 돌려보면 
	//메모리	: 14344KB
	//시간	: 136ms
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int arr[] = new int[test];
		
		for(int i=0;i<test;i++) arr[i] = Integer.parseInt(br.readLine());
		
		System.out.println("정렬 하기 전 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		insertion(arr);
		
		System.out.println("정렬 한 후 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
