package Problem_1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//C 코드
		/*#include <stdio.h>
		#include <stdlib.h>

		int main() {

			int count,i;
			double *grade;
			double max = 0,sum = 0;

			scanf("%d",&count);
			
			grade = (double*)malloc(sizeof(double)*count);

			for (i = 0; i < count; i++) {
				scanf("%lf",&grade[i]);
				if (max < grade[i])
					max = grade[i];
			}

			for (i = 0; i < count; i++) {
				grade[i] = grade[i] / max * 100;
				sum += grade[i];
			}

			printf("%.2f",sum/count);

			return 0;
		}*/

	}

}
