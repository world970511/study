package bj_work2;
import java.util.*;
//백준1475
//세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
//방 번호가 주어졌을 때,필요한 세트의 개수의 최솟값을 출력하시오.
//6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.
public class bj_19 {
	static int[]num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String roomNum=in.next();//방번호 입력
		num=new int[9];//각 숫자의 개수를 저장할 배열
		
		for(int i=0;i<roomNum.length();i++){
			int n=roomNum.charAt(i)-'0';//방번호 숫자 문자>숫자 전환
			if(n==6||n==9){//6이나 9일 경우 무조건 6의 자리에 개수 저장
				num[5]++;
			}
			else{
				num[n]++;//나머지는 각 숫자의 위치에 각 개수 저장
			}
		}			
		
		num[5]=num[5]/2+num[5]%2;
		//6과9가 같이 카운팅됨으로 짝수일 경우 2로 나눠지고, 홀수일 경우 +1
		
		Arrays.sort(num);//오름차순 정렬후 가장 개수가 많은 것을 출력
		System.out.println(num[8]);
	}

}
