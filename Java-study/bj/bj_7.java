package bj_work;

public class bj_7 {
//���� �˰��� 4673:https://www.acmicpc.net/problem/4673 ����
//���Ŀ� ���ؼ� �� �𸣱� ������ ������ ����� ���.
	static int num=0;//����� ���� ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10000;i++){
			work(i);// �����ѹ����� �ƴ��� Ȯ���ϴ� �Լ� ��ȯ
			if(num!=1){
				System.out.println(i);
			}//�Լ��� �ҷ� �� ���� 1�� ��� �����ѹ��� �ƴϰ�, 0�� ��� �����ѹ�
		}

	}

	private static void work(int i) {
		// TODO Auto-generated method stub
		//i ������ ���� i2�� 1�� ����
		num=0;
		for(int i2=1;i2<i;i2++){
			int a=i2/1000;
			int b=(i2%1000)/100;
			int c=((i2%1000)%100)/10;
			int d=i2%10;
			//i2�� 1000,100,10,1�� �ڸ����� �и��Ͽ� �����ڰ� �ִ��� Ȯ���Ѵ�
			if(i==(i2+a+b+c+d)){
				num=1;
				continue;
				//�����ڰ� ���� ��� �ݺ��� ���߰� num�� 1�� �����Ѵ�.
			}	
		}
	}
}

