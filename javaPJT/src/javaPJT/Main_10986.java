package javaPJT;

import java.io.IOException;
import java.util.Scanner;

public class Main_10986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long[] sum = new long[n];
		long[] result = new long[m];
		
		sum[0]= sc.nextInt();
		long cnt = 0;
		
		for(int i=1; i<n; i++) {
			sum[i] = sum[i-1]+sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			int rst = (int)(sum[i]%m);
			if(rst==0) cnt++;
			result[rst]++;
		}
		for(int i=0;i<m;i++) {
			if(result[i]>1) {
				cnt = cnt + (result[i]*(result[i]-1)/2);
			}
		}
		System.out.println(cnt);
		
	}

}
