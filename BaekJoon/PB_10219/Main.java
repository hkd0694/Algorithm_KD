package PB_10219;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int h =  Integer.parseInt(br.readLine().split(" ")[0]);
            for(int j = 0; j < h; j++) {
                sb.append(new StringBuilder(br.readLine()).reverse()).append("\n");
            }
        }
         
        bw.write(sb.toString());
        bw.close();
	}

}
