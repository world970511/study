package bj_work2;

import java.util.Scanner;

public class bj_12 {
//����10773
//ù ��° �ٿ� ���� K�� �־�����. (1 �� K �� 100,000)
//���� K���� �ٿ� ������ 1���� �־�����. 
//������ "0" �� ��쿡�� ���� �ֱٿ� �� ���� �����, �ƴ� ��� �ش� ���� ����.
//��� ���� �޾� ���� �� �� ���� ���� ����Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//���� k�� ����
		int [] help=new int[n];//k���� ������ ������ ��ü help����
		int plus=0;//���� ����ϱ����� ����
		
		for(int i=0;i<n;i++){
			help[i]=in.nextInt();//���� �Է�
			if(help[i]==0&&i>0){//�Է��� ������ 0�� ���&& i�� 0���� Ŭ ��� ����
				for(int i2=i-1;i2>=0;i2--){//i���� �۾����� �ݺ�(�������� Ȯ���Ѵ�)
					if(help[i2]!=0){//���� ���� ���� 0�� �ƴ� ���
						help[i2]=0;//���� ���� 0���� �����ϰ� 
						break;//���� �ݺ����� ���ư���.
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			plus+=help[i];//��� ���� plus������ ���Ͽ� �����Ѵ�
		}
		System.out.println(plus);//���
	}

}
