package bj_work;

//����2798:https://www.acmicpc.net/problem/2798
//���� C(n,r)=n!/(n-r)!*r! Ȱ�빮��
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
		
		int n2=fac(n)/(fac(n-3)*fac(3));//���� �� �ִ� ����� ����
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
		//��� ����� �迭�� �ִ´�.
		
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=m)//m���� ���� �迭
				{
				if(max<arr[i])//���߿��� �ִ�ġ�� ����
					max=arr[i];
			}
		}
		System.out.println(max);
	}

	static int fac(int i) {
		// TODO Auto-generated method stub
		//����� ������ �ľ��ϴ� �Լ�
		int a2=1;
		for(int a=1;a<=i;a++){
			a2*=a;
		}
		return a2;
	}
}
//��Ÿ�� �������µ� ������ �𸣰ڴ� 
//�ٸ� ��� �ڵ� �����ؼ� �ٽ� Ǯ�� :bj_8_2
