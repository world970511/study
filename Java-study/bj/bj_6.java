package bj_work;
//���� �˰��� 2292,https://www.acmicpc.net/problem/2292
//a(n)=a(n)+6(n-1)(n!=1)�� Ȱ��
//6�� ����� �������� �����ϰ�, �� �ȿ��� �ּҰŸ� ����.
import java.util.Scanner;
public class bj_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int ans=in.nextInt();
		int n=2,i=1;
		
		while(true){
			n+=6*i++;
			if(n>ans){
				break;
			}
		}
		if(ans==1)
			System.out.println(1);
		else
			System.out.println(i);
	}	
}
