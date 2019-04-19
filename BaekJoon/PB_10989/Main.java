package PB_10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	    
		int[] numbers; //입력된 숫자
    	int[] countArr;//숫자 세기
  
    	int max = 0;
    	int index = 0;
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    void inputNumbers() throws IOException {//숫자 입력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine().trim());
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            numbers[i] = num;
            if (max < num) {
                max = num;
            }
        }
    }
 
    void sort() throws IOException {
        inputNumbers();
        int maxNumber = max;
        countArr = new int[maxNumber + 1]; //0-maxNumber+1만큼 생성
        for (int i = 0; i < numbers.length; i++) {
            //해당하는 숫자 카운터
            countArr[numbers[i]]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            for (int j = 0; j < countArr[i]; j++) {
                bw.write(i+"\n");
            }
        }
        bw.close();      
    }
 
    public static void main(String[] args) throws IOException {
        new Main().sort();
    }
}
