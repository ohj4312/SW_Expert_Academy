package D1;
import java.util.Scanner;


//큰놈 작은놈 같은놈(2070-D1)
public class Number2070 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		String[] answer=new String[t];
		
		for(int i=0;i<t;i++) {
			String[] num=sc.nextLine().split(" ");
			int a=Integer.parseInt(num[0]);
			int b=Integer.parseInt(num[1]);
			
			if(a>b) answer[i]=">";
			else if(a==b) answer[i]="=";
			else answer[i]="<";
					
			System.out.println("#"+(i+1)+" "+answer[i]);
		}
		
	
	}
}

