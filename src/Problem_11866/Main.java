package Problem_11866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new LinkedList<>();
		
		String num = br.readLine();
		String[] d = num.split(" ");
		
		int N = Integer.parseInt(d[0]);
		int K = Integer.parseInt(d[1]);
		
		for(int i=1;i<=N;i++) queue.add(i);
		
		int count = 0;
		bw.write("<");
		while(queue.size() > 1) {
			count++;
			if(count % K == 0) {
				bw.write(queue.poll() +", ");
			}
			 else {
				int number = queue.poll();
				queue.add(number);
			}
		}
		bw.write(queue.poll() + ">");
		bw.flush();
		bw.close();
		br.close();
	}
}
