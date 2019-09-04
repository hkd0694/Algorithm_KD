package PB_2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	   public static void main (String[] args) throws Exception{
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = null;
	      st = new StringTokenizer(br.readLine());

	      int day= Integer.parseInt(st.nextToken());//낮에 올라가는 미터
	      int night= Integer.parseInt(st.nextToken());//밤에 미끄러지는 미터
	      int top=Integer.parseInt(st.nextToken());//정상 높이

	      System.out.println(Snail(day, night, top));
	   }

	   public static int Snail(int a, int b, int v) {
	      int total=0;

	      total=(v-b)/(a-b);
	      if((v-b)%(a-b)!=0)
	          total++;

	      return total;

	   }

	}