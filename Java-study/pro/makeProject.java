package work;
import java.util.*;
public class makeProject {
	 public static int[] solution(int[] progresses, int[] speeds) {
		   int []days=new int[progresses.length+1];
		   for(int i=0;i<progresses.length;i++) {
			   if((100-progresses[i])%speeds[i]!= 0) {//�������� ���� ��� �۾��� �ϼ��Ǵ� ��¥ +1
				   days[i]=(100-progresses[i])/speeds[i]+1;
			   }
			   else {
				   days[i]=(100-progresses[i])/speeds[i];
			   }
		   }
         /*�۾��� �ϼ��ɶ� ���� �ɸ��� �Ⱓ�� ����ؼ� �����ϴ� �迭
          (�۾� �ϼ���(=100)-�۾����൵(progresses[i]))/�۾��ӵ�(speeds[i])�� ���� �۾��� �ϼ��ɶ� ���� �ɸ��� �Ⱓ 
          �������� �۾� �ӵ����� ������ �� +1 */
          
		   days[days.length-1]=100;
         //���� �Ұ����� �ִ�ġ�� ��(100)�� �߰��Ѵ�. �ؿ� for�� ������ ������ ��������
	        
		   List<Integer> ans = new ArrayList<Integer>();//����Ʈ ����
	        int max=days[0];//���� �ð��� �ɸ��� �۾� �Ⱓ
	        int count=0;//������ ����� ���� ī���� 
	        for(int i=0;i<days.length-1;i++) {
	        	count++;
	        	if(days[i]<days[i+1]&&days[i+1]>max) {
              /*���� �Ⱓ�� ũ�Ⱑ ���� �Ⱓ�� ũ�⺸�� ũ�� ���� �ð��� �ɸ��� �Ⱓ���� Ŭ��
              ���� ��� [16,1,7,70,2,18]�̶�� �۾� �Ⱓ���� �ʿ��Ҷ�
              ������ ��¥�� ������ �۾����� �������� [3,3] >{16,1,7},{70,2,18}
              �ֳĸ� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����Ǳ� ������ 
              ó���� max���� ū �Ⱓ�� �ɸ��� �ʴ� �̻� �׺��� ���� �Ⱓ�� �ʿ��� ��ɵ���
              ���� �����ȴ�*/
	        		ans.add(count);//������ ����� ���� ����Ʈ�� �߰�
	        		count=0;//ī���͸� ó������ �����Ѵ�
	        		max=days[i+1];//max���� �� ū ������ ����
	        	}
	        }
	        int[]answer=ans.stream().mapToInt(Integer::intValue).toArray();//����Ʈ�� �迭�� ����
	        return answer;
	    }

	public static void main(String[] args) {//���� �Է¿�
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
