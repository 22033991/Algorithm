package javaPJT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		long sum[] = new long[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i<=n; i++) {
			sum[i]= sum[i-1]+Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<len; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end =  Integer.parseInt(st.nextToken());
			System.out.print(sum[end]-sum[start-1]);
		}
	}

}
