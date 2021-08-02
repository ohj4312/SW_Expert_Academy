package D3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//원재의 메모리 복구하기(1289-D3)
public class Number1289_useStringBuilder {
	public static void main(String[] args) throws FileNotFoundException {
		//파일로 받기
		System.setIn(new FileInputStream("src/D3/input.txt")); 
		//입력
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		sc.nextLine();
		
		//답
		int[] answer=new int[tc];
		
		for(int t=0;t<tc;t++) {
			int cnt=0;
			String input=sc.nextLine();
			char[] ch=input.toCharArray();
			StringBuilder st=new StringBuilder();
			for(int i=0;i<input.length();i++) {
				st.insert(i, "0");
			}
			for(int k=0;k<input.length();k++) {
				//문제 헤결: 만약 다 맞춰지게 되더라도 검사는 해야된다.
				if(st.equals(input)) break;
				
				//다른 자리부터 끝까지 바뀌는 코드 구현부
				if(st.charAt(k)!=ch[k]) {
					cnt++;
					if(ch[k]=='1') {
						for(int j=k;j<st.length();j++) {
							//st.insert(j, '1');
							st.setCharAt(j, '1');
						}
					}else if(ch[k]=='0') {
						for(int j=k;j<st.length();j++) {
							//st.insert(j, '0');
							st.setCharAt(j, '0');
						}
						
					}
				}
			}
			answer[t]=cnt;
		}
		//출력
		for(int a=0;a<answer.length;a++) {
			System.out.println("#"+(a+1)+" "+answer[a]);			
		}
	}
}
