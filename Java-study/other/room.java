package school6;
import java.util.Scanner;
class person{
	private String p;
	private int ts;
	private int te;
	
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public int getTs() {
		return ts;
	}
	public void setTs(int ts) {
		this.ts = ts;
	}
	public int getTe() {
		return te;
	}
	public void setTe(int te) {
		this.te = te;
	}
	person(String p,int ts,int te){
		this.p=p;
		this.ts=ts;
		this.te=te;
	}
	public void show() {
		System.out.print(getP()+" ");
		System.out.print(+getTs()+","+getTe()+'\n');
		
	}

}
public class hw11_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
			
		System.out.print("��û ȸ�� �� �Է�: ");
		int w=in.nextInt();

		person[] p=new person[w];
		System.out.println("4���� ȸ�Ǹ�� ȸ�ǽ� ��� �ð�(���۽ÿ� �����)�� whitespace�� �����Ͽ� �Է�:");
		
		for(int i=0;i<w;i++) {
			String s=in.next();
			int st=in.nextInt();
			int et=in.nextInt();
			p[i]=new person(s, st, et);
		}
		
		person[]np=work(p,w);
		
		int end=23;
		int start=6;
		int c=0;
		int p_t=0;
		person[]ans;
		
		System.out.println("������ ȸ�� ������ =");
		for(int i=0;i<w;i++) {
			if(np[i].getTe()<24 && np[i].getTs()>=6) {
				if(p_t<=np[i].getTs()){
					p_t=np[i].getTe();
					np[i].show();
					c++;
				}
			}
		}
		System.out.print("������ ȸ�� �� = "+c);

	}

	private static person[] work(person[] p, int w) {		

		// TODO Auto-generated method stub
		for(int i1=0;i1<w;i1++){//�迭�� ũ�⸸ŭ �ݺ�
            for(int i2=0;i2<i1;i2++){//i1�� ũ�⸸ŭ �ݺ�.

                if(p[i2].getTe()>p[i2+1].getTe()){//�ƽ�Ű �ڵ�� ����ȯ ���Ѽ� �ƽ�Ű �ڵ尡 ū ���� �ڷ� ������.
                    person temp=p[i2];
                    p[i2]=p[i2+1];
                    p[i2+1]=temp;
                }
                else if(p[i2].getTe()==p[i2+1].getTe()) {
                	if(p[i2].getTs()<p[i2+1].getTs()){//�ƽ�Ű �ڵ�� ����ȯ ���Ѽ� �ƽ�Ű �ڵ尡 ū ���� �ڷ� ������.
                        person temp=p[i2];
                        p[i2]=p[i2+1];
                        p[i2+1]=temp;
                    }
                }
            }
        }
		return p;
	}
}


