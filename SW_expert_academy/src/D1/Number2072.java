package D1;
import java.util.Scanner;
/*
test_case
3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1   
 * */

//홀수만 더하기(2072-D1)
public class Number2072 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		sc.nextLine();   
		
		int[] sum=new int[cnt];   
		for(int i=0; i<cnt; i++) {
			String[] s=sc.nextLine().split(" ");  
			
			for(int j=0; j<s.length; j++) {
				int n=Integer.parseInt(s[j]); 
				if(n%2==1)
					sum[i] += n;
			}
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println("#" + (i+1) +" " + sum[i]);
		}
	}
}

