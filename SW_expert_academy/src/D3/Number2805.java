package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2805 {
	private static int answer;//sum 값
	private static char[][] farm;
	
	private static void sum(int startx,int endx, int indexy) {
		//기저조건
		if(indexy==farm.length) return;
		
		//구현부
		int a=startx;
		while(a<=endx) {
			answer+=farm[a][indexy]-'0';
			a++;
		}
		
		if(indexy<farm.length/2) {
			startx--;
			endx++;
		}else {
			startx++;
			endx--;
		}
		
		//재귀호출
		sum(startx, endx, indexy+1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/input (3).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			farm=new char[n][n];
			
			for(int x=0;x<n;x++) {
				String line=br.readLine();
				for(int y=0;y<n;y++) {
					farm[x][y]=line.charAt(y);
				}
			}
			sum(n/2,n/2,0);
			
			//출력
			System.out.println("#"+(i+1)+" "+answer);
			answer=0;
		}
	}
}
