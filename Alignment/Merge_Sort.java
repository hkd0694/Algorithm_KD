import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Merge_Sort {
	
	//병합 정렬로 정렬해주는 배열 
	//빅오표기법 
	//best -> O(nlonN) avg -> O(nlonN) worst -> O(nlogN) 
	//sec -> 0.026
	private static void merge(int list[], int left, int mid, int right) {
		int i, j, k, l;
		i = left;
		j = mid+1;
		k = left;
		  
		int sorted[] = new int[list.length];

		  /* 분할 정렬된 list의 합병 */
		while(i<=mid && j<=right){
		   if(list[i]<=list[j])
		      sorted[k++] = list[i++];
		   else
		      sorted[k++] = list[j++];
		}
		  // 남아 있는 값들을 복사
		  if(i>mid){
		    for(l=j; l<=right; l++)
		      sorted[k++] = list[l];
		  } else{
		    for(l=i; l<=mid; l++)
		      sorted[k++] = list[l];
		  }
		  // 배열 sorted[](임시 배열)의 리스트를 배열 list[]로 재복사
		  for(l=left; l<=right; l++){
		    list[l] = sorted[l];
		  }
	}
	
	private static void merge_sort(int arr[], int left, int right) {
		int mid;
		
		if(left<right){
		    mid = (left+right)/2; // 중간 위치를 계산하여 리스트를 균등 분할 -분할(Divide)
		    merge_sort(arr, left, mid); // 앞쪽 부분 리스트 정렬 -정복(Conquer)
		    merge_sort(arr, mid+1, right); // 뒤쪽 부분 리스트 정렬 -정복(Conquer)
		    merge(arr, left, mid, right); // 정렬된 2개의 부분 배열을 합병하는 과정 -결합(Combine)
		}
	}

	//백준 알고리즘 돌려보면 
	//메모리	: 17976KB
	//시간	: 124ms
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int arr[] = new int[test];
		for(int i=0;i<test;i++) arr[i] = Integer.parseInt(br.readLine());
		
		System.out.println("정렬 하기 전 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
		//병합 정렬
		merge_sort(arr ,0 , arr.length-1);
		System.out.println("정렬 한 후 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
