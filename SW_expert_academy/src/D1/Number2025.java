package D1;
import java.util.Scanner;


//N줄 덧셈(2025-D1)
public class Number2025 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}

