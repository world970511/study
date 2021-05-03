package bj_work;
import java.util.Scanner;
/* น้มุ 2753*/
public class bj_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int year =in.nextInt();
		
		if(year%4==0){
			if(year%100!=0){
				System.out.println("1");
			}
			else if(year%400==0){
				System.out.println("1");
			}
			else{System.out.println("0");}
		}
		else{System.out.println("0");}
	}

}
