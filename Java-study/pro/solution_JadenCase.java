package work;
//https://programmers.co.kr/learn/courses/30/lessons/12951
//���α׷��ӽ� JadenCase ���ڿ� �����

public class solution_JadenCase {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	System.out.print(solution("a aaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaa    b"));
		}

	private static String solution(String s) {
		// TODO Auto-generated method stub
		String ans="";
		s=s.toLowerCase();//���ڿ��� ���� �ҹ��ڷ� ����
		ans+=String.valueOf(s.charAt(0)).toUpperCase();//���� ù��° �ܾ �빮�ڷ� ����
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==' ') {//���ڰ� �����϶�
				ans+=' ';
			}
			else {//���ڰ� ������ �ƴ� ���
				if(s.charAt(i-1)==' ') {//�� ������ ���ڰ� �����ϰ��
					ans+=String.valueOf(s.charAt(i)).toUpperCase();//���� �빮�ڷ� ����
				}
				else {//������ ���ڰ� ������ �ƴ� ���
					ans+=String.valueOf(s.charAt(i));//���� �״�� ����
				}
			}
		}
 
        return ans;
	}
	
}
