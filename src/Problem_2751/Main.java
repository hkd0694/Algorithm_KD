package Problem_2751;

/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Integer> merge_sort(ArrayList<Integer> in){
		
		ArrayList<Integer> array1;
		ArrayList<Integer> array2;
		
		if(in.size() != 1) {
			array1 = merge_sort(new ArrayList<Integer>(in.subList(0, (in.size() - 1) / 2 + 1)));
			// array의 우측 수열을 재귀함수로 호출
			array2 = merge_sort(new ArrayList<Integer>(in.subList((in.size() - 1) / 2 + 1, in.size())));
		} else {
			return in;
		}
		
		return combineArray(array1,array2);
	}
	
	public static ArrayList<Integer> combineArray(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		
		while(array1.size() > i || array2.size() >j) {
			if (i >= array1.size()) { // array1의 모든 원소가 정렬됬을 경우
				newArray.add(array2.get(j)); // newArray에 array2의 첫번째 넣는다.
				j++;
			} else if (j >= array2.size()) { // array2의 모든 원소가 정렬됬을 경우
				newArray.add(array1.get(i)); // newArray에 array1의 첫번째 원소를 넣는다.
				i++;
			} else {
				if (array1.get(i) > array2.get(j)) { // array1의 첫번째 원소가 array2의
														// 첫번째 원소보다 클 경우
					newArray.add(array2.get(j)); // newArray에 array2의 첫번째 넣는다.
					j++;
				} else { // array1의 비교 원소가 array2의 비교 원소보다 작을 경우
					newArray.add(array1.get(i)); // newArray에 array1의 첫번째 원소를
													// 넣는다.
					i++;
				}
			}
		}
		
		return newArray;
	}

	//병합 정렬 및 힙 정렬 사용
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();
		int test = scanner.nextInt();
		
		for(int i=0;i<test;i++) {
			input.add(scanner.nextInt());
		}
		
		output = merge_sort(input);
		
		for(int j=0;j<output.size();j++) {
			System.out.println(output.get(j));
		}
		
	}
	
	
}*/
//ArrayList 로 병합정렬 했는데 시간초과남...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
 
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> data = new ArrayList<Integer>();
            for(int i=0; i<n; i++) {
                data.add(Integer.parseInt(br.readLine()));
            }
            //Collections.sort 이용
            Collections.sort(data);
            for(int i=0; i<n; i++) {
                System.out.println(data.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}