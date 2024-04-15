package javaPJT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();//인덱스를 넣음
		
		for(int i=0; i<n; i++) { 
			queue.add(i+1);
		}
		while(queue.size()>1) {
			queue.poll();
			int num = queue.poll();
			queue.add(num);
		}
		
		System.out.println(queue.poll());
		
		
	}
	
}
