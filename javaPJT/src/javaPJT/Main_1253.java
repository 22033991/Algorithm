package javaPJT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1253 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] num = new long[n];
		for(int i= 0; i<n; i++) {
			num[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int count = 0;
		for(int i = 0 ; i<n; i++) {
			
			long find = num[i];
			int end_idx = n-1;
			int start_idx = 0;
			
			while(start_idx < end_idx) {
				if(num[start_idx]+num[end_idx] == find) {
					if(start_idx !=i && end_idx !=i ) {
						count++; break;
					}else if (start_idx == i) {
						start_idx++;
					}else if(end_idx==i) {
						end_idx--;
					}
				}else if(num[start_idx]+num[end_idx] < find) {
					start_idx++;
				}else {
					end_idx--;
				}
			}
		}
		
		System.out.println(count);
		br.close();
		
	}

}
