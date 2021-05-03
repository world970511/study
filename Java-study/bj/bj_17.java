package bj_work2;

import java.util.*;
//백준2108
public class bj_17 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]num=new int[n];
		int[]much= new int[8001]; //최빈값 

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
				min = much[i];	//	최빈값을 계산한다.
			}
		}
		
		int[] two_min = new int[2];	//	가장 많이 나타나는 값이 여러 개일 경우를 위한 배열
		int j = 0;
		
		for(int i = 0; i < much.length; i++) {
			if(two_min[0] != 0 && two_min[1] != 0)
				break;
			
			if(min == much[i]) {
				two_min[j] = i;
				j++;
			}
		}	//	최빈값중 두 번째로 작은 값을 넣기위함.
		
		if(two_min[1] == 0){
			two_min[1] = two_min[0];
		}
		
		
		System.out.println(Math.round(sum/n));
		System.out.println(num[n/2]);
		System.out.println(two_min[1] - 4000);
		System.out.println(num[n-1]-num[0]);
	
	}
}
