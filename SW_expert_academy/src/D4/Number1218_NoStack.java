package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


//발생하는 문제 : (<)> 일경우 , )( 일경우를 맞는 걸로 한다.
public class Number1218_NoStack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("src/D4/input (5).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int answer=1;
		
		for(int i=0;i<10;i++) {
			int[] num=new int[4]; //(,[,{,<
			int len=Integer.parseInt(br.readLine());
			char[] input=br.readLine().toCharArray();
			for(int j=0;j<len;j++) {
				switch(input[j]) {
					case '(':
						num[0]++;
						break;
					case ')':
						num[0]--;
						break;
					case '[':
						num[1]++;
						break;
					case ']':
						num[1]--;
						break;
					case '{':
						num[2]++;
						break;
					case '}':
						num[2]--;
						break;
					case '<':
						num[3]++;
						break;
					case '>':
						num[3]--;
						break;
				}
			}
			for(int a=0;a<num.length;a++) {
				if(num[a]!=0) { 
					answer=0;
					break;
				}
			}
			
			System.out.println("#"+(i+1)+" "+answer);
			answer=1;
		}
	}	
}
