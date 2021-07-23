package D1;
import java.util.Scanner;


//더블더블(2019-D1)
public class Number2019 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] answer=new int[num+1];
		
		//구현 의도 :for문 하나로 작업할 수 있지만 2의 0승,2의1승 2의 2승 ..2의 n승으로 구현하고자 한다.
		for(int i=0;i<=num;i++) {
			answer[i]=1;
			for(int j=0;j<i;j++) {
				answer[i]*=2;
			}
			System.out.print(answer[i]+" ");
		}
		
		
	}
}

