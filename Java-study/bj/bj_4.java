package bj_work;
import java.util.Scanner;
//น้มุ 5543//
public class bj_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[]buger=new int[3];
		int[]drink=new int[2];
		
		for(int i=0;i<3;i++){
			buger[i]=in.nextInt();
		}
		for(int i=0;i<2;i++){
			drink[i]=in.nextInt();
		}
		int min_drink=check(2,drink);
		int min_buger=check(3,buger);	
		
		System.out.println(min_drink+min_buger-50);
	}

	 static int check(int num, int[] work) {
		// TODO Auto-generated method stub
		int min=work[0];
		for(int i2=0;i2<num;i2++){
			if(min> work[i2]){
				min=work[i2];	
			}
		}
		return min;
	}

}