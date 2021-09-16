package D3;
import java.util.Scanner;

public class Number3307 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		sc.nextLine();
		for(int t=1;t<=tc;t++) {
			int n=sc.nextInt();
			sc.nextLine();
			int[] arr=new int[n];
			int[] LTS=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				LTS[i]=1; //최소값 초기화
			}
			sc.nextLine();
			
			int max=0;
			for(int i=0;i<arr.length;i++) {
				 for(int j=0;j<i;j++) {
					 if(arr[j]<arr[i]&&LTS[i]<LTS[j]+1) {
						 LTS[i]=LTS[j]+1;
					 }
				 }
				 if(max<LTS[i]) max=LTS[i];
			}
			
			System.out.println("#"+t+" "+max);
		}
	}
}
