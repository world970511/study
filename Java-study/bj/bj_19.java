package bj_work2;
import java.util.*;
//����1475
//��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. 
//�� ��ȣ�� �־����� ��,�ʿ��� ��Ʈ�� ������ �ּڰ��� ����Ͻÿ�.
//6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.
public class bj_19 {
	static int[]num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String roomNum=in.next();//���ȣ �Է�
		num=new int[9];//�� ������ ������ ������ �迭
		
		for(int i=0;i<roomNum.length();i++){
			int n=roomNum.charAt(i)-'0';//���ȣ ���� ����>���� ��ȯ
			if(n==6||n==9){//6�̳� 9�� ��� ������ 6�� �ڸ��� ���� ����
				num[5]++;
			}
			else{
				num[n]++;//�������� �� ������ ��ġ�� �� ���� ����
			}
		}			
		
		num[5]=num[5]/2+num[5]%2;
		//6��9�� ���� ī���õ����� ¦���� ��� 2�� ��������, Ȧ���� ��� +1
		
		Arrays.sort(num);//�������� ������ ���� ������ ���� ���� ���
		System.out.println(num[8]);
	}

}
