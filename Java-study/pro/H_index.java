package work;
import java.util.*;
public class H_index {
/*사실 아직도 문제 이해 잘 못하겠음....일단 인덱스랑 배열 값이랑 비교해서 배열 값이 인덱스보다 커질때를 
 * 구하라는 말로 알아듣고 해결했다. 문제 이해를 잘 못하겠어서 설명이 어려운데
 * 버려두기는 뭐해서 일단 올려놓음
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i= {2};
		solution(i);
	}
	private static void solution(int[] citations) {
		// TODO Auto-generated method stub
		Arrays.sort(citations);
		int h_index = 0;
		

			for (int i=0;i<citations.length;i++) {
					if(citations[i]>=citations.length-i) {
						h_index=citations.length-i;
						break;
					}
			}
		System.out.println(h_index);
	}

}
