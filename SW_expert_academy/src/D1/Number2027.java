package D1;

//대각선 출력하기(2025-D1)
/* 출력 결과
#++++
+#+++
++#++
+++#+
++++#
*/
public class Number2027 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) System.out.print("#");
				else System.out.print("+");
			}
			System.out.println();
		}
	}
}
