package D1;
import java.util.Scanner;


//알파벳을 숫자로 변환(2050-D1)
public class Number2050 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str.toUpperCase();
		
		char[] strarr=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			strarr[i]=str.charAt(i);
			System.out.print(strarr[i]-64+" ");
		}
		
		
	}
}
