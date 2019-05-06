package PB_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		int test = Integer.parseInt(st.nextToken());
		Deque<Integer> de = new ArrayDeque<>();
		
		for(int i=1;i<=number;i++) de.add(i); //queue에 값을 모두 집어넣는다.

		int count = 0;
		st = new StringTokenizer(br.readLine());
		for(int j=0;j<test;j++) {
			int index = Integer.parseInt(st.nextToken());
			Iterator<Integer> iterator = de.iterator();
			int Fcount = 0; //2번 연산 count 값 저장할 변수
			while(iterator.hasNext()) {
				//iterator를 통하여 queue안에 있는 값들을 앞에서부터 count한다.
				int a = iterator.next();
				if(a == index) {
					break;
				} else {
					Fcount++;
				}
			}
			int Lcount = de.size() - Fcount;  //3번 연산 count 값 저장할 변수
			//2번 연산보다 3번연산이 더 클경우
			if(Fcount <= Lcount) {
				//2번 연산 과정
				while(index != de.peekFirst()) {
					int Fde = de.pollFirst();
					de.addLast(Fde);
					count++;
				}
				de.pollFirst();
			} 
			//2번 연산보다 3번연산이 더 작을 경우
			else {
				//3번 연산 과정
				while(index != de.peekFirst()) {
					int Lde = de.pollLast();
					de.addFirst(Lde);
					count++;
				}
				de.pollFirst();
			}
		}
		System.out.println(count);
	}
}
