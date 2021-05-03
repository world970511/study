import java.util.Arrays;
import java.util.Scanner;
public class hw4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("�ܾ� �� �Է�: ");//�ܾ� ������ �Է¹޴´�
		int n=in.nextInt();
		String[]word=new String[n];
		System.out.println(n+"���� �ܾ� �Է�:");//���Ľ�ų �ܾ���� �Է¹޴´�
		for(int i=0;i<word.length;i++){
			word[i]=in.next();
		}

		word=quickSort(word,0,word.length-1);//�� ������ ���� �޼ҵ� ȣ��
		
		System.out.println("������ ���: ");
		for(int i=0;i<word.length;i++){
			System.out.print(word[i]+" ");
		}	
	}

	private static String[] quickSort(String[] word,int start,int end) {
		// TODO Auto-generated method stub
		int pivot=partition(word,start,end);
		if(pivot-1>start){
			quickSort(word,start,pivot-1);//���غ��� ���� ��
		}
		if(pivot<end){
			quickSort(word,pivot,end);//���غ��� ū ��
		}
		return word;
	}
	private static int partition(String[]word,int start,int end){
		String p_word=word[(start+end)/2];//���ذ��� ��ġ�� ���
		while(start<=end) { 
			while(word[start].compareToIgnoreCase(p_word)<0){start++;}
			//��� ���ڿ��� �Ű������� ���� ���ڿ����� ���� ������ �ռ� ���.(��ҹ��� ���� ����)
			while(word[end].compareToIgnoreCase(p_word)>0){end--;}
			//��� ���ڿ��� �Ű������� ���� ���ڿ����� ���� ������ ���� ���.(��ҹ��� ���о���)
			if(start<=end) { //���۰� ���� ��ġ�� ���ų� ���� ��� 
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
