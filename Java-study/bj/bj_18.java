package bj_work2;
import java.util.*;
public class bj_18 {
//백준1149
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][]home=new int[n][3];//각 집을 빨강, 초록, 파랑으로 칠하는 비용을 저장할 배열
		int[][]minPay=new int[n][3];//누적된 비용의 최소값의 합을 저장할 배열

		for(int i=0;i<n;i++){
			for(int i2=0;i2<3;i2++){
				home[i][i2]=in.nextInt();//비용의 값 입력
			}
		}
		
		minPay[0][0]=home[0][0];
		minPay[0][1]=home[0][1];
		minPay[0][2]=home[0][2];
		
		for(int i=1;i<n;i++){
			minPay[i][0]=Math.min(minPay[i-1][1],minPay[i-1][2])+home[i][0];
			minPay[i][1]=Math.min(minPay[i-1][0],minPay[i-1][2])+home[i][1];
			minPay[i][2]=Math.min(minPay[i-1][0],minPay[i-1][1])+home[i][2];
			//이전 배열의 값을 비교하여 최소와 결합, 이때 집의 색은 이전 집과 다른 색,.
			//참조:https://mingyeongun-dev.tistory.com/30
		}
		System.out.println(Math.min(minPay[n-1][2],Math.min(minPay[n-1][0], minPay[n-1][1])));
		//마지막 모든 누적된 최소값을 비교하여 가장 작은 것을 출력.
	}
}

