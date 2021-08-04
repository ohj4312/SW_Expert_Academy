package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
public class Number1873 {
	private static char[][] map;
	private static char[] move;
	private static int mapx;
	private static int mapy;
	
	
	private static void moveOrshot(int index,int x,int y) {
		if(index==move.length) return;
		
		switch(move[index]) {
			case 'U': 
				if(x-1>=0&&map[x-1][y]=='.') {
					map[x][y]='.';
					x=x-1;
				}
				map[x][y]='^';
				break;
			case 'D':
				if(x+1<mapx&&map[x+1][y]=='.') {
					map[x][y]='.';
					x=x+1;
				}
				map[x][y]='v';
				break;
			case 'L':
				if(y-1>=0&&map[x][y-1]=='.') {
					map[x][y]='.';
					y=y-1;
				}
				map[x][y]='<';
				break;
			case 'R':
				if(y+1<mapy&&map[x][y+1]=='.') {
					map[x][y]='.';
					y=y+1;
				}
				map[x][y]='>';
				break;
			case 'S':
				int temp;
				switch(map[x][y]) {
				case '^':
					temp=x;
					while(temp>=0) {
						if(map[temp][y]=='*') {
							map[temp][y]='.';
							break;
						}else if(map[temp][y]=='#') {
							break;
						}
						temp--;
					}
					break;
					
				case 'v':
					temp=x;
					while(++temp<mapx) {
						if(map[temp][y]=='*') {
							map[temp][y]='.';
							break;
						}else if(map[temp][y]=='#') {
							break;
						}
					}
					break;
					
				case '<':
					temp=y;
					while(temp>=0) {
						if(map[x][temp]=='*') {
							map[x][temp]='.';
							break;
						}else if(map[x][temp]=='#') {
							break;
						}
						temp--;
					}
					break;
					
				case '>':
					temp=y;
					while(temp<mapy) {
						if(map[x][temp]=='*') {
							map[x][temp]='.';
							break;
						}else if(map[x][temp]=='#') {
							break;
						}
						temp++;
					}
					break;
				}
				break;
		}
		moveOrshot(index+1, x, y);
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			String[] mapnm=br.readLine().split(" ");	
			mapx=Integer.parseInt(mapnm[0]);
			mapy=Integer.parseInt(mapnm[1]);
			map=new char[mapx][mapy];	//2차원 배열의 맵 구조
			int startx=0;
			int starty=0;
			
			for(int m=0;m<mapx;m++) {
				String line=br.readLine();
				for(int p=0;p<mapy;p++) {
					map[m][p]=line.charAt(p);
					if(map[m][p]=='>'||map[m][p]=='<'||map[m][p]=='^'||map[m][p]=='v') {
						startx=m; starty=p;
					}
				}
			}
			int usernum=Integer.parseInt(br.readLine());
			String minput=br.readLine();
			move=new char[usernum]; //움직이는 키들
			for(int u=0;u<usernum;u++) {
				move[u]=minput.charAt(u);
			}
			
			moveOrshot(0, startx, starty);  
			
			System.out.print("#"+(i+1)+" ");
			for(int m=0;m<mapx;m++) {
				for(int p=0;p<mapy;p++) {
					System.out.print(map[m][p]);
				}
				System.out.println();
			}
		}
	}
}
