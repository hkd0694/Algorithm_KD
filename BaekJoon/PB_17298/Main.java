package PB_17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //첫째수 A 입력
        int N = Integer.parseInt(br.readLine());
        //수 입력 ex) 9 5 4 8
        StringTokenizer st = new StringTokenizer(br.readLine());
        //스택을 만들어줌  스택안에는 (element, position) (값, 위치)
        Stack<InputA> stack = new Stack<InputA>();
        //A 크기만큼 배열을 만들어 준다.
        int[] ans = new int[N];
        //처음 배열을 new 하면 0으로 초기화 하지만 Arrays.fill을 쓰면 배열의 모든 값을 -1로 초기화
        Arrays.fill(ans, -1); 
        //for문으로 N만큼 루프
        for (int i = 0; i < N; i++) {
        	//값을 하나씩 element 에다가 넣는다.
            int element = Integer.parseInt(st.nextToken());
            //만약 스택이 비어있다면
            if(!stack.isEmpty()) {
            	//가장 위에 있는 스택 뽑아서 compVal에다가 넣음.
                InputA compVal = stack.peek();
                //만약 스택 맨위에 있는 element 값과 비교
                if(compVal.element < element) {
                	//스택이 비어있지 않으면!!
                    while(!stack.isEmpty()) {
                    	//맨위에 있는 스택값을 뽑는다.
                        compVal = stack.pop();
                        if(compVal.element < element){
                            ans[compVal.position] = element;
                        } else {
                            stack.add(compVal);
                            break;
                        }
                    }
                    stack.add(new InputA(element, i));
                }
                //스택 맨위에 있는 값보다 작으면 바로 스택에 또 넣음
                else {
                    stack.add(new InputA(element, i));
                }
            } 
            //스택이 비어있지 않으면 스택안에다가 그 값과 위치를 넣는다.
            else {
                stack.add(new InputA(element, i));
            }
        }
        bw.write(Arrays.toString(ans).replaceAll("\\[|\\]|,|", "") + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}

class InputA{
    int element, position;
    public InputA(int element, int position){
        this.element = element;
        this.position = position;
    }
}