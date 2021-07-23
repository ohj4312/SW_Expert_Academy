package D1;

import java.util.Scanner;

//아주 간단한 계산기(1938-D1)
public class Number1938 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] num=sc.nextLine().split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		
		 // + , - , * , / 순서로 출력
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
	}
}
