package D2;

import java.util.Scanner;

public class Number1974_HaveMistake {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[][] arr=new int[9][9];
		for(int i=1;i<=t;i++) {			
			
			int answer=1;
			//배열로 만들어서 합을 저장할 필요없이 그때그때 합으로 answer를 바꿔주기만하면 된다!
			int[] asum=new int[9]; 
			int[] bsum=new int[9];
			int[] csum=new int[9];
			
			//입력 + asum check(가로)
			for(int n=0;n<9;n++) {
				for(int m=0;m<9;m++) {
					arr[n][m]=sc.nextInt();
					asum[n]+=arr[n][m];
				}
				//1~9 합 : 45
				if(asum[n]!=45) answer=0;
				sc.nextLine();
			}
			
			//bsum check (세로)
			for(int n1=0;n1<9;n1++) {
				for(int m1=0;m1<9;m1++) {
					bsum[n1]+=arr[m1][n1];
				}
				if(bsum[n1]!=45) answer=0;
			}
			
			//csum check(작은네모)
			int a=0;
			for(int n2=0;n2<9;n2=n2+3) {
				for(int m2=0;m2<9;m2=m2+3) {
					for(int tempn=n2;tempn<n2+3;tempn++) {
						for(int tempm=m2;tempm<m2+3;tempm++) {						
							csum[a]+=arr[tempn][tempm];
						}
					}
					a++;
				}
				if(csum[n2]!=45) answer=0;				
			}
			
			//출력
			System.out.println("#"+i+" "+answer);
		}
	}
}
// StringBuilder를 만들고 sb.append만 하고 출력에서 다 찍어줘도 된다. 대박사건

//반례
/*
 1
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
 5 5 5 5 5 5 5 5 5
*/
