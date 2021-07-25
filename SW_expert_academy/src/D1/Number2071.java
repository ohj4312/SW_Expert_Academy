package D1;
import java.util.Scanner;


//평균 구하기(2071-D1)
public class Number2071 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		float[] answer=new float[t];
		
		
		for(int i=0;i<t;i++) {
			String[] num=sc.nextLine().split(" ");
			float sum=0;
			for(int j=0;j<num.length;j++) {
				sum+=Integer.parseInt(num[j]);
			}
			
			//반올림 구현 (소수점 첫째자리에서 반올림 (Math.round 메소드 활용)
			answer[i]=Math.round(sum/num.length);
			
			System.out.printf("#%d %.0f \n",i+1,answer[i]);
		}
		
	
	}
}

