package bj_work2;

import java.util.Scanner;

public class bj_12 {
//백준10773
//첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
//이후 K개의 줄에 정수가 1개씩 주어진다. 
//정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
//모든 수를 받아 적은 후 그 수의 합을 출력한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//정수 k를 설정
		int [] help=new int[n];//k개의 정수를 저장할 객체 help설정
		int plus=0;//합을 출력하기위한 변수
		
		for(int i=0;i<n;i++){
			help[i]=in.nextInt();//정수 입력
			if(help[i]==0&&i>0){//입력한 정수가 0일 경우&& i가 0보다 클 경우 시작
				for(int i2=i-1;i2>=0;i2--){//i보다 작아지는 반복(이전것을 확인한다)
					if(help[i2]!=0){//만약 이전 것이 0이 아닐 경우
						help[i2]=0;//이전 것을 0으로 변경하고 
						break;//최조 반복으로 돌아간다.
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			plus+=help[i];//모든 값을 plus변수에 합하여 저장한다
		}
		System.out.println(plus);//출력
	}

}
