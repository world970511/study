package bj_work2;
//����1181
/*���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
1.���̰� ª�� �ͺ���
2.���̰� ������ ���� ������*/
//�ð��ʰ��� Ʋ�ȴµ� ���� �°� ����(���� ������)
import java.util.*;
public class bj_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();// �Է¹��� �ܾ��� ����
		String [] str=new String[n];//�ܾ ������ ����
		for (int i=0;i<n;i++){//�ܾ� �Է�
			str[i]=in.next();
		}
		
		for(int i=0;i<n;i++){//���̿� ���� �ּҼ����� ����
			int min=i;
			for(int i2=i+1;i2<n;i2++){
				if(str[i2].length()<str[min].length()){
					min=i2;//���̸� ���Ͽ� �� ���� ���� �ε����� ����
				}
			}
			swap(i,min,str);//���̰� ���� ������ ��ġ ����
		}


	for(int i=0;i<n;i++){
		for(int i2=i+1;i2<n;i2++){
			if(str[i].compareTo(str[i2])==0){
				str[i]="0";//���� �� �ܾ ���� �ܾ��� ��� �ϳ��� 0���� ����
			}
			else if(str[i2].length()==str[i].length()){
				 if(str[i].compareTo(str[i2])>0){
					swap(i,i2,str);
					// �� �ܾ��� ���̰� ������ ���� ���� �ƴ� ��� �� �ܾ��� ��ġ ����
				}
			}
		}
		if(str[i]!="0"){
			System.out.println(str[i]);//0���� ����� �ܾ �����ϰ� ���
		}
	}
}

	private static void swap(int i, int i2, String[] str) {
		// TODO Auto-generated method stub
		String temp= str[i];
		str[i]=str[i2];
		str[i2]=temp;// ��ġ�� �����ϴ� �Լ�.
	}

}
