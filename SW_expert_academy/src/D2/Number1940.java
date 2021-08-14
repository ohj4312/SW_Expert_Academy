package D2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1940 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/D2/input (8).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++) {
			int c=Integer.parseInt(br.readLine());
			int move=0;
			int ms=0;
			for(int j=0;j<c;j++) {
				String[] input=br.readLine().split(" ");
				int pm=Integer.parseInt(input[0]);
				int speed=0;
				if(input.length!=1) {
					speed=Integer.parseInt(input[1]);
				}
				if(pm==1) {
					ms+=speed;
					move+=ms;
				}else{
					ms-=speed;
					if(ms<0) {
						ms=0;
					}
					move+=ms;
				}
			}
			
			//출력
			System.out.println("#"+i+" "+move);
		
		}
		
	}
}
