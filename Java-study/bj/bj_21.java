package bj_work3;

import java.util.*;
//백준 2630
public class bj_21 {
	static int[][]paper;//색종이 크기
	static int white=0;//하얀 색종이 개수
	static int blue=0;//파란 색종이 개수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//크기 입력
		paper=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int i2=0;i2<n;i2++){
				paper[i][i2]=in.nextInt();//흰색인지 파란색인지 입력
			}
		}
		same(0,0,n,n);//재귀함수(열의 시작,행의 시작,열의 마지막,행의 마지막)
		System.out.println(white);
		System.out.println(blue);
	}
	private static void same(int sr, int sc, int er, int ec) {
		// TODO Auto-generated method stu
		int sum=0;
		for(int i=sr;i<er;i++){
			for(int i2=sc;i2<ec;i2++){
				sum+=paper[i][i2];
				//종이의 합을 얻어낸다(모두 하얀색인지 파란색인지)
			}
		}
		if(sum==0){
			white++;//모두 하얀색일 경우 
			return;
		}
		else if(sum==(er-sr)*(ec-sc)){
			blue++;//모두 파란색일 경우
			return;
		}
		else{//아닐 경우 4분할>>재귀 이용
			same(sr,sc,(er+sr)/2,(ec+sc)/2);
			same((sr+er)/2,sc,er,(ec+sc)/2);
			same(sr,(sc+ec)/2,(sr+er)/2,ec);
			same((sr+er)/2,(sc+ec)/2,er,ec);
			
		}
	}
}
//참조https://toastfactory.tistory.com/47