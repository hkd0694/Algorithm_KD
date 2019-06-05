import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quick_Sort {
	
	private static int partition(int list[], int left, int right) {
		int pivot, temp;
		int low, high;

		low = left;
		high = right + 1;
		pivot = list[left]; // 정렬할 리스트의 가장 왼쪽 데이터를 피벗으로 선택(임의의 값을 피벗으로 선택)

		/* low와 high가 교차할 때까지 반복(low<high) */
		do{
		    /* list[low]가 피벗보다 작으면 계속 low를 증가 */
		  do {
		    low++; // low는 left+1 에서 시작
		  } while (low<=right && list[low]<pivot);
		  /* list[high]가 피벗보다 크면 계속 high를 감소 */
		  do {
		    high--; //high는 right 에서 시작
		  } while (high>=left && list[high]>pivot);
		    // 만약 low와 high가 교차하지 않았으면 list[low]를 list[high] 교환
		    if(low<high){
		    	temp = list[low];
		    	list[low] = list[high];
		    	list[high] = temp;
		    }
		  } while (low<high);
		  // low와 high가 교차했으면 반복문을 빠져나와 list[left]와 list[high]를 교환
		temp = list[left];
	    list[left] = list[high];
	    list[high] = temp;
		// 피벗의 위치인 high를 반환
		return high;
	}
	
	//퀵 정렬로 정렬해주는 배열 
	//빅오표기법 
	//best -> O(nlonN) avg -> O(nlonN) worst -> O(n2) 
	//sec -> 0.014
	private static void quick_sort(int arr[] , int left, int right) {
		if(left<right){
		    // partition 함수를 호출하여 피벗을 기준으로 리스트를 비균등 분할 -분할(Divide)
		    int q = partition(arr, left, right); // q: 피벗의 위치
		    // 피벗은 제외한 2개의 부분 리스트를 대상으로 순환 호출
		    quick_sort(arr, left, q-1); // (left ~ 피벗 바로 앞) 앞쪽 부분 리스트 정렬 -정복(Conquer)
		    quick_sort(arr, q+1, right); // (피벗 바로 뒤 ~ right) 뒤쪽 부분 리스트 정렬 -정복(Conquer)
		  }
	}
	
	//백준 알고리즘 돌려보면 
	//메모리	: 14440KB
	//시간	: 124ms
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int arr[] = new int[test];
		for(int i=0;i<test;i++) arr[i] = Integer.parseInt(br.readLine());
		
		System.out.println("정렬 하기 전 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
		//퀵 정렬
		quick_sort(arr ,0 , arr.length-1);
		System.out.println("정렬 한 후 배열");
		for(int i=0;i<test;i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
