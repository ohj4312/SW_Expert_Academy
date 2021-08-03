package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//Ladder1 (1210-D4)
public class Number1210 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/D4/input (2).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[][] sadari=new char[100][100];
		
		for(int i=0;i<10;i++) {
			int t=Integer.parseInt(br.readLine());
			for(int j=0;j<sadari.length;j++) {
				String[] temp=br.readLine().split(" ");
				for(int s=0;s<temp.length;s++) {
					sadari[j][s]=temp[s].charAt(0);
				}
			}
			
			//당첨인덱스 구하기, 당첨인덱스로부터 위로 올라가는 걸로 (위,왼쪽,오른쪽만 보면된다)
			int anindex=0;
			for(int k=0;k<sadari[sadari.length-1].length;k++) {
				if(sadari[sadari.length-1][k]=='2') {
					anindex=k;
				}
			}
			int x=anindex;
			int y=sadari.length-2;
			while(y!=0) {			
				if(x+1<sadari.length&&sadari[y][x+1]=='1') {
					x=x+1;
					sadari[y][x-1]='0';
				}
				else if(x-1>0&&sadari[y][x-1]=='1') {
					x=x-1;
					sadari[y][x+1]='0';
				}
				else {
					y=y-1;
				}
			}
			System.out.println("#"+(i+1)+" "+x);
		}
	}
}
