package javaPJT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main_17298 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];//수열배열
		int[] asw = new int[n];
		String[] numStr = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) { 
			arr[i] = Integer.parseInt(numStr[i]); //수열 채우기
		}
		
		Stack<Integer> stack = new Stack<>();//인덱스를 넣음
		stack.push(0);
		
		for(int i=0; i<arr.length; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i] ) {
				asw[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			asw[stack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<asw.length; i++) {
			bw.write(asw[i]+" ");
			
		}
		bw.write("\n");
		bw.flush();
		
	}
	
}
