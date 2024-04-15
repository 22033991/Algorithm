package javaPJT;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1940 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] num = new int[n];
		
		for(int i= 0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		int end_idx = n-1;
		int start_idx = 0;
		
		int count = 0;
		
		while(start_idx <end_idx) {
			if(num[start_idx]+num[end_idx] == m) {
				count++;
				start_idx++;
				end_idx--;
			}else if(num[start_idx]+num[end_idx] > m) {
				end_idx--;
			}else {
				start_idx++;
			}
		}
		System.out.println(count);
		
		
	}

}
