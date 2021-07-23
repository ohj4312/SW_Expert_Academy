package D1;

import java.util.Scanner;

//거꾸로 출력해보아요.(1545-D1)
public class Number1545 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); //8
		
		for(int i=num;i>=0;i--) {
			System.out.print(i+" ");
		}
		//8 7 6 5 4 3 2 1 0
	}
}
