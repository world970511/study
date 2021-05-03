package bj_work;

//백준2798:https://www.acmicpc.net/problem/2798
//조합 C(n,r)=n!/(n-r)!*r! 활용문제
//https://fbtmdwhd33.tistory.com/16 참조 다시 풀이함
import java.util.*;
public class bj_8_2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		int []num=new int[n];
		for (int i=0;i<n;i++){
			num[i]=in.nextInt();
		}//카드의 숫자 입력
		
		int temp=0;//카드값의 합
		int max=0;//m보다 작거나 같은수 중 최대치를 저장할 변수
		for(int i=0;i<num.length-2;i++){//마지막 두자리 전까지(n-2)
			for(int i2=i+1;i2<num.length-1;i2++){//마지막 한자리까지(n-1)
				for(int i3=i2+1;i3<num.length;i3++){//마지막까지(n)
					temp=num[i]+num[i3]+num[i2];
					if(temp<=m&&temp>max){//결과 값중 가장 가까운 수
						max=temp;
					}
				}
			}
		}

		System.out.println(max);
	}
}


