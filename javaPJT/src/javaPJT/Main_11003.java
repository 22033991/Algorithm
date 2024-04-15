package javaPJT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main_11003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken()); //전체
		long l = Long.parseLong(st.nextToken()); //슬라이딩 윈도
		
		Deque<Node> myDeque = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for(long i = 0; i < n ; i++) {
			long now = Long.parseLong(st.nextToken());
			while(!myDeque.isEmpty() && myDeque.getLast().value>now) {
				//myDeque가없고 ,now 값이 getLast 보다 작으면 계속 
				myDeque.removeLast();
			}
			myDeque.addLast(new Node(i, now));
			while(myDeque.getFirst().index<=i-l) {
				myDeque.removeFirst();
			}
			 bw.write(myDeque.getFirst().value + " ");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static class Node {
		public long value;
		public long index;
		
		Node(long value, long index){
			this.value = value;
			this.index = index;
		}
	}

}
