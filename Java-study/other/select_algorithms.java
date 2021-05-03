import java.util.Scanner;

public class hw5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		String[]words=new String[20];
		
		System.out.print("20개의 단어 입력: ");
		for(int i=0;i<20;i++) {
			words[i]=in.next();
		}

		System.out.print("1번째 작은 단어를 찾아 출력= ");
		System.out.println(Select(words,0,words.length-1,1));
		
		System.out.print("6번째 작은 단어를 찾아 출력= ");
		System.out.println(Select(words,0,words.length-1,6));
		
		System.out.print("17번째 작은 단어를 찾아 출력= ");
		System.out.println(Select(words,0,words.length-1,17));
		
		System.out.print("20번째 작은 단어를 찾아 출력= ");
		System.out.println(Select(words,0,words.length-1,20));
	}
	
	public static  String Select (String[]word,int p, int r,int i) {
		if(p==r) {
			return word[p];
		}
		
		int q=partition(word,p,r);
		int k=q-p+1;
		
		if(i<k) {
			return Select(word,p,q-1,i);
		}
		else if(i>k) {
			return Select(word,q+1,r,i-k);
		}
		else {
			return word[q];
		}
	}

	public static int partition(String[] a, int p, int r) {
		String x = a[r];//기준 원소
	    int i = p-1;
	    int j=p;
	    String temp;
	    
	    while(j<a.length){
	    	if( a[j].compareToIgnoreCase(x)<0){
	    		 temp= a[j];
	    		 ++i;
	            a[j] = a[i];
	            a[i] = temp;
			} 
	    	j++;
		}
	    
	    temp = a[r];
		a[r] = a[i + 1];
		a[i + 1] = temp;
	    
	    return i+1;
	}
}

