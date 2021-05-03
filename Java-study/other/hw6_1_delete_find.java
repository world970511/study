package school4;

import school4.BinarySearchTree.Node;

public class hw6_1_delete_find {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
	  System.out.println("hw6_1: �ڳ���");
	  
	  System.out.print("�������� ��� = ");
	  tree.printTree();   
	  tree.add("cat");
	  
	  System.out.print("\n�������� ��� = ");
	  tree.printTree(); 
	  
	  tree.add("HAT");
	  tree.add("ant");
	  tree.add("BEE");
	  tree.add("dog");
	  tree.add("Last");
	  tree.add("KEY");
	  tree.add("Korea");
	  tree.add("egg");
	  tree.add("ink");
	  tree.add("juice");
	  tree.add("free");
	  tree.add("go");
	  tree.add("CAT");  // �̹� �����ϴ� �ܾ��̹Ƿ� ���Ե��� ���� ����
	  System.out.print("\n�������� ��� = ");
	  tree.printTree();   // �Ǵ� System.out.println(tree.toString()); 
	  
	  boolean a=tree.find("hello");
	  if (a==false) {
		  System.out.print("\nhello�� �������� �ʽ��ϴ�");
	  }
	  else {
		  System.out.print("\nhello�� �����մϴ�");
	  }

	  tree.delete("juice");
	  System.out.print("\n�������� ��� = ");
	  tree.printTree();   // �Ǵ� System.out.println(tree.toString()); 
	}
}

class BinarySearchTree{//Ʈ�� ��� ����
	public class Node{
		private String key;//Ű
		private  Node left;//���� �ڽĳ�� ��ũ
		private  Node right;//������ �ڽĳ�� ��ũ
	
		public Node(String key) {//������ Node
			this.key=key;
			setLeft(null);
			setRight(null);
		}
		
		public Node getLeft() {
			// TODO Auto-generated method stub
			return left;
		}
		public void setLeft(Node left) {
			// TODO Auto-generated method stub
			this.left=left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			 this.right=right;
		}
		
	}
	public Node root=null;//root�� null�� �ʱ�ȭ

	public void add(String str) {//���� ����_1
		// TODO Auto-generated method stub
		if(root==null) {// root�� null�� ��� �� ��带 �����ϰ� �� ���� root�� ����
			Node r=new Node(str);
			root= r;
		}
		else {//root�� null�� �ƴ� ���> add(��Ʈ,���� ��)�� ȣ��
			add(root,str);
		}
	}
	private void add(Node root, String str) {// ���Կ���_2
		if(str.compareToIgnoreCase(root.key)<0) {
			//��� ���ڿ��� �Ű������� ���� ���ڿ����� ���� ������ �ռ� ���.(��ҹ��� ���� ����)> ���� ����Ʈ�� 
			if(root.getLeft()==null) {// root ����� ���� ��ũ�� null�� �� �� ��带 �����ϰ� ���ʿ� ����
				Node r2= new Node(str);
				root.setLeft(r2);
			}
			else {//�ƴ� ��� ��� ȣ��> ���ʳ���� ���� ��Ʈ�� �Ͻú���
				add(root.getLeft(),str);
			}
		}
		else if(str.compareToIgnoreCase(root.key)>0) {
			//��� ���ڿ��� �Ű������� ���� ���ڿ����� ���� ������ ���� ���.(��ҹ��� ���о���)
			if(root.getRight()==null) {// root ����� ������ ��ũ�� null�� �� �� ��带 �����ϰ� �����ʿ� ����
				Node r2= new Node(str);
				root.setRight(r2);
			}
			else {//�ƴ� ��� ��� ȣ��> �����ʳ���� ���� ��Ʈ�� �Ͻú���
				add(root.getRight(),str);
			}
		}
	}
	
	  public boolean find(String key){//Ž�� ����
	        Node current= root;// ���� ���= ��Ʈ
	        while(current != null){// ���� ��尡 null�� �ƴ� ���
	            if(current.key == key){//���� ��Ʈ��� Ű�� �Էµ� ���� ���� ���
	                return true;
	            }else if(key.compareToIgnoreCase(current.key)<0){ // ã�� ���� ���� ��庸�� ������
	                current = current.getLeft();//���� ����Ʈ�� ��ͷ� �ݺ�
	            }else {// ã�� ���� ���� ��庸�� ũ��
	                current = current.getRight();//������ ����Ʈ�� ��ͷ� �ݺ�
	            }
	        }
	        return false;
	    }

		public void delete(String str){//���� ����
			Node parent = root;//������ġ�� ��Ʈ���(�θ� ���)
			Node current = root;//������ġ
			boolean isLeft = false;	//���� �ڽİ� ���� ��ġ�ϴ��� Ȯ���ϴ� flag
			/* ��ü ��忡�� x���� ã�������� �˻�.
			 *  Ʈ�� ��ü���� x���� ������ while�� ���� �Ǿ�����.*/
			while(current.key != str){//������ġ�� Ű�� ã�� ���� �ٸ� ���
				parent = current;//���� ��带 �θ� ���� ����
				if(str.compareToIgnoreCase(current.key)<0){// ã�� ���� ���� ��庸�� ���������� ������
					isLeft= true;//���� �ڽİ� ���� ��ġ
					current = current.left;//���� ���� ���� ��ũ�� ����
				}else{// ã�� ���� ���� ��庸�� ���������� ũ��
					isLeft = false;//���� �ڽİ� ���� ����ġ
					current = current.right;//���� ���� ������ ��ũ�� ����
				} 
				//current�� null�̸� Ʈ�� ��ü����x�� ���� ���°���.
				if(current == null){
					System.out.println("�������� �ʴ� ���Դϴ�.");
				}
			}
			
			//1. �ڽĳ�尡 ���� ���
			if((current.left == null) && (current.right == null)){//�� ��ũ�� �� null�� ���
				if(current == root){//x�� ���� ���� ������ ��尡 ��Ʈ�̰� �ڽ��� ���ٸ� ��Ʈ ���� 
					root = null;
				}
				//�θ������ ������ ����
				if(isLeft){
					parent.left = null;
				}else{
					parent.right = null;
				}
			}
			
			/*2. �ϳ��� �ڽ��� ���� ���> �����ϰ��� �ϴ� ���(=r)�� �θ�
			 * r�� �ڽ� ��带 ���� ����Ű���� �Ѵ�*/
			//�����ڽ��� �����°��
			else if(current.right == null){
				if(current == root){//x�� ���� ���� ������ ��尡 ��Ʈ�� ��
					root = current.left;
				}else if(isLeft){
					parent.left = current.left;
				}else{
					parent.right = current.left;
				}
			}
			//������ �ڽ��� ������ ���
			else if(current.left == null){
				if(current == root){//x�� ���� ���� ������ ��尡 ��Ʈ�� ��
					root = current.right;
				}else if(isLeft){
					parent.left = current.right;
				}else{
					parent.right = current.right;
				}
			}
			
			/*2. �ΰ��� �ڽ��� ���� ���> �����ϰ��� �ϴ� ���(=r)�� ������ ����Ʈ���� �ּҿ��ҳ�� s�� �����ϰ�
			 * s�� r�� �ڸ��� �д�.*/
			else if(current.left != null && current.right != null){//�ڽĳ�� �Ѵ� ä���� ���� ���
				// ������ ����Ʈ���� �ּҰ��� ã��
				Node s = getS(current);
				
				if(current == root){//x�� ���� ���� ������ ��尡 ��Ʈ�� ��
					root = s;
				}else if(isLeft){
					parent.left = s;
				}else{
					parent.right = s;
				}		
				s.left = current.left;
			}

		}
		
		//������ ����Ʈ���� �ּҰ�
		public Node getS(Node deleteNode){
			Node s = null;
			Node sParent = null;
			Node current = deleteNode.right;
			
			while(current != null){
				sParent = s;
				s = current;
				//���� ����Ʈ���� Ÿ�� ������
				current = current.left;
			}
			if(s!= deleteNode.right){
				sParent.left = s.right;
				s.right = deleteNode.right;
			}
			return s;
		}
	
	public void printTree() {
		inorder(root);//������ȸ
	}
	private void inorder(Node root) {
		//������ȸ�� left -> root ->right ������ ��ȸ������ ���� ����Ʈ���� ��ͷ� ���� ��ȸ> root> ������ ����Ʈ���� ��ȸ
		if(root != null) {
			inorder(root.getLeft());
			System.out.print(root.key+" ");
			inorder(root.getRight());
		}
	}

}
