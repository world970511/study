package bj_work3;

import java.util.Scanner;
//백준10830
//참조:https://gongbu-ing.tistory.com/75
//a^5=(a^2)^2*a또는 a^10=a(a^2*a^2)^2 라는 제곱의 합과 재귀함수를 응용한 문제
public class bj_23 {
	static long[][]num;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		n=in.nextInt();//행렬의 크기 입력
		long b=in.nextLong();//제곱해야 하는 횟수

		num=new long[n][n];
		
		for(int i=0;i<n;i++){
			for(int i2=0;i2<n;i2++){
				num[i][i2]=in.nextInt();//행렬의 값 입력
			
			}
		}
		
		long [][]res=toDo(b);// 함수를 이용하여 정답 입력
		
		
		for(int i1=0;i1<res.length;i1++){
			for(int i2=0;i2<res[0].length;i2++){
					System.out.print(res[i1][i2]+" ");
				}
				System.out.println();//출력
			}
		 }
	private static long[][] toDo (long b) {
		// TODO Auto-generated method stub
		long [][] ans = new long[n][n];//답을 입력할 공간
		long [][]temp=new long [n][n];// 이전 혹은 행렬의^2를 호출하기 위한 공간
		if(b==1){
			for(int i=0;i<n;i++){
				for(int i2=0;i2<n;i2++){
					ans[i][i2]=num[i][i2]%1000;
				}//b=1일 경우 입력과 동일함으로 바로 출력
			}
		}
		else if(b%2==0){//b가 짝수일 경우
			temp=toDo(b/2);//ex:a^2일 때 a를 호출.
			for(int i=0;i<n;i++){
				for(int i2=0;i2<n;i2++){
					int ans1=0;
					for(int i3=0;i3<n;i3++){
						ans1+=temp[i][i3]*temp[i3][i2];
						//b가 짝수일 경우 a^b/2행렬을 호출하여 곱함
						//a^4=(a^2)^2임을 응용
						
					}
					ans[i][i2]=ans1%1000;
				}
			}
		}
		else if(b%2==1){//b가 홀수일 경우
			temp=toDo(b-1);//이전에 제곱한 행렬을 호출
			for(int i=0;i<n;i++){
			for(int i2=0;i2<n;i2++){
				int ans1=0;
				for(int i3=0;i3<n;i3++){
					ans1+=temp[i][i3]*num[i3][i2];//이전의 값*원래 행렬
				}
				ans[i][i2]=ans1%1000;
			}
			}
		}
		return ans;	
	}
}
//런타임 에러 떠서 ???? 이랬는데 b가 int형을 넘어서 입력 가능한지라 long형으로 바꿔야 했음
//주의