package D2;

import java.util.Scanner;

//달팽이 숫자 (1954-D2)
public class Number1954 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int[][] pang=new int[n][n];
			
			int[][] to= {{0,1},{1,0},{0,-1},{-1,0}}; //오, 아, 왼, 위 순서
			int turn=0;
			int number=1; //수를 부여하기 위함
			int nextx=0;
			int nexty=0;
			
			while(turn<n*2-1) { // 뱅글뱅글 도는 수
				while(nextx<n&&nextx>=0&&nexty<n&&nexty>=0) {
					pang[nextx][nexty]=number;
					nextx=nextx+to[turn%4][0];
					nexty=nexty+to[turn%4][1];
					//인덱스 에러가 나는 경우
					if(nexty>=n||nexty<0) {
						nexty=nexty-to[turn%4][1];
						break;
					}else if(nextx>=n||nextx<0) {
						nextx=nextx-to[turn%4][0];
						break;
					}
					
					//이미 채워진 것은 패스
					if(pang[nextx][nexty]!=0) {
						if(to[turn%4][0]!=0) {
							nextx=nextx-to[turn%4][0];														
						}else {
							nexty=nexty-to[turn%4][1];							
						}
						break;
					}
					number++;
				}
				turn++;
			}
			//출력
			System.out.println("#"+(i+1)+" ");
			for(int a=0;a<n;a++) {
				for(int b=0;b<n;b++) {
					System.out.print(pang[a][b]+" ");
				}
				System.out.println();
			}
			
		}
	}
}
