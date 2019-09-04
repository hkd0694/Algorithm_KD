package PB_4673;

public class Main {
	
	
	public static void check(int arr[], int i) {
		int sum = 0;
		
		while(i < 10000) {
			sum = i;
			while(i > 0) {
				sum += i%10;
				i /=10;
			}
			if(sum > 10000)
				break;
			arr[sum] = 1;
			i=sum;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = new int[10001];
		
		for(int i=1;i<=arr.length;i++) check(arr,i);
		
		for(int i=1;i<arr.length;i++) 
			if(arr[i] == 0) System.out.println(i);
		
	}
}
