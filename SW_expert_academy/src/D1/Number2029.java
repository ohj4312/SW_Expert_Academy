package D1;

import java.util.Scanner;

//몫과 나머지 출력하기(2029-D1)
//입력 
/*
3    //test_case 수
9 2  
15 6 
369 15    
*/
public class Number2029 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		sc.nextLine();
	
		for(int i=0;i<tc;i++) {
			int one=0,two=0;
			String[] s=sc.nextLine().split(" ");
			one=Integer.parseInt(s[0])/Integer.parseInt(s[1]);
			two=Integer.parseInt(s[0])%Integer.parseInt(s[1]);
			System.out.println("#"+(i+1)+" "+one+" "+two);
		}
	}
}
