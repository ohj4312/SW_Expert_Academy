package D4;

import java.util.Scanner;

public class Number3289 {
	
	private static int[] parents;
	
	private static int find(int x) {
		if(parents[x]==x) return x; //자기 자신이 대표자인 경우
		return parents[x]=find(parents[x]);
	}
	
	private static void union(int a,int b) {
		if(find(a)==find(b)) return;
		parents[find(a)]=find(b);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int TC=sc.nextInt();
		sc.nextLine();
		for(int t=1;t<=TC;t++) {
			StringBuilder sb=new StringBuilder();
			int n=sc.nextInt();
			int m=sc.nextInt();
			sc.nextLine();
			
			parents=new int[n+1]; //1부터 쓰기 위함
			//make-set
			for(int i=1;i<=n;i++) {
				parents[i]=i; //make set일 때 대표자는 자기자신
			}
			
			
			for(int i=0;i<m;i++) {
				int check=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
				sc.nextLine();
				
				
				if(check==0) {
					//Union
					union(a, b);
				}else if(check==1) {
					//find-Set
					if(find(a)==find(b)) sb.append(1);
					else sb.append(0);
				}
				
			}
			
			//출력
			System.out.println("#"+t+" "+sb);
		}
		
	}
}
