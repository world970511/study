package school5;
import java.util.Scanner;
public class hw9_1 {
	
	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		if (i>=j) {return i;}
		else {return j;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		  System.out.println("hw9_1: �ڳ���");
		  System.out.print("ù��° ���ڿ� �Է�: ");
		  char[] s1=in.nextLine().toCharArray();//���ڿ��� ���ڹ迭�κ���
		  System.out.print("�ι�° ���ڿ� �Է�: ");
		  char [] s2=in.nextLine().toCharArray();//���ڿ��� ���ڹ迭�κ���

		  int [][] arr= new int[s1.length+1][s2.length+1];
		  
		//���� ù��° ��� ���� 0���� ����
		  for(int n=0;n<s1.length;n++) {arr[n][0]=0;}
		  for(int n=0;n<s2.length;n++) {arr[0][n]=0;}
		
		  for(int i=1;i<=s1.length;i++) { 
			  for(int j=1;j<=s2.length;j++) { 
				  if(s1[i-1] == s2[j-1]) { //������ ���+1
					  arr[i][j] = arr[i-1][j-1]+1; 
				  }
				  else {//������������ ��� ������ ��(���� ��)�� ��ҿ� ������ ��(���� ��)�� ��� �� ū �ɷ� ����
					  arr[i][j] = max(arr[i][j-1],arr[i-1][j]); 
				  }
			  }		
		  }
//����
	      int x = s1.length;
	      int y = s2.length;
		  String str="";
		  
	      while(!(x == 0 || y == 0)) {//���̰� 0�̵Ǹ� ����(���̵� ���̵�)
	          	if(s1[x-1] == s2[y-1]) {//�����Ұ�� ���ڿ��� ����
	                str+=s1[x-1];
	                x--; 
	                y--;
	            }
	          	////������������ ��� ������ ��(���� ��)�� ��ҳ� ������ ��(���� ��)�� ��ҿ� ���� ��� �������� �̵�
	            else if(arr[x][y] == arr[x-1][y]) {
	                x--;
	            }
	            else if(arr[x][y] == arr[x][y-1]) {
	                y--;
	            }
	        }
	      
	      //�Ųٷ� �ö󰡸鼭 üũ�� ���̱� ������ ����� ���ڿ� �������� ��ȯ
	      char ans[]= str.toCharArray();
	      char[] reArr = new char[ans.length]; 
	      for(int i=0; i<ans.length; i++){ reArr[ans.length-1-i] = ans[i]; }
	      
	      //���
		  System.out.println("LCS ���� = "+arr[s1.length][s2.length]);
		  System.out.println("LCS= "+String.valueOf(reArr));
	}

}
