package D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number6808 {
	private static int[] arr=new int[9];
	private static List<Integer> gyu=new ArrayList<>();
	private static List<Integer> in=new ArrayList<>();
	private static int win=0,lose=0;

	//private static int[] gyu=new int[9];
	//private static int count=0;
	
	private static void compare() {
		int gyusum=0,insum=0;
		for(int i=0;i<9;i++) { //9 라운드 경기
			if(gyu.get(i)>arr[i]) {
				gyusum+=gyu.get(i)+arr[i];
			}else {
				insum+=gyu.get(i)+arr[i];
			}
		}
		
		if(gyusum>insum) win++;
		else if(gyusum<insum) lose++;
		
	}
	
	private static void perm(int cnt,int flag) {
		if(cnt==9) { //순열이 1개씩 완성됨.
			compare();
			return;
		}

		for(int i=0;i<9;i++) {
			if((flag&1<<i)!=0) continue;
			arr[cnt]=in.get(i);
			perm(cnt+1,flag|1<<i);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=t;i++) {
			//입력 -인영이, 규영이
			//규 배열
			for(int g=0;g<9;g++) {
				gyu.add(sc.nextInt());
			}			
			int num=1;
			//인영이
			while(in.size()<10) {
				if(!gyu.contains(num)) {
					in.add(num);
				}
				num++;
			}
			
			//순열 만들기
			perm(0, 0);
			
			//출력
			System.out.println("#"+i+" "+win+" "+lose);
			win=0;lose=0;
			gyu.clear();in.clear();
		}
	}
}
