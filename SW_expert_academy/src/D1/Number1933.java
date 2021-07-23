package D1;

import java.util.ArrayList;
import java.util.Scanner;

//간단한 N의 약수(1933-D1)
public class Number1933 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		//약수가 몇개인지 알수없으므로 배열이아닌 ArrayList로 생성해서 가변적으로 만든다.
		ArrayList<Integer> answer=new ArrayList<>();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				answer.add(i);
			}
		}
		
		for(int i=0;i<answer.size();i++) {
			System.out.print(answer.get(i)+" ");
		}
		
	}
}
