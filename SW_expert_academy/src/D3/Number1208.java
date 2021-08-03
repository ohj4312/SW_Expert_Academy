package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Flatten (1208-D3)
public interface Number1208 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("src/D3/input (1).txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] depth=new int[100];
		int[] answer=new int[10];
		//10번의 테스트 케이스가 주어진다.
		for(int i=0;i<10;i++) {
			int dump=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			for(int j=0;j<input.length;j++) {
				depth[j]=Integer.parseInt(input[j]);
			}
			
			Arrays.sort(depth);
			//n->0으로 0이 1보다 커질때까지 주고,n이 n-1보다 작아지면 바꿔야돼 .
			//연산을줄이기 위해 1-0만큼을 n에서 떼오면 만약 n이랑 n-3인덱스자리가 1인덱스-0자리보다 차이가 안나면 꼬임.
			//그렇다고 n 이랑 n-1이랑만 바꾸면 계속 두개만 왔다갔다 하면서 바뀌는 문제점이 생긴다.
			//sort를 계속해주며 해결
			for(int k=0;k<dump;k++) {
				depth[0]++;
				depth[depth.length-1]--;
				Arrays.sort(depth);
			}
			
			answer[i]=depth[depth.length-1]-depth[0];
			
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.println("#"+(i+1)+" "+answer[i]);
		}
		
	}
}
