package D2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//최빈수 구하기(1204-D2)
public class Number1204_CollectionFail {
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
				
				//점수를 Key값으로 갯수 세기
				//String으로 제네릭 타입을 해도 되지만 Integer로 문제의 의도에 맞춰 형 변환
				Map<Integer,Integer> cnt=new HashMap<>();
				for(int j=0;j<intarr.length;j++) {
					if(cnt.containsKey(intarr[j])) {
						cnt.put(intarr[j], cnt.get(intarr[j])+1);
					}else {
						cnt.put(intarr[j], 1);
					}
				}
				
				//가장 많은 갯수의 키값 출력하기
				/*
				 *  Collection<Integer> carr1=cnt.values();
				 */
				int answer;
				int[] carr=new int[cnt.size()];
				for(int m=0;m<cnt.size();m++) {
					//carr=cnt.keySet();
					
				}
				/*
				 * Arrays.sort(carr); int max=carr[carr.length-1];
				 * answer=cnt.containsValue(max);
				 */
				//출력
			//System.out.println("#"+testnum+max);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
