package bj_work;
import java.util.*;
public class bj_5 {
//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
//������ ���ĺ��� ���ؼ� �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��
//���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String str=in.nextLine();
		
		for(int i=97;i<=122;i++){
			char a= (char)i;
			System.out.print(str.indexOf(a)+" ");
		}
	}
}
