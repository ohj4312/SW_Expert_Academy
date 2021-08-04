package D2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2001 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("src/input (4).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		String[] nm=new String[2];
		int n,m;
		
		for(int i=0;i<t;i++) {
			//입력
			nm=br.readLine().split(" ");
			n=Integer.parseInt(nm[0]);
			m=Integer.parseInt(nm[1]);
			int[][] pan=new int[n][n];
			for(int a=0;a<n;a++) {
				String[] input=br.readLine().split(" ");
				for(int b=0;b<n;b++) {
					pan[a][b]=Integer.parseInt(input[b]);
				}
			}
			
			//m*m씩 검사
			int max=0;
			int sum=0;
			//ab 반복 : pan위치 검색 /n-m+1은 검사 위치별 필요없는 부분 제거한것, / cd반복은 현 위치에서 m만큼 떨어진 위치 검사하는 것
			for(int a=0;a<n-m+1;a++) {
				for(int b=0;b<n-m+1;b++) {
					for(int c=0;c<m;c++) {
						for(int d=0;d<m;d++) {
							sum+=pan[a+c][b+d];
						}
					}
					if(sum>max) max=sum;
					sum=0;
				}	
			}			
			System.out.println("#"+(i+1)+" "+max);
		}
	}
}
