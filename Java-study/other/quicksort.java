import java.util.Arrays;
import java.util.Scanner;
public class hw4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("단어 수 입력: ");//단어 개수를 입력받는다
		int n=in.nextInt();
		String[]word=new String[n];
		System.out.println(n+"개의 단어 입력:");//정렬시킬 단어들을 입력받는다
		for(int i=0;i<word.length;i++){
			word[i]=in.next();
		}

		word=quickSort(word,0,word.length-1);//퀵 정렬을 위한 메소드 호출
		
		System.out.println("퀵정렬 결과: ");
		for(int i=0;i<word.length;i++){
			System.out.print(word[i]+" ");
		}	
	}

	private static String[] quickSort(String[] word,int start,int end) {
		// TODO Auto-generated method stub
		int pivot=partition(word,start,end);
		if(pivot-1>start){
			quickSort(word,start,pivot-1);//기준보다 작은 값
		}
		if(pivot<end){
			quickSort(word,pivot,end);//기준보다 큰 값
		}
		return word;
	}
	private static int partition(String[]word,int start,int end){
		String p_word=word[(start+end)/2];//기준값이 위치한 요소
		while(start<=end) { 
			while(word[start].compareToIgnoreCase(p_word)<0){start++;}
			//대상 문자열이 매개변수로 받은 문자열보다 사전 순으로 앞선 경우.(대소문자 구분 안함)
			while(word[end].compareToIgnoreCase(p_word)>0){end--;}
			//대상 문자열이 매개변수로 받은 문자열보다 사전 순으로 뒤질 경우.(대소문자 구분안함)
			if(start<=end) { //시작과 끝의 위치가 같거나 작을 경우 
				String tmp = word[start]; 
				word[start]=word[end]; 
				word[end]=tmp; 
				start++; 
				end--;
				} 
			} 
		return start;
		
	}
}
