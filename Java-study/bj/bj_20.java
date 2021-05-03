package bj_work3;
import java.util.*;
//백준9461
//수열 규칙만 알아내면 구현하기는 쉬운 문제
//파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. 
//P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.
public class bj_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//테스트 케이스의 개수
		int []ans=new int[n];// 테스트 케이스를 저장할 배열
		for(int i=0;i<n;i++){
			ans[i]=in.nextInt();//테스트 케이스 입력
		}
		
		long[]P=new long[101];//N이 1 ≤ N ≤ 100으로 int형으로는 저장공간 부족으로 오류남
		
		P[0]=P[1]=P[2]=1;
		P[3]=P[4]=2;//p(1)~P(3)까지 0, p(4)~p(5)=2임을 미리 입력한다.
		
		for(int i=0;i<ans.length;i++){
			p_arr(ans[i],P);
		}		
	}

	private static void p_arr(int i, long[] p) {
		// TODO Auto-generated method stub
			for(int n=5;n<i;n++){
				p[n]=p[n-1]+p[n-5];
				//n>5일 경우 수식은 p(n)=p(n-1)+p(n-5)로 증가한다.
				//이를 이용하여 값을 p배열에 n-1번까지 넣는다.이떄 0번은 1로 봐야함.
			}
			System.out.println(p[i-1]);
	}
}
