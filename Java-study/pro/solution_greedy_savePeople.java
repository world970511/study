package work;
//https://programmers.co.kr/learn/courses/30/lessons/42885
//���α׷��ӽ� ����Ʈ
import java.util.Arrays;

public class solution_greedy_savePeople {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);//���� ũ���� ����
      
        int last=people.length-1;//���� ū �������� ����� �ε��� 
        int first=0;//���� ���� �������� ����� �ε���
        int all=people.length;//��ü ��� ��
        
        while(first<=last){//last�� first�����϶� �ݺ�
        	if(people[last]<=limit/2.0) {//���� ū �����԰� ������ �ݺ��� �۰ų� ���� ���
        		answer+=(int) (Math.ceil(all/2.0));//���� ����� ���� 2�� ������ �ø�
        		break;
        	}
        	answer++;
        	if(people[last]+ people[first] <= limit) {//���� ���� ������+ ���� ū �������� ���� ���Ѻ��� �۰ų� ������ ��
        		last-=1;//�� �������� ū �����Ը� ���� ����� �ε��� ����
        		first+=1;//�� �������� ���� �����Ը� ���� ����� �ε��� ����
        		all-=2;//��ü ��� ��-2
        	}
        	else {
        		last-=1;//�� �������� ū �����Ը� ���� ����� �ε��� ����
        		all-=1;//��ü ��� ��-1
        	}
        }
        return answer;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int [] i= {10,20,30,40,50,60,70,80,90};
    	System.out.print(solution(i, 100));
	}


}
