package D1;
import java.util.Scanner;
/*
test_case
5
22220228
20150002
01010101
20140230
11111111
    
 * */

//연월일 달력 (2056-D1)
public class Number2056 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		sc.nextLine();   
		
		for(int i=0; i<input; i++) {
			String cases=sc.nextLine();
			char[] s=new char[cases.length()];
			
			//구분자를 쓸 수 없어서 char배열로 변환하는 반복문
			for(int j=0;j<s.length;j++) {
				s[j]=cases.charAt(j);  				
			}
			
			//월(index :4,5) , 일(index:6,7)  조건 
			if(s[4]>'1'||(s[4]=='1'&&s[5]>'2')||s[5]=='0'||s[6]>'3'||(s[6]=='3'&&s[7]>'1')||(s[5]=='2'&&s[6]>'2')||(s[5]=='2'&&s[6]=='2'&&s[7]>'8')) {
				s[0]='a';
			}
			
			//review : s[4]+s[5] / s[6]+s[7] 을 각각 월 일로 구분해 조건을 설정했으면 코드의 가독성이 향상했을 거 같다.
			
			//출력
			System.out.print("#"+(i+1)+" ");
			for(int k=0; k<s.length; k++) {
				if(s[0]=='a') {
					System.out.println("-1");
					break;
				}
				else if(k==3||k==5)
					System.out.print(s[k]+"/");
				else
					System.out.print(s[k]);
				if(k==s.length-1)
					System.out.println();
			}
			
		}
		
		
	}
}

