package D1;

import java.util.Scanner;

//서랍의 비밀번호(2043-D1)

public class Number2043 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] num=sc.nextLine().split(" ");
		int p=Integer.parseInt(num[0]);
		int k=Integer.parseInt(num[1]);
		
		//while문 동안 + 되는데 같을때 조건이 한번 더 들어가지 않으므로 1부터 시작
		int answer=1;
		
		while(k!=p) {
			if(k==999) {
				k=0;
			}
			k++;
			answer++;
		}
		
		System.out.println(answer);
	}
}
