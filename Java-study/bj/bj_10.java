package bj_work2;

import java.util.*;
//백준11650
//2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로
//x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오

//사실 틀렸지만(찾아보니 Comparator? 그거 써서 푸는거더라) 버블정렬 기억하라고 저장

public class bj_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]x=new int[n];
		int[]y=new int[n];//x좌표와 y좌표를 저장할 객체 생성
		
		
		for(int i=0;i<n;i++){
			x[i]=in.nextInt();
			y[i]=in.nextInt();//x,y 좌표를 각각 받는다
			
		}
		
		int temp1,temp2,temp3=0;//잠시 저장을 위한 변수
		
		for(int i=0;i<n;i++){
			for(int i2=i+1;i2<n;i2++){
			if(x[i]>x[i2]){
				//버블 정렬을 활용하여 x를 오름차순 정리.
				//이때 y는 크기를 비교하지 않고,x를 따라 순서가 달라지도록 코딩
				temp1=x[i];
				temp2=y[i];
				x[i]=x[i2];
				y[i]=y[i2];
				x[i2]=temp1;
				y[i2]=temp2;
			}
				// x 오름차순으로 정리 후 x값 좌표가 같다면 y값 최소순으로 정리
				if(x[i]==x[i2]&&y[i]>y[i2]){
					temp3=y[i];
					y[i]=y[i2];
					y[i2]=temp3;
				}
			}
		}
		//출력
		for(int i=0;i<n;i++){	
			System.out.println(x[i]+" "+y[i]);
		}
	}
}
/* 정답:
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt(), d[][] = new int[n][2];
		for(i=0;i<n;i++){
			d[i][0] = sc.nextInt(); d[i][1] = sc.nextInt();
		}
		Arrays.sort(d, new Comparator<int []>(){
			public int compare(int a[], int b[]) {
				if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
				else return Integer.compare(a[0], b[0]);
			}
		});
		for(i=0;i<n;i++) System.out.println(d[i][0]+" "+d[i][1]);
		sc.close();
	}
}
[출처]http://blog.naver.com/occidere/220826851821*/
