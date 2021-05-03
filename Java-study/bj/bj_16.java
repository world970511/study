package bj_work2;
//백준1181
/*알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
1.길이가 짧은 것부터
2.길이가 같으면 사전 순으로*/
//시간초과로 틀렸는데 답은 맞게 나옴(예제 돌려봄)
import java.util.*;
public class bj_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();// 입력받을 단어의 갯수
		String [] str=new String[n];//단어를 저장할 공간
		for (int i=0;i<n;i++){//단어 입력
			str[i]=in.next();
		}
		
		for(int i=0;i<n;i++){//길이에 따라 최소순으로 정리
			int min=i;
			for(int i2=i+1;i2<n;i2++){
				if(str[i2].length()<str[min].length()){
					min=i2;//길이를 비교하여 더 작은 값의 인덱스를 저장
				}
			}
			swap(i,min,str);//길이가 작은 순으로 위치 변경
		}


	for(int i=0;i<n;i++){
		for(int i2=i+1;i2<n;i2++){
			if(str[i].compareTo(str[i2])==0){
				str[i]="0";//만약 두 단어가 같은 단어일 경우 하나를 0으로 변경
			}
			else if(str[i2].length()==str[i].length()){
				 if(str[i].compareTo(str[i2])>0){
					swap(i,i2,str);
					// 두 단어의 길이가 같지만 사전 순이 아닐 경우 두 단어의 위치 변경
				}
			}
		}
		if(str[i]!="0"){
			System.out.println(str[i]);//0으로 변경된 단어를 제외하고 출력
		}
	}
}

	private static void swap(int i, int i2, String[] str) {
		// TODO Auto-generated method stub
		String temp= str[i];
		str[i]=str[i2];
		str[i2]=temp;// 위치를 변경하는 함수.
	}

}
