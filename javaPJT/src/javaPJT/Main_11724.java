package javaPJT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11724 {
	final static int MAX = 1000+10;
	static boolean[][] graph;
	static boolean[] visited; 
	static int N, M;
	static int answer;
	
	public static void dfs(int idx) {
		visited[idx] = true;
		for(int i=1; i<=N ; i++) {
			if(visited[i]==false && graph[idx][i]) dfs(i);				
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//0.입력 및 초기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new boolean[MAX][MAX];
		visited = new boolean[MAX];
		
		
		//1.graph에 연결 정보 채우기
		int u , v;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			u= Integer.parseInt(st.nextToken());
			v= Integer.parseInt(st.nextToken());
			
			graph[u][v] = true;
			graph[v][u] = true;
			
		}
		
		
		//2.dfs(재귀함수) 호출
		for(int i=1; i<=N ; i++) {
			if(visited[i]==false) {
				dfs(i);
				answer++;
			}
			
		}
		
		//3.출력
		bw.write(String.valueOf(answer));
		br.close();
		bw.close();
		
	}

}
