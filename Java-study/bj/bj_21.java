package bj_work3;

import java.util.*;
//���� 2630
public class bj_21 {
	static int[][]paper;//������ ũ��
	static int white=0;//�Ͼ� ������ ����
	static int blue=0;//�Ķ� ������ ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//ũ�� �Է�
		paper=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int i2=0;i2<n;i2++){
				paper[i][i2]=in.nextInt();//������� �Ķ������� �Է�
			}
		}
		same(0,0,n,n);//����Լ�(���� ����,���� ����,���� ������,���� ������)
		System.out.println(white);
		System.out.println(blue);
	}
	private static void same(int sr, int sc, int er, int ec) {
		// TODO Auto-generated method stu
		int sum=0;
		for(int i=sr;i<er;i++){
			for(int i2=sc;i2<ec;i2++){
				sum+=paper[i][i2];
				//������ ���� ����(��� �Ͼ������ �Ķ�������)
			}
		}
		if(sum==0){
			white++;//��� �Ͼ���� ��� 
			return;
		}
		else if(sum==(er-sr)*(ec-sc)){
			blue++;//��� �Ķ����� ���
			return;
		}
		else{//�ƴ� ��� 4����>>��� �̿�
			same(sr,sc,(er+sr)/2,(ec+sc)/2);
			same((sr+er)/2,sc,er,(ec+sc)/2);
			same(sr,(sc+ec)/2,(sr+er)/2,ec);
			same((sr+er)/2,(sc+ec)/2,er,ec);
			
		}
	}
}
//����https://toastfactory.tistory.com/47