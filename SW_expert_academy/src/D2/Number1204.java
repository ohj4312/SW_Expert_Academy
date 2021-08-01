package D2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//최빈수 구하기(1204-D2)
public class Number1204 {
	public static void main(String[] args) {
		File file=new File("src/D2/input.txt");
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			int test=Integer.parseInt(br.readLine());
			for(int i=0;i<test;i++) {
				//입력받기
				int testnum=Integer.parseInt(br.readLine());
				String[] input=br.readLine().split(" ");
				int[] intarr=new int[input.length];
				for(int k=0;k<input.length;k++) {
					intarr[k]=Integer.parseInt(input[k]);
				}
				
				//점수 빈도수 세기
				int[] answer=new int[101];
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
