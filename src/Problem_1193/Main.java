package Problem_1193;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int i,j;
		int front = 1, back = 1;
		int Rfront = 0;
		int Rback =0;
		
		int num = scanner.nextInt();
		
		while(true) {
			if(front%2 ==1 && back%2==1) {
				for(i=front,j=1;j<=back;i--,j++) {
					count++;
					if(num == count) {
						Rfront = i;
						Rback = j;
						break;
					}
				}
			}else {
				for(i=1,j=back;i<=front;i++,j--) {
					count++;
					if(num == count) {
						Rfront = i;
						Rback = j;
						break;
					}
				}
			}
			if(Rfront != 0 || Rback !=0) {
				break;
			}
			front++;
			back++;
		}
		
		System.out.println(Rfront + "/" + Rback);
	}

}