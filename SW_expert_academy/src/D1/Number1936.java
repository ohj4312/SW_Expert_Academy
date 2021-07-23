package D1;

import java.util.Scanner;

//1대1 가위바위보(1936-D1)
//가위는 1, 바위는 2, 보는 3
//입력 : A(1~3) B(1~3)
public class Number1936 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] num=sc.nextLine().split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		char answer=0;
		
		if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)) answer='A';
		else if((a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1)) answer='B';
		else System.out.println("잘못 입력했습니다.");
		
		System.out.println(answer);
	}
}
