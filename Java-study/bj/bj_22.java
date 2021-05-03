package bj_work3;

import java.util.*;
//백준2740
public class bj_22 {
	static int [][]a;
	static int [][]b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//a 행렬의 크기 입력
		int m=in.nextInt();
		a=new int[n][m];
		for(int i=0;i<n;i++){
			for(int i2=0;i2<m;i2++){
				a[i][i2]=in.nextInt();//a행렬의 값 입력
			}
		}
		
		int n2=in.nextInt();//b의 행렬 크기 입력
		int m2=in.nextInt();
		b=new int[n2][m2];
		for(int i=0;i<n2;i++){
			for(int i2=0;i2<m2;i2++){
				b[i][i2]=in.nextInt();//b의 행렬의 값 입력
			}
		}
		
		int [][]ans=new int[n][m2];//a*b의 값을 저장할 공간
		
		for(int i=0;i<n;i++){//a행렬의 열만큼 반복
			for(int i2=0;i2<m2;i2++){//b행렬의 행만큼 반복
				for(int i3=0;i3<n2;i3++){
					ans[i][i2]+=a[i][i3]*b[i3][i2];
				//a*b행렬의 값은 a*b[n][n]=a[n]행*b[n]열
				//그 값을 따로 계산하여 합함
				}
			}
		}
		
		for(int i=0;i<ans.length;i++){
			for(int i2=0;i2<ans[0].length;i2++){
				System.out.print(ans[i][i2]+" ");
			}
			System.out.println();
		}
	}
}
