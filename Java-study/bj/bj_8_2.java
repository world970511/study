package bj_work;

//����2798:https://www.acmicpc.net/problem/2798
//���� C(n,r)=n!/(n-r)!*r! Ȱ�빮��
//https://fbtmdwhd33.tistory.com/16 ���� �ٽ� Ǯ����
import java.util.*;
public class bj_8_2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		int []num=new int[n];
		for (int i=0;i<n;i++){
			num[i]=in.nextInt();
		}//ī���� ���� �Է�
		
		int temp=0;//ī�尪�� ��
		int max=0;//m���� �۰ų� ������ �� �ִ�ġ�� ������ ����
		for(int i=0;i<num.length-2;i++){//������ ���ڸ� ������(n-2)
			for(int i2=i+1;i2<num.length-1;i2++){//������ ���ڸ�����(n-1)
				for(int i3=i2+1;i3<num.length;i3++){//����������(n)
					temp=num[i]+num[i3]+num[i2];
					if(temp<=m&&temp>max){//��� ���� ���� ����� ��
						max=temp;
					}
				}
			}
		}

		System.out.println(max);
	}
}


