package bj_work2;
import java.util.*;
public class bj_13 {
//����11399
//���� �� �ִ� ����� �� N�� �� ����� ���� �����ϴµ� �ɸ��� �ð� Pi�� �־����� ��
//�� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public static void main(String[] args) {
		// TODO Auto-generated method stub
	//�ð��� ���� �ּҸ� ���ϱ� ���� ���� ���� ���� �켱������ �д�.
	Scanner in=new Scanner (System.in);
	int n=in.nextInt();//���� �Է�
	int[] p=new int[n];//�� ����� �ʿ��� �ð��� ������ ��ü
	int []max=new int[n+1];//�ð��� ���� ������ ��ü
	
	for(int i=0;i<n;i++){
		p[i]=in.nextInt();//���� �Է��Ѵ�
	}
	
	Arrays.sort(p);//�Լ��� ����Ͽ� �ּڰ��� ������ ���Ľ�Ų��.
	
	for(int i=0;i<n;i++){
		for(int i2=i;i2>=0;i2--){//i���� �۵��� �پ��� �ݺ�
			max[i]+=p[i2];//�ɸ��� �ð��� ���� ��ü�� �����Ѵ�
		}
		max[n]+=max[i];
	}
	System.out.println(max[n]);//���
  }

}
