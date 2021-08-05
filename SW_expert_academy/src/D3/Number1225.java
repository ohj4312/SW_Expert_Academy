package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number1225 {
	public static void main(String[] args) throws IOException {
		//System.setIn(new FileInputStream("src/D3/input (6).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue=new LinkedList<>();
		StringTokenizer st=null;
		for(int i=1;i<=10;i++) {
			br.readLine();
			String input=br.readLine();
			st=new StringTokenizer(input," ");
			for(int c=0;c<8;c++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}
			
			int temp=0;
			do {
				for(int idx=1;idx<=5;idx++) {
					temp=queue.poll()-idx;
					if(temp<=0) {
						queue.offer(0);
						break;
					}
					queue.offer(temp);
				}
			}while(temp>0);
			
			//출력
			System.out.print("#"+i+" ");
			for(int get : queue) {
				System.out.print(get+" ");
			}			
			System.out.println();
			queue.clear();
		}
	}
}

/*1
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
2
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
3
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
4
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
5
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
6
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
7
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
8
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
9
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644
10
2147483647 2147483640 2147483644 2147483647 2147483647 2147483646 2147483645 2147483644*/


//1번째 아이디어
/*
10 6 12 8 9 4 10 3
1 2 3 4 5 1 2 3
4 5 1 2 3 4 5 1
2 3 4 5 1 2 3 4
5 1 2 3 4 5 1 2 
3 4 5 1 2 3 4 5

==열의 합은 결국 15가된다.
*/


//2번째 아이디어
//10 6 12 8 9 4 10 3
//커서하나를 만들어서 이 배열에서 첫번째 원소가 가리키는 위치만 바꿔주면 된다. 그럼 빼고 넣고 할필요없이 만약 3번째에서 끝나면 4번째부터 출력하도록 만들 수 있잖아요

