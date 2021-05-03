package bj_work;

import java.util.*;

//백준1427
//수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자
public class bj_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num=s.next();//수를 문자열로 입력받는다
		int size=num.length();//문자열의 길이
		int[]array=new int[size];//문자열의 길이와 같은 사이즈의 정수 배열 생성
		
		for(int i=0;i<size;i++){
			String a= Character.toString(num.charAt(i));//문자열>문자변환
			array[i]= Integer.parseInt(a);//문자>정수 변환 후 객체에 저장
		}
		
		
		Arrays.sort(array);	//오름차순으로 변환
		
		
		while(true){
			System.out.print(array[--size]);
			if(size==0)
			break;
			}// 오름차순으로 정리된 배열을 거꾸로 호출하여 출력
	}
}

