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
		  System.out.println("hw9_1: 박나은");
		  System.out.print("첫번째 문자열 입력: ");
		  char[] s1=in.nextLine().toCharArray();//문자열을 문자배열로변경
		  System.out.print("두번째 문자열 입력: ");
		  char [] s2=in.nextLine().toCharArray();//문자열을 문자배열로변경

		  int [][] arr= new int[s1.length+1][s2.length+1];
		  
		//제일 첫번째 행과 열을 0으로 설정
		  for(int n=0;n<s1.length;n++) {arr[n][0]=0;}
		  for(int n=0;n<s2.length;n++) {arr[0][n]=0;}
		
		  for(int i=1;i<=s1.length;i++) { 
			  for(int j=1;j<=s2.length;j++) { 
				  if(s1[i-1] == s2[j-1]) { //동일할 경우+1
					  arr[i][j] = arr[i-1][j-1]+1; 
				  }
				  else {//동일하지않은 경우 이전의 열(같은 행)의 요소와 이전의 행(같은 열)의 요소 중 큰 걸로 저장
					  arr[i][j] = max(arr[i][j-1],arr[i-1][j]); 
				  }
			  }		
		  }
//선택
	      int x = s1.length;
	      int y = s2.length;
		  String str="";
		  
	      while(!(x == 0 || y == 0)) {//길이가 0이되면 종료(행이든 열이든)
	          	if(s1[x-1] == s2[y-1]) {//동일할경우 문자열에 저장
	                str+=s1[x-1];
	                x--; 
	                y--;
	            }
	          	////동일하지않은 경우 이전의 열(같은 행)의 요소나 이전의 행(같은 열)의 요소와 같은 경우 이전으로 이동
	            else if(arr[x][y] == arr[x-1][y]) {
	                x--;
	            }
	            else if(arr[x][y] == arr[x][y-1]) {
	                y--;
	            }
	        }
	      
	      //거꾸로 올라가면서 체크한 것이기 때문에 저장된 문자열 역순으로 변환
	      char ans[]= str.toCharArray();
	      char[] reArr = new char[ans.length]; 
	      for(int i=0; i<ans.length; i++){ reArr[ans.length-1-i] = ans[i]; }
	      
	      //출력
		  System.out.println("LCS 길이 = "+arr[s1.length][s2.length]);
		  System.out.println("LCS= "+String.valueOf(reArr));
	}

}
