package D1;
import java.util.Scanner;


//최대수 구하기(2068-D1)
public class Number2068 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		String[] answer=new String[t];
		for(int i=0;i<t;i++) {
			String[] num=sc.nextLine().split(" ");
			String temp;
			for(int j=0;j<num.length-1;j++) {
				for(int k=0;k<num.length-1;k++) {
					if(Integer.parseInt(num[k])>Integer.parseInt(num[k+1])) {
						temp=num[k];
						num[k]=num[k+1];
						num[k+1]=temp;
					}
				}
			}
			answer[i]=num[num.length-1];
			System.out.println("#"+(i+1)+" "+answer[i]);
		}
		
	
	}
}

