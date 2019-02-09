package Problem_4673;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[10001];
		
		for(int i=1; i<=array.length;i++) {
			change(array,i);
		}
		
		for(int j=1;j<array.length;j++) {
			if(array[j] == 0) {
				System.out.println(j);
			}
		}

	}
	
	public static void change(int array[],int i) {
		int sum =0;
		while(i<10000) {
			sum = i;
			while(i>0) {
				sum +=i%10;
				i=i/10;
			}
			if(sum > 10000)
				break;
			array[sum] = 1;
			i=sum;
		}
		
	}

}
