package work;
import java.util.*;
public class makeProject {
	 public static int[] solution(int[] progresses, int[] speeds) {
		   int []days=new int[progresses.length+1];
		   for(int i=0;i<progresses.length;i++) {
			   if((100-progresses[i])%speeds[i]!= 0) {//나머지가 생길 경우 작업이 완성되는 날짜 +1
				   days[i]=(100-progresses[i])/speeds[i]+1;
			   }
			   else {
				   days[i]=(100-progresses[i])/speeds[i];
			   }
		   }
         /*작업이 완성될때 까지 걸리는 기간을 계산해서 저장하는 배열
          (작업 완성도(=100)-작업진행도(progresses[i]))/작업속도(speeds[i])의 몫이 작업이 완성될때 까지 걸리는 기간 
          나머지는 작업 속도보다 작으니 몫에 +1 */
          
		   days[days.length-1]=100;
         //끝에 불가능한 최대치의 값(100)을 추가한다. 밑에 for문 돌릴때 끝까지 돌릴려고
	        
		   List<Integer> ans = new ArrayList<Integer>();//리스트 생성
	        int max=days[0];//가장 시간이 걸리는 작업 기간
	        int count=0;//배포될 기능의 개수 카운터 
	        for(int i=0;i<days.length-1;i++) {
	        	count++;
	        	if(days[i]<days[i+1]&&days[i+1]>max) {
              /*다음 기간의 크기가 이전 기간의 크기보다 크고 가장 시간이 걸리는 기간보다 클때
              예를 들어 [16,1,7,70,2,18]이라는 작업 기간들이 필요할때
              배포될 날짜에 배포될 작업들의 개수들은 [3,3] >{16,1,7},{70,2,18}
              왜냐면 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포되기 때문에 
              처음의 max보다 큰 기간이 걸리지 않는 이상 그보다 작은 기간이 필요한 기능들은
              같이 배포된다*/
	        		ans.add(count);//배포될 기능의 개수 리스트에 추가
	        		count=0;//카운터를 처음으로 설정한다
	        		max=days[i+1];//max값은 더 큰 값으로 변경
	        	}
	        }
	        int[]answer=ans.stream().mapToInt(Integer::intValue).toArray();//리스트를 배열로 변경
	        return answer;
	    }

	public static void main(String[] args) {//질문 입력용
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[]prograss=new int[n];
		int[]speed=new int[n];
		
		for(int i=0;i<n;i++) {
			prograss[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			speed[i]=in.nextInt();
		}
		int []ans=solution(prograss,speed);
		System.out.println();
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
