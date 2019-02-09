package Problem_1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num,count=0;
		int num1;
		int result=0;

		num = scanner.nextInt();
		if (num >= 0 && num < 100) {
			num1 = num;
			do {
				if (num1 < 10) {
					result = num1 % 10;
				}
				else {
					result = num1 / 10 + num1 % 10;
				}

				num1 = (num1 % 10)*10 + (result % 10);

				count++;
			} while (num != num1);

			System.out.println(count);
		}
	}

}

/*#include <stdio.h>

int main() {

	int num,count=0;
	int num1;
	int result=0;

	scanf("%d",&num);
	if (num >= 0 && num < 100) {
		num1 = num;
		do {
			if (num1 < 10) {
				result = num1 % 10;
			}
			else {
				result = num1 / 10 + num1 % 10;
			}

			num1 = (num1 % 10)*10 + (result % 10);

			count++;
		} while (num != num1);

		printf("%d",count);
	}
	return 0;
}*/