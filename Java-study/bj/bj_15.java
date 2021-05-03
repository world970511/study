package bj_work2;

import java.util.*;

//백준2675
//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성
public class bj_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//입력받을 문자열의 개수
		String[]str=new String[n];//문자열을 저장받을 공간
		
		for(int i=0;i<n;i++){
			int n2=in.nextInt();//반복할 횟수 입력
			str[i]=in.next();//문자열 입력
			str[i]=reStr(n2,str[i]);
			//함수로 이동하여 문자들을 반복해 새 문자열 생성후 다시 저장
		}
		for(int i=0;i<n;i++){
			System.out.println(str[i]);//출력
		}
	}

	private static String reStr(int n2, String str) {
		// TODO Auto-generated method stub
		String str2="";//리턴시킬 새로운 문자열(각 문자를 R번 반복시킨 문자열)
		for(int i=0;i<str.length();i++){//문자열 인덱스 이동용
			for(int i2=0;i2<n2;i2++){//반복할 횟수만큼 반복
				str2+=str.charAt(i);
				//각 인덱스의 안에 저장된 문자를 반복시켜 새로운 문자열에 저장
			}
		}
		return str2;
	}
}
