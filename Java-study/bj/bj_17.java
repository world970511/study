package bj_work2;

import java.util.*;
//����2108
public class bj_17 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]num=new int[n];
		int[]much= new int[8001]; //�ֺ� 

		double sum=0;
		
		for(int i=0;i<num.length;i++){
			num[i]=in.nextInt();
			sum+=num[i];
			much[num[i] + 4000]++;
		}
		
		Arrays.sort(num);
		
		int min = 0;

		for(int i = 0; i < much.length; i++) {
			if(min < much[i]) {
				min = much[i];	//	�ֺ��� ����Ѵ�.
			}
		}
		
		int[] two_min = new int[2];	//	���� ���� ��Ÿ���� ���� ���� ���� ��츦 ���� �迭
		int j = 0;
		
		for(int i = 0; i < much.length; i++) {
			if(two_min[0] != 0 && two_min[1] != 0)
				break;
			
			if(min == much[i]) {
				two_min[j] = i;
				j++;
			}
		}	//	�ֺ��� �� ��°�� ���� ���� �ֱ�����.
		
		if(two_min[1] == 0){
			two_min[1] = two_min[0];
		}
		
		
		System.out.println(Math.round(sum/n));
		System.out.println(num[n/2]);
		System.out.println(two_min[1] - 4000);
		System.out.println(num[n-1]-num[0]);
	
	}
}
