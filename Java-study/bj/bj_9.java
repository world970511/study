package bj_work;

import java.util.*;

//����1427
//���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���
public class bj_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num=s.next();//���� ���ڿ��� �Է¹޴´�
		int size=num.length();//���ڿ��� ����
		int[]array=new int[size];//���ڿ��� ���̿� ���� �������� ���� �迭 ����
		
		for(int i=0;i<size;i++){
			String a= Character.toString(num.charAt(i));//���ڿ�>���ں�ȯ
			array[i]= Integer.parseInt(a);//����>���� ��ȯ �� ��ü�� ����
		}
		
		
		Arrays.sort(array);	//������������ ��ȯ
		
		
		while(true){
			System.out.print(array[--size]);
			if(size==0)
			break;
			}// ������������ ������ �迭�� �Ųٷ� ȣ���Ͽ� ���
	}
}

