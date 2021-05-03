package bj_work2;
import java.util.*;
import java.lang.*;
public class bj_14 {
//백준10814
//온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
//이때, 회원들을 나이가 증가하는 순으로
//나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int n= in.nextInt();//갯수 입력
		member[] m=new member[n];
		
		for(int i=0;i<n;i++){
			int age=in.nextInt();
			String str=in.next();
			m[i]=new member(age,str);//생성된 객체에 값을 입력한다
		}
		Arrays.sort(m);
		//정렬.
		
	    for(member s : m) {
	        System.out.println(s.getAge() + " "+s.getName());
	        }
	}
}

//Comparable 인터페이스를 구현하는 경우 public int compareTo(T) 메소드를 구현하고 
//내부에서 비교처리 후 int형 리턴으로 비교 결과를 리턴한다.
class member implements Comparable<member> {
	int age;
	String name;//age와 name의 필드변수 생성
	
	public member(int age, String name){
		this.age=age;
		this.name=name;// 객체 생성자 작성
	}
   public String getName() {
         return name;
   }
   public int getAge() {
         return age;
   }
   @Override
   public int compareTo(member o) {
       int result = this.getAge() - o.getAge();//나이로 먼저 정렬시킨 후
       if(result == 0) {
           result = this.getName().compareTo(o.getName());
           //나이가 같을 경우 이름순(사전순)으로 정렬시킨다.
       }
       return result;//이 값을 반환한다.
   }
}
//참고:https://javaplant.tistory.com/15

