import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell_Sort {
	
	private static void inc_insertion(int arr[], int first, int last, int gap) {
		int key,j;
		for(int i=first+gap; i<=last; i=i+gap) {
			key = arr[i];
			for(j=i-gap; j>=first && arr[j]>key; j=j-gap){
			      arr[j+gap] = arr[j];
			}
			arr[j+gap] = key;
		}
	}
	//선택 정렬로 정렬해주는 배열 
	//빅오표기법 
	//best -> O(n) avg -> O(n1.5) worst -> O(n2) 
	//sec -> 0.056
	private static int[] shell(int arr[]) {
		
		for(int i=arr.length/2; i>0;i=i/2) {
			if(i%2==0) i++;
			
			for(int gap=0;gap<i;gap++) {
				inc_insertion(arr,gap,arr.length-1,i);
			}
		}
		return arr;
	}
	
	//백준 알고리즘 돌려보면 
	//메모리	: 14080KB
	//시간	: 112ms
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int arr[] = new int[test];
		for(int i=0;i<test;i++) arr[i] = Integer.parseInt(br.readLine());
		
		System.out.println("정렬 하기 전 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
		//셸 정렬
		shell(arr);
		System.out.println("정렬 한 후 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();

	}
}
