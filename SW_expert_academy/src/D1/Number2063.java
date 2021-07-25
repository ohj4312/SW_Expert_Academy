package D1;
import java.util.Scanner;


//중간값 찾기(2063-D1)
public class Number2063 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] num=sc.nextLine().split(" ");
		String temp;
		
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<num.length-1;i++) {
				if(Integer.parseInt(num[i])>Integer.parseInt(num[i+1])) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
		
		System.out.println(num[n/2]);
	}
}

