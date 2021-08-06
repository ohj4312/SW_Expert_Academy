package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3499 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int idx1=0,idx2=0;
		for(int i=1;i<=t;i++) {
			int n=Integer.parseInt(br.readLine());
			String[] arr=br.readLine().split(" ");
			String[] ans=new String[arr.length];
			idx2=(arr.length%2==0)?arr.length/2:arr.length/2+1;
			
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					ans[j]=arr[idx1];
					idx1++;
				}else {
					ans[j]=arr[idx2];
					idx2++;
				}
			}
			idx1=0;
			idx2=0;
			System.out.print("#"+i+" ");
			for(String a : ans) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
