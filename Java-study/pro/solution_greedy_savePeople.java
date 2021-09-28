package work;
//https://programmers.co.kr/learn/courses/30/lessons/42885
//프로그래머스 구명보트
import java.util.Arrays;

public class solution_greedy_savePeople {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);//숫자 크기대로 정렬
      
        int last=people.length-1;//가장 큰 몸무게인 사람의 인덱스 
        int first=0;//가장 작은 몸무게인 사람의 인덱스
        int all=people.length;//전체 사람 수
        
        while(first<=last){//last가 first이하일때 반복
        	if(people[last]<=limit/2.0) {//가장 큰 몸무게가 제한의 반보다 작거나 같을 경우
        		answer+=(int) (Math.ceil(all/2.0));//남은 사람의 수를 2로 나누어 올림
        		break;
        	}
        	answer++;
        	if(people[last]+ people[first] <= limit) {//가장 작은 몸무게+ 가장 큰 몸무게의 합이 제한보다 작거나 동일할 때
        		last-=1;//그 다음으로 큰 몸무게를 가진 사람의 인덱스 저장
        		first+=1;//그 다음으로 작은 몸무게를 가진 사람의 인덱스 저장
        		all-=2;//전체 사람 수-2
        	}
        	else {
        		last-=1;//그 다음으로 큰 몸무게를 가진 사람의 인덱스 저장
        		all-=1;//전체 사람 수-1
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
