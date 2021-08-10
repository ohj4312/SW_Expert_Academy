package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1233 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/input (9).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1;t<=10;t++) {
			
			int n=Integer.parseInt(br.readLine());
			int answer=1;
			
			while(n-->0) {
				String[] input=br.readLine().split(" ");
				if(input.length>2) {
					//상위 노드일 경우 숫자가 오면 유효하지 않다.
					//test_case 1 > 10 7 20 21 (20 7 21 은 연산이 아니다!)
					if(!"+*-/".contains(input[1])) {	//if(!(input[1].equals("+"))&&!(input[1].equals("*"))&&!(input[1].equals("-"))&&!(input[1].equals("/"))) {
						answer=0;
						break;
					}
					//continue;
				}else {
					//리프 노드일 경우 연산자가 오면 유효하지 않다. (리프노드일 경우 자식노드가 없으므로 배열길이는 2)
					if("+*-/".contains(input[1])) {		//if(input[1].equals("+")||input[1].equals("*")||input[1].equals("-")||input[1].equals("/")) {
						answer=0;
						break;
					}
				}
			}
			
			//break로 인해 받아오지 못한 나머지 readLine을 받아온다. (연산할 필요는 없다)
			while(n-->0) {
				br.readLine();
			}
			
			System.out.println("#"+t+" "+answer);
		}
	}
}
