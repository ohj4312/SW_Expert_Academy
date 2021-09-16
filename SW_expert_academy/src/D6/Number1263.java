package D6;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1263 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		int INF=987654321; // 안나올 큰값
		int tc=Integer.parseInt(br.readLine());
		for(int t=1;t<=tc;t++) {
			String str=br.readLine();
			st=new StringTokenizer(str," ");
			int n=Integer.parseInt(st.nextToken());
			int[][] graph=new int[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					graph[i][j]=Integer.parseInt(st.nextToken());
					if(graph[i][j]==0) graph[i][j]=INF; 
				}
			}
			
			//경유지 k를 거쳐서 출발지 i에서 목적지 j로 가는 비용을 계산
			for(int k=0;k<n;k++) {
				for(int i=0;i<n;i++) {
					//출발점 == 경유지는 관심 없다~
					if(k==i) continue;
					for(int j=0;j<n;j++) {
						//경유지 == 목적지 관심없다~
						if(k==j) continue;
						//경유해서 가는 비용이 더 적다면 바꿔주자!!
						graph[i][j]=Math.min(graph[i][k]+graph[k][j], graph[i][j]);
					}
				}
			}
			
			int minCC=Integer.MAX_VALUE;
			for(int r=0;r<n;r++) {
				int sum=0;
				for(int c=0;c<n;c++) {
					if(r!=c) {
						sum+=graph[r][c];
					}
				}
				minCC=Math.min(sum, minCC);
			}
			
			System.out.println("#"+t+" "+minCC);
		}
		
	}
}
