package bj_work3;
import java.util.*;
//����9461
//���� ��Ģ�� �˾Ƴ��� �����ϱ�� ���� ����
//�ĵ��� ���� P(N)�� ������ �ִ� ���ﰢ���� ���� �����̴�. 
//P(1)���� P(10)���� ù 10�� ���ڴ� 1, 1, 1, 2, 2, 3, 4, 5, 7, 9�̴�.
public class bj_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//�׽�Ʈ ���̽��� ����
		int []ans=new int[n];// �׽�Ʈ ���̽��� ������ �迭
		for(int i=0;i<n;i++){
			ans[i]=in.nextInt();//�׽�Ʈ ���̽� �Է�
		}
		
		long[]P=new long[101];//N�� 1 �� N �� 100���� int�����δ� ������� �������� ������
		
		P[0]=P[1]=P[2]=1;
		P[3]=P[4]=2;//p(1)~P(3)���� 0, p(4)~p(5)=2���� �̸� �Է��Ѵ�.
		
		for(int i=0;i<ans.length;i++){
			p_arr(ans[i],P);
		}		
	}

	private static void p_arr(int i, long[] p) {
		// TODO Auto-generated method stub
			for(int n=5;n<i;n++){
				p[n]=p[n-1]+p[n-5];
				//n>5�� ��� ������ p(n)=p(n-1)+p(n-5)�� �����Ѵ�.
				//�̸� �̿��Ͽ� ���� p�迭�� n-1������ �ִ´�.�̋� 0���� 1�� ������.
			}
			System.out.println(p[i-1]);
	}
}
