package work;
import java.util.*;
public class H_index {
/*��� ������ ���� ���� �� ���ϰ���....�ϴ� �ε����� �迭 ���̶� ���ؼ� �迭 ���� �ε������� Ŀ������ 
 * ���϶�� ���� �˾Ƶ�� �ذ��ߴ�. ���� ���ظ� �� ���ϰھ ������ ����
 * �����α�� ���ؼ� �ϴ� �÷�����
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i= {2};
		solution(i);
	}
	private static void solution(int[] citations) {
		// TODO Auto-generated method stub
		Arrays.sort(citations);
		int h_index = 0;
		

			for (int i=0;i<citations.length;i++) {
					if(citations[i]>=citations.length-i) {
						h_index=citations.length-i;
						break;
					}
			}
		System.out.println(h_index);
	}

}
