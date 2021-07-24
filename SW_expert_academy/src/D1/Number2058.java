package D1;
	import java.util.Scanner;
	
	
	//자릿수 더하기(2058-D1)
	public class Number2058 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String input=sc.nextLine();
			 int answer=0;
			for(int i=0;i<input.length();i++) {
				answer+=input.charAt(i)-48;
			}
			System.out.println(answer);
			
			
		}
	}

