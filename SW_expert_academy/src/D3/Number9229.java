package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number9229 {
	static int[] arr;
	static int sum=0,max=0;
	static int n,m;
	static int[] temp;
  private static void comb(int cnt,int[] temp,int start) {
	  if(cnt == 2) {
			for(int a=0;a<2;a++) {
				sum+=temp[a];
			}
			if(sum<=m) {
				if(max<sum) {
					max=sum;
				}
			}
			if(max==0) {
				max=-1;
			}
			sum=0;
			return;
		}
		for(int i=start;i<arr.length;i++) {
			temp[cnt]=arr[i];
			comb(cnt+1,temp,i+1);
		}
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("src/sample_input (1).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++) {
			String[] nm=br.readLine().split(" ");
			n=Integer.parseInt(nm[0]);
			m=Integer.parseInt(nm[1]);
			
			String[] weight=br.readLine().split(" ");
			arr=new int[weight.length];
			for(int a=0;a<weight.length;a++) {
				arr[a]=Integer.parseInt(weight[a]);
			}
			
			comb(0,new int[2],0);
			
			//출력
			System.out.println("#"+i+" "+max);
			max=0;
		}
	}
}
