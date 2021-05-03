package bj_work2;
import java.util.*;
import java.lang.*;
public class bj_14 {
//����10814
//�¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����.
//�̶�, ȸ������ ���̰� �����ϴ� ������
//���̰� ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		int n= in.nextInt();//���� �Է�
		member[] m=new member[n];
		
		for(int i=0;i<n;i++){
			int age=in.nextInt();
			String str=in.next();
			m[i]=new member(age,str);//������ ��ü�� ���� �Է��Ѵ�
		}
		Arrays.sort(m);
		//����.
		
	    for(member s : m) {
	        System.out.println(s.getAge() + " "+s.getName());
	        }
	}
}

//Comparable �������̽��� �����ϴ� ��� public int compareTo(T) �޼ҵ带 �����ϰ� 
//���ο��� ��ó�� �� int�� �������� �� ����� �����Ѵ�.
class member implements Comparable<member> {
	int age;
	String name;//age�� name�� �ʵ庯�� ����
	
	public member(int age, String name){
		this.age=age;
		this.name=name;// ��ü ������ �ۼ�
	}
   public String getName() {
         return name;
   }
   public int getAge() {
         return age;
   }
   @Override
   public int compareTo(member o) {
       int result = this.getAge() - o.getAge();//���̷� ���� ���Ľ�Ų ��
       if(result == 0) {
           result = this.getName().compareTo(o.getName());
           //���̰� ���� ��� �̸���(������)���� ���Ľ�Ų��.
       }
       return result;//�� ���� ��ȯ�Ѵ�.
   }
}
//����:https://javaplant.tistory.com/15

