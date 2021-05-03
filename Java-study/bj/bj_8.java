package bj_work;

//백준2798:https://www.acmicpc.net/problem/2798
//조합 C(n,r)=n!/(n-r)!*r! 활용문제
import java.util.*;
public class bj_8 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		int []num=new int[n];
		for (int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		
		int n2=fac(n)/(fac(n-3)*fac(3));//나올 수 있는 결과의 갯수
		int[]arr = new int[n2];
		int alpa=0;
		
		
		for(int i=0;i<n;i++){
			for(int i2=i+1;i2<n;i2++){
				for(int i3=i2+1;i3<n;i3++){
					arr[alpa]=num[i]+num[i2]+num[i3];
					alpa+=1;
				}
			}
		}
		//모든 결과를 배열에 넣는다.
		
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=m)//m보다 작은 배열
				{
				if(max<arr[i])//그중에서 최대치를 구함
					max=arr[i];
			}
		}
		System.out.println(max);
	}

	static int fac(int i) {
		// TODO Auto-generated method stub
		//결과의 갯수를 파악하는 함수
		int a2=1;
		for(int a=1;a<=i;a++){
			a2*=a;
		}
		return a2;
	}
}
//런타임 에러났는데 이유를 모르겠다 
//다른 사람 코드 참조해서 다시 풀음 :bj_8_2
