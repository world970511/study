package bj_work2;
import java.util.*;
public class bj_13 {
//백준11399
//줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어졌을 때
//각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램을 작성하시오.
public static void main(String[] args) {
		// TODO Auto-generated method stub
	//시간의 합의 최소를 구하기 위해 가장 작은 값을 우선순위에 둔다.
	Scanner in=new Scanner (System.in);
	int n=in.nextInt();//갯수 입력
	int[] p=new int[n];//각 사람당 필요한 시간을 저장할 객체
	int []max=new int[n+1];//시간의 합을 저장할 객체
	
	for(int i=0;i<n;i++){
		p[i]=in.nextInt();//값을 입력한다
	}
	
	Arrays.sort(p);//함수를 사용하여 최솟값을 앞으로 정렬시킨다.
	
	for(int i=0;i<n;i++){
		for(int i2=i;i2>=0;i2--){//i보다 작도록 줄어드는 반복
			max[i]+=p[i2];//걸리는 시간의 값을 객체에 저장한다
		}
		max[n]+=max[i];
	}
	System.out.println(max[n]);//출력
  }

}
