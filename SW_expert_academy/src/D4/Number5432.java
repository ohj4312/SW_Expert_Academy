package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5432 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/sample_input.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		long startime=System.currentTimeMillis(); //천분의 1초단위로 세줭
		for(int i=0;i<t;i++) {
			int plus=0;
			int minus=0;
			int sum=0;
			String input=br.readLine();
			for(int a=0;a<input.length();a++) {
				if(a+1<input.length()&&input.charAt(a)=='('&&input.charAt(a+1)==')') { //for문전에 ()레이저를 V로 replace해줄수도 있다.
					//레이저에요!!
					sum+=plus;
					//plus+=minus;
					//minus=0;
					//다음인덱스를 검사해 레이저포인트를 잡았으므로.
					a++;
				}else if(input.charAt(a)=='(') {
					//열리면 판때기가 추가된거
					plus++;
				}else if(input.charAt(a)==')') {
					//닫히면 판때기가 끝난거! ==>판날때 sum을 +1하면 minus변수를 다시 관리할 필요가 없다.
					sum++;
					plus--;
					//minus--;
				}
				/*
				System.out.println(a+" plus:"+plus);
				System.out.println(minus);
				System.out.println("sum:"+sum);*/
			/*	if(a==(input.length()-1)) {
					if(plus!=0) sum+=plus;
				}
				*/
			}
			//System.out.println("답");
			System.out.println(sum);
		}
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-startime);
	}
}
