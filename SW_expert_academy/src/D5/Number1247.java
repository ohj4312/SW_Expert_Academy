package D5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1247 {
	private static int[][] dist;
	private static int[] temp;
	private static int min=Integer.MAX_VALUE;
	
	public static void perm(int cnt,int flag) {
		//회사 집빼고 순열 만들었으면 리턴
		if(cnt==dist.length-1) {
			//System.out.println(Arrays.toString(temp));
			if(min>setDist()) min=setDist();
			return;
		}
		
		for(int i=2;i<dist.length;i++) {
			if((flag&1<<i)!=0) continue;
			temp[cnt]=i;
			perm(cnt+1,flag|1<<i);
		}
	}
	
	
	private static int setDist() {
		temp[0]=0;
		temp[temp.length-1]=1;
		int sum=0;
		
		for(int i=0;i<temp.length-1;i++) {
			sum+=Math.abs(dist[temp[i]][0]-dist[temp[i+1]][0])+Math.abs(dist[temp[i]][1]-dist[temp[i+1]][1]);
		}
		return sum;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int TC=Integer.parseInt(br.readLine());
		
		for(int t=1;t<=TC;t++) {
			
			//입력
			int n=Integer.parseInt(br.readLine());
			String distinput=br.readLine();
			StringTokenizer st=new StringTokenizer(distinput," ");
			dist=new int[st.countTokens()/2][2];
			temp=new int[st.countTokens()/2];
			for(int d=0;d<dist.length;d++) {
				for(int i=0;i<2;i++) {
					dist[d][i]=Integer.parseInt(st.nextToken());
				}
			}
			
			//고객을 순열로!
			//거리 : dist[0] 회사 -> 고객(순열) -> dist[1] 집
			perm(1,0);
			
			//출력
			System.out.println("#"+t+" "+min);
			min=Integer.MAX_VALUE;
		}
	}
}
