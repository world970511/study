package bj_work2;
import java.util.*;
public class bj_18 {
//����1149
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][]home=new int[n][3];//�� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� ������ �迭
		int[][]minPay=new int[n][3];//������ ����� �ּҰ��� ���� ������ �迭

		for(int i=0;i<n;i++){
			for(int i2=0;i2<3;i2++){
				home[i][i2]=in.nextInt();//����� �� �Է�
			}
		}
		
		minPay[0][0]=home[0][0];
		minPay[0][1]=home[0][1];
		minPay[0][2]=home[0][2];
		
		for(int i=1;i<n;i++){
			minPay[i][0]=Math.min(minPay[i-1][1],minPay[i-1][2])+home[i][0];
			minPay[i][1]=Math.min(minPay[i-1][0],minPay[i-1][2])+home[i][1];
			minPay[i][2]=Math.min(minPay[i-1][0],minPay[i-1][1])+home[i][2];
			//���� �迭�� ���� ���Ͽ� �ּҿ� ����, �̶� ���� ���� ���� ���� �ٸ� ��,.
			//����:https://mingyeongun-dev.tistory.com/30
		}
		System.out.println(Math.min(minPay[n-1][2],Math.min(minPay[n-1][0], minPay[n-1][1])));
		//������ ��� ������ �ּҰ��� ���Ͽ� ���� ���� ���� ���.
	}
}

