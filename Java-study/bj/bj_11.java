package bj_work2;

import java.util.*;

//����12748
//n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class bj_11 {
static int[]num;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();// n��°�� �Է¹޴´�.
		num=new int[n+1];//������ ������ �迭.0�� ���ԵǾ������� n+1�� ũ��� ����
		num[0]=0;//0��°�� 0
		num[1]=1;//1��°�� 1
		
			for(int i=2;i<n+1;i++){
				num[i]=num[i-2]+num[i-1];//i=2����  F(n)=F(n-1)+F(n-2)�� ���� Ȯ��
			}

		System.out.println(num[n]);
	}
}
//�и� ����� �����µ� Ʋ�ȴ� �׷���
//���� Ʋ�ȴ��� �����̶� �ض� ��������
//������ �𸣰ھ �н�
	
	
