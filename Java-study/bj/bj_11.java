package bj_work2;

import java.util.*;

//백준12748
//n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

public class bj_11 {
static int[]num;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();// n번째를 입력받는다.
		num=new int[n+1];//수열을 저장할 배열.0이 포함되어있으니 n+1의 크기로 설정
		num[0]=0;//0번째는 0
		num[1]=1;//1번째는 1
		
			for(int i=2;i<n+1;i++){
				num[i]=num[i-2]+num[i-1];//i=2부터  F(n)=F(n-1)+F(n-2)로 수열 확대
			}

		System.out.println(num[n]);
	}
}
//분명 제대로 나오는데 틀렸다 그러네
//뭐가 틀렸는지 설명이라도 해라 그지같다
//도저히 모르겠어서 패스
	
	
