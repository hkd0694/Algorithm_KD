package PB_11004;


//구글링한 코드
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[] arr;
	
	public static int quickSelect(int first, int last) {
		if (first == last) {
			return arr[first];
		}
		int pivotIndex = (int)((last - first + 1) * Math.random()) + first;
		swap(first, pivotIndex);
		int up = first;
		int down = last + 1;
		while (true) {
			while (++up <= last && arr[up] < arr[first]);
			while (--down > first && arr[down] > arr[first]);
			if (up < down) {
				swap(up, down);
			} else {
				break;
			}
		}
		pivotIndex = down;
		swap(first, pivotIndex);
		if (pivotIndex < k) {
			return quickSelect(pivotIndex + 1, last);
		} else if (pivotIndex > k) {
			return quickSelect(first, pivotIndex - 1);
		} else {
			return arr[pivotIndex];
		}
	}
	
	public static void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken()) - 1;
		
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(quickSelect(0, n - 1));
		
		br.close();
	}
}
//아래는 내코드.. 다 제대로 나오는데 어디서 틀렸는지모르겠다..
//퀵 정렬은 제대로 이해함
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int sort_pivot(long arr[] ,int left, int right) {
		
		long pivot = arr[left];
		int low = left+1;
		int high = right;

		long temp;
		
		do {
			while(low <= right && pivot > arr[low])  low++;
			while(left <= high && pivot < arr[high]) high--;
			
			if(low < high) {
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
			
		}while(low < high);
		
		temp = arr[high];
		arr[high] = arr[left];
		arr[left] = temp;
		
		return high;
	}
	
	private static int quick_sort(long arr[], int left, int right, int index) {
		
		int pivot = sort_pivot(arr, left, right);
        if(pivot == index) return (int) arr[pivot];
        else if(pivot > index) return quick_sort(arr, left, pivot-1, index);
        else return quick_sort(arr, pivot+1, right, index);
        
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int test = Integer.parseInt(st.nextToken());
		int index = Integer.parseInt(st.nextToken());
		
		long arr[] = new long[test];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<test;i++) arr[i] = Long.parseLong(st.nextToken());
		
		int left = 0;
		int right = arr.length-1;
		
		quick_sort(arr, left, right,index);
		
		System.out.println(arr[index-1]);
	}
}*/
