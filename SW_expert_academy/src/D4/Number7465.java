package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Number7465 {
	static int N;
	static int[] parents; 
	
	private static void make() { 
	 	for (int i = 1; i <= N; i++) {
			parents[i]=i;
		}
	}
	
	private static int find(int a) {
		if(a==parents[a]) return a; 
		return parents[a]=find(parents[a]); 
	}
	

	private static boolean union(int a,int b) { 
		int aRoot=find(a);
		int bRoot=find(b);
		if(aRoot==bRoot) return false;
		
		parents[bRoot]=aRoot; 
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int TC=Integer.parseInt(br.readLine());
	 	for(int t=1;t<=TC;t++) {
		 	String nm=br.readLine();
		 	StringTokenizer st=new StringTokenizer(nm, " ");
		 	N=Integer.parseInt(st.nextToken());
		 	parents=new int[N+1];
		 	int m=Integer.parseInt(st.nextToken());
			
			//make set
			make();
			
			for(int i=0;i<m;i++) {
				nm=br.readLine();
				st=new StringTokenizer(nm," ");
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				
				union(a,b);
			}
			
			
			Set<Integer> set=new HashSet<>();
			for(int i=1;i<=N;i++) {
				find(i);
				set.add(parents[i]);
			}
			
			System.out.println("#"+t+" "+set.size());
	 	}
	}
}
