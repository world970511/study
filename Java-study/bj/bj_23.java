package bj_work3;

import java.util.Scanner;
//����10830
//����:https://gongbu-ing.tistory.com/75
//a^5=(a^2)^2*a�Ǵ� a^10=a(a^2*a^2)^2 ��� ������ �հ� ����Լ��� ������ ����
public class bj_23 {
	static long[][]num;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		n=in.nextInt();//����� ũ�� �Է�
		long b=in.nextLong();//�����ؾ� �ϴ� Ƚ��

		num=new long[n][n];
		
		for(int i=0;i<n;i++){
			for(int i2=0;i2<n;i2++){
				num[i][i2]=in.nextInt();//����� �� �Է�
			
			}
		}
		
		long [][]res=toDo(b);// �Լ��� �̿��Ͽ� ���� �Է�
		
		
		for(int i1=0;i1<res.length;i1++){
			for(int i2=0;i2<res[0].length;i2++){
					System.out.print(res[i1][i2]+" ");
				}
				System.out.println();//���
			}
		 }
	private static long[][] toDo (long b) {
		// TODO Auto-generated method stub
		long [][] ans = new long[n][n];//���� �Է��� ����
		long [][]temp=new long [n][n];// ���� Ȥ�� �����^2�� ȣ���ϱ� ���� ����
		if(b==1){
			for(int i=0;i<n;i++){
				for(int i2=0;i2<n;i2++){
					ans[i][i2]=num[i][i2]%1000;
				}//b=1�� ��� �Է°� ���������� �ٷ� ���
			}
		}
		else if(b%2==0){//b�� ¦���� ���
			temp=toDo(b/2);//ex:a^2�� �� a�� ȣ��.
			for(int i=0;i<n;i++){
				for(int i2=0;i2<n;i2++){
					int ans1=0;
					for(int i3=0;i3<n;i3++){
						ans1+=temp[i][i3]*temp[i3][i2];
						//b�� ¦���� ��� a^b/2����� ȣ���Ͽ� ����
						//a^4=(a^2)^2���� ����
						
					}
					ans[i][i2]=ans1%1000;
				}
			}
		}
		else if(b%2==1){//b�� Ȧ���� ���
			temp=toDo(b-1);//������ ������ ����� ȣ��
			for(int i=0;i<n;i++){
			for(int i2=0;i2<n;i2++){
				int ans1=0;
				for(int i3=0;i3<n;i3++){
					ans1+=temp[i][i3]*num[i3][i2];//������ ��*���� ���
				}
				ans[i][i2]=ans1%1000;
			}
			}
		}
		return ans;	
	}
}
//��Ÿ�� ���� ���� ???? �̷��µ� b�� int���� �Ѿ �Է� ���������� long������ �ٲ�� ����
//����