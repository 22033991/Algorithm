package javaPJT;

import java.io.IOException;
import java.util.Scanner;

public class Main_2018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 1;
		int end = 1;
		int count = 1;
		int sum = 1;
		
		while(end!=n) {
			if(sum == n) {
				end++;
				sum =sum+end;
				count++; 
			}
			else if (sum > n) {
				sum = sum-start;
				start++;
			}
			else {
				end++;
				sum = sum+end;
			}
		}
		System.out.println(count);	
		
	}

}
