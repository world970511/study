package bj_work3;

import java.util.*;
//����2740
public class bj_22 {
	static int [][]a;
	static int [][]b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//a ����� ũ�� �Է�
		int m=in.nextInt();
		a=new int[n][m];
		for(int i=0;i<n;i++){
			for(int i2=0;i2<m;i2++){
				a[i][i2]=in.nextInt();//a����� �� �Է�
			}
		}
		
		int n2=in.nextInt();//b�� ��� ũ�� �Է�
		int m2=in.nextInt();
		b=new int[n2][m2];
		for(int i=0;i<n2;i++){
			for(int i2=0;i2<m2;i2++){
				b[i][i2]=in.nextInt();//b�� ����� �� �Է�
			}
		}
		
		int [][]ans=new int[n][m2];//a*b�� ���� ������ ����
		
		for(int i=0;i<n;i++){//a����� ����ŭ �ݺ�
			for(int i2=0;i2<m2;i2++){//b����� �ุŭ �ݺ�
				for(int i3=0;i3<n2;i3++){
					ans[i][i2]+=a[i][i3]*b[i3][i2];
				//a*b����� ���� a*b[n][n]=a[n]��*b[n]��
				//�� ���� ���� ����Ͽ� ����
				}
			}
		}
		
		for(int i=0;i<ans.length;i++){
			for(int i2=0;i2<ans[0].length;i2++){
				System.out.print(ans[i][i2]+" ");
			}
			System.out.println();
		}
	}
}
