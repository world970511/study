package bj_work2;

import java.util.*;

//����2675
//���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ�
public class bj_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//�Է¹��� ���ڿ��� ����
		String[]str=new String[n];//���ڿ��� ������� ����
		
		for(int i=0;i<n;i++){
			int n2=in.nextInt();//�ݺ��� Ƚ�� �Է�
			str[i]=in.next();//���ڿ� �Է�
			str[i]=reStr(n2,str[i]);
			//�Լ��� �̵��Ͽ� ���ڵ��� �ݺ��� �� ���ڿ� ������ �ٽ� ����
		}
		for(int i=0;i<n;i++){
			System.out.println(str[i]);//���
		}
	}

	private static String reStr(int n2, String str) {
		// TODO Auto-generated method stub
		String str2="";//���Ͻ�ų ���ο� ���ڿ�(�� ���ڸ� R�� �ݺ���Ų ���ڿ�)
		for(int i=0;i<str.length();i++){//���ڿ� �ε��� �̵���
			for(int i2=0;i2<n2;i2++){//�ݺ��� Ƚ����ŭ �ݺ�
				str2+=str.charAt(i);
				//�� �ε����� �ȿ� ����� ���ڸ� �ݺ����� ���ο� ���ڿ��� ����
			}
		}
		return str2;
	}
}
