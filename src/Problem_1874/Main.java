package Problem_1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {//죤나 쉽게 푸네...
	
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int i, temp, max = 0, top = 0;
        int stack[] = new int[n];
        
        while (n-- > 0) {
            temp = Integer.parseInt(br.readLine());
            
            if (temp > max) {
                // 스택에 값이 없는 상태
                for (i = max+1; i <= temp; i++) {
                    stack[top++] = i;
                    sb.append("+\n");
                }
                max = temp;
            }else if (stack[top - 1] != temp) {
                System.out.print("NO");
                return;
            }
 
            top--;
            sb.append("-\n");
        
        }// end while
        
        System.out.println(sb);
    }
	
	/*public static void main(String[] args) {//제대로 출력되는데 런타임 에러 뜬다... 이유 모르겠음
		
		Scanner scanner = new Scanner(System.in);
		int size = -1;
		int alpa = 0;
		int topNumber = 0;
		int test = scanner.nextInt();
		char a[] = new char[300000];
		int stack[] = new int[test];
		for(int i=0;i<stack.length;i++) {
			int num = scanner.nextInt();
			if(i==0) {
				topNumber = num+1; //i=1이고 num이 클경우 topNumber부터 찾아야함
				if(num == 1) {
					a[alpa] = '+';
					alpa++;
					a[alpa] = '-';
					alpa++;
					size++;
					stack[size] = 1;
					continue;
				}
				for(int j=1;j<=num;j++) {
					size++;
					stack[size] = j;
					a[alpa] = '+';
					alpa++;
				}
				stack[size] = 0;
				size--;
				a[alpa] = '-';
				alpa++;
			} else {
				if(stack[size] == num) {
					a[alpa]='-';
					alpa++;
					stack[size] = 0;
					size--;
				}
				else if(stack[size] > num) { //스택 오류
					a[0] = 'p';
					a[alpa] = 'p';
					alpa++;
				} else {
					for(int k=topNumber;k<=num;k++) {
						size++;
						stack[size] = k;
						a[alpa]='+';
						alpa++;
					}
					stack[size] = 0;
					size--;
					a[alpa]='-';
					alpa++;
					topNumber = num+1;
				}
			}
		}
		
		if(a[0] != 'p') {
			for(int l=0;l<alpa;l++) {
				System.out.println(a[l]);
			}
		} else {
			System.out.println("NO");
		}
	}*/
}
