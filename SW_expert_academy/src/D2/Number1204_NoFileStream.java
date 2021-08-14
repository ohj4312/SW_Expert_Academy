package D2;

import java.util.Scanner;

//제출시 input 파일이 아닌 testcase를 키보드로 입력받기 때문에 FileReader를 제외한 코드
//최빈수 구하기(1204-D2)
public class Number1204_NoFileStream {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<test;i++) {
			//입력받기
			int testnum=sc.nextInt();
			sc.nextLine();
			String[] input=sc.nextLine().split(" ");
			int[] intarr=new int[input.length];
			for(int k=0;k<input.length;k++) {
				intarr[k]=Integer.parseInt(input[k]);
			}
			
			//점수 빈도수 세기
			int[] answer=new int[101]; //0점~ 100점이니까 101개
			for(int j=0;j<intarr.length;j++) {
				answer[intarr[j]]=answer[intarr[j]]+1;
			}
	

			int sol=0;
			for(int m=0;m<answer.length;m++) {
				if(answer[sol]<=answer[m]) {
					sol=m;
				}
			}

			//출력
			//sol-> 인덱스 번호 = 점수
			System.out.println("#"+testnum+" "+(sol));
		}
	
	}
}
