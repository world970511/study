package bj_work2;

import java.util.*;
//����11650
//2���� ��� ���� �� N���� �־�����. ��ǥ�� x��ǥ�� �����ϴ� ������
//x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

//��� Ʋ������(ã�ƺ��� Comparator? �װ� �Ἥ Ǫ�°Ŵ���) �������� ����϶�� ����

public class bj_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]x=new int[n];
		int[]y=new int[n];//x��ǥ�� y��ǥ�� ������ ��ü ����
		
		
		for(int i=0;i<n;i++){
			x[i]=in.nextInt();
			y[i]=in.nextInt();//x,y ��ǥ�� ���� �޴´�
			
		}
		
		int temp1,temp2,temp3=0;//��� ������ ���� ����
		
		for(int i=0;i<n;i++){
			for(int i2=i+1;i2<n;i2++){
			if(x[i]>x[i2]){
				//���� ������ Ȱ���Ͽ� x�� �������� ����.
				//�̶� y�� ũ�⸦ ������ �ʰ�,x�� ���� ������ �޶������� �ڵ�
				temp1=x[i];
				temp2=y[i];
				x[i]=x[i2];
				y[i]=y[i2];
				x[i2]=temp1;
				y[i2]=temp2;
			}
				// x ������������ ���� �� x�� ��ǥ�� ���ٸ� y�� �ּҼ����� ����
				if(x[i]==x[i2]&&y[i]>y[i2]){
					temp3=y[i];
					y[i]=y[i2];
					y[i2]=temp3;
				}
			}
		}
		//���
		for(int i=0;i<n;i++){	
			System.out.println(x[i]+" "+y[i]);
		}
	}
}
/* ����:
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt(), d[][] = new int[n][2];
		for(i=0;i<n;i++){
			d[i][0] = sc.nextInt(); d[i][1] = sc.nextInt();
		}
		Arrays.sort(d, new Comparator<int []>(){
			public int compare(int a[], int b[]) {
				if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
				else return Integer.compare(a[0], b[0]);
			}
		});
		for(i=0;i<n;i++) System.out.println(d[i][0]+" "+d[i][1]);
		sc.close();
	}
}
[��ó]http://blog.naver.com/occidere/220826851821*/
