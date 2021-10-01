package work;
//https://programmers.co.kr/learn/courses/30/lessons/12951
//프로그래머스 JadenCase 문자열 만들기

public class solution_JadenCase {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	System.out.print(solution("a aaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaa    b"));
		}

	private static String solution(String s) {
		// TODO Auto-generated method stub
		String ans="";
		s=s.toLowerCase();//문자열을 전부 소문자로 변경
		ans+=String.valueOf(s.charAt(0)).toUpperCase();//제일 첫번째 단어만 대문자로 변경
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==' ') {//문자가 공백일때
				ans+=' ';
			}
			else {//문자가 공백이 아닐 경우
				if(s.charAt(i-1)==' ') {//그 이전의 문자가 공백일경우
					ans+=String.valueOf(s.charAt(i)).toUpperCase();//문자 대문자로 변경
				}
				else {//이전의 문자가 공백이 아닐 경우
					ans+=String.valueOf(s.charAt(i));//문자 그대로 저장
				}
			}
		}
 
        return ans;
	}
	
}
