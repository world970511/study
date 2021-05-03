package bj_work;

public class bj_7 {
//백준 알고리즘 4673:https://www.acmicpc.net/problem/4673 참조
//수식에 대해서 잘 모르기 때문에 무식한 방법을 사용.
	static int num=0;//결과를 담을 전역변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10000;i++){
			work(i);// 셀프넘버인지 아닌지 확인하는 함수 소환
			if(num!=1){
				System.out.println(i);
			}//함수를 불러 그 답이 1일 경우 셀프넘버가 아니고, 0일 경우 셀프넘버
		}

	}

	private static void work(int i) {
		// TODO Auto-generated method stub
		//i 이하의 수를 i2로 1씩 증가
		num=0;
		for(int i2=1;i2<i;i2++){
			int a=i2/1000;
			int b=(i2%1000)/100;
			int c=((i2%1000)%100)/10;
			int d=i2%10;
			//i2를 1000,100,10,1의 자리수로 분리하여 생성자가 있는지 확인한다
			if(i==(i2+a+b+c+d)){
				num=1;
				continue;
				//생성자가 맞을 경우 반복을 멈추고 num에 1을 저장한다.
			}	
		}
	}
}

