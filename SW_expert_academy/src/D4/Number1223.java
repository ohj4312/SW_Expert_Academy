package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number1223 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/D4/input (4).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack=new Stack<>();
		
		for(int t=1;t<=10;t++) {
			//입력
			int n=Integer.parseInt(br.readLine());
			String str=br.readLine();
			
			for(int i=0;i<n;i++) {
				if(str.charAt(i)!='+'&&str.charAt(i)!='*') { //숫자가 들어올 때
					stack.push(str.charAt(i)-'0');
				}else if(str.charAt(i)=='*') { //곱하기가 들어올 때
					stack.push(stack.pop()*(str.charAt(i+1)-'0'));
					i++;
				}
			}
			
			//이제 숫자들만 남은 스택을 모두 더해주면 답!
			int sum=0;
			while(!stack.isEmpty()) {
				sum+=(int)stack.pop();
			}
			
			//출력
			System.out.println("#"+t+" "+sum);
		}
	}
}
