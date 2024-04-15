package javaPJT;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;


public class Main_1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) { 
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
		int num = 1;
		boolean result = true;
		
		for(int i=0; i<arr.length; i++) {
			
			int su = arr[i]; 
			if(su>=num) {
				while(su>=num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}else { //su<num 
				int pop = stack.pop();
				if(pop > su) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					bf.append("-\n");
				}
				
			}
		}
		if(result) {
			System.out.println(bf.toString());
		}
		
		
	}
	
}
