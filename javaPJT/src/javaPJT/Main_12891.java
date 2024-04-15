package javaPJT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12891 {

	public static int[] checkArr;
	public static int[] myArr;
	public static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		
		int length = Integer.parseInt(st.nextToken());
		int subLength = Integer.parseInt(st.nextToken());
		
		char[] dnaArr = br.readLine().toCharArray();
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		
		st = new StringTokenizer(br.readLine());
		for( int i = 0 ; i <4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i]==0) checkSecret++;
		}
		
		for(int i=0; i<subLength; i++) {
			Add(dnaArr[i]);
		}
		if(checkSecret==4) count++;
		for(int i=subLength; i<length; i++) {
			int j = i-subLength;
			Add(dnaArr[i]);
			Remove(dnaArr[j]);
			if(checkSecret==4) count++;
		}
		System.out.println(count);
		br.close();
		
	}
	public static void Add(char c) {
		switch(c) {
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
	}
	public static void Remove(char c) {
		switch(c) {
		case 'A' :
			if(myArr[0] == checkArr[0]) checkSecret--;
				myArr[0]--;
			break;
		case 'C' :
			if(myArr[1] == checkArr[1]) checkSecret--;
				myArr[1]--;
			break;
		case 'G' :
			if(myArr[2] == checkArr[2]) checkSecret--;
				myArr[2]--;
			break;
		case 'T' :
			if(myArr[3] == checkArr[3]) checkSecret--;
				myArr[3]--;
			break;
		}
	}

}
