package school4;

import school4.BinarySearchTree.Node;

public class hw6_1_delete_find {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
	  System.out.println("hw6_1: 박나은");
	  
	  System.out.print("오름차순 출력 = ");
	  tree.printTree();   
	  tree.add("cat");
	  
	  System.out.print("\n오름차순 출력 = ");
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
	  tree.add("CAT");  // 이미 존재하는 단어이므로 삽입되지 않을 것임
	  System.out.print("\n오름차순 출력 = ");
	  tree.printTree();   // 또는 System.out.println(tree.toString()); 
	  
	  boolean a=tree.find("hello");
	  if (a==false) {
		  System.out.print("\nhello는 존재하지 않습니다");
	  }
	  else {
		  System.out.print("\nhello는 존재합니다");
	  }

	  tree.delete("juice");
	  System.out.print("\n오름차순 출력 = ");
	  tree.printTree();   // 또는 System.out.println(tree.toString()); 
	}
}

class BinarySearchTree{//트리 노드 구조
	public class Node{
		private String key;//키
		private  Node left;//왼쪽 자식노드 링크
		private  Node right;//오른쪽 자식노드 링크
	
		public Node(String key) {//생성자 Node
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
	public Node root=null;//root는 null로 초기화

	public void add(String str) {//삽입 연산_1
		// TODO Auto-generated method stub
		if(root==null) {// root가 null일 경우 새 노드를 생성하고 그 값을 root에 저장
			Node r=new Node(str);
			root= r;
		}
		else {//root가 null이 아닐 경우> add(루트,넣을 값)을 호출
			add(root,str);
		}
	}
	private void add(Node root, String str) {// 삽입연산_2
		if(str.compareToIgnoreCase(root.key)<0) {
			//대상 문자열이 매개변수로 받은 문자열보다 사전 순으로 앞선 경우.(대소문자 구분 안함)> 왼쪽 서브트리 
			if(root.getLeft()==null) {// root 노드의 왼쪽 링크가 null일 때 새 노드를 생성하고 왼쪽에 삽입
				Node r2= new Node(str);
				root.setLeft(r2);
			}
			else {//아닐 경우 재귀 호출> 왼쪽노드의 값을 루트로 일시변경
				add(root.getLeft(),str);
			}
		}
		else if(str.compareToIgnoreCase(root.key)>0) {
			//대상 문자열이 매개변수로 받은 문자열보다 사전 순으로 뒤질 경우.(대소문자 구분안함)
			if(root.getRight()==null) {// root 노드의 오른쪽 링크가 null일 때 새 노드를 생성하고 오른쪽에 삽입
				Node r2= new Node(str);
				root.setRight(r2);
			}
			else {//아닐 경우 재귀 호출> 오른쪽노드의 값을 루트로 일시변경
				add(root.getRight(),str);
			}
		}
	}
	
	  public boolean find(String key){//탐색 연산
	        Node current= root;// 현재 노드= 루트
	        while(current != null){// 현재 노드가 null이 아닐 경우
	            if(current.key == key){//현재 루트노드 키와 입력된 것이 같을 경우
	                return true;
	            }else if(key.compareToIgnoreCase(current.key)<0){ // 찾는 값이 현재 노드보다 작으면
	                current = current.getLeft();//왼쪽 서브트리 재귀로 반복
	            }else {// 찾는 값이 현재 노드보다 크면
	                current = current.getRight();//오른쪽 서브트리 재귀로 반복
	            }
	        }
	        return false;
	    }

		public void delete(String str){//삭제 연산
			Node parent = root;//현재위치의 루트노드(부모 노드)
			Node current = root;//현재위치
			boolean isLeft = false;	//왼쪽 자식과 값이 일치하는지 확인하는 flag
			/* 전체 노드에서 x값을 찾을때까지 검색.
			 *  트리 전체에서 x값이 없더라도 while은 돌게 되어있음.*/
			while(current.key != str){//현재위치의 키가 찾는 값과 다를 경우
				parent = current;//현재 노드를 부모 노드로 변경
				if(str.compareToIgnoreCase(current.key)<0){// 찾는 값이 현재 노드보다 사전순으로 작으면
					isLeft= true;//왼쪽 자식과 값이 일치
					current = current.left;//현재 노드는 왼쪽 링크로 변경
				}else{// 찾는 값이 현재 노드보다 사전순으로 크면
					isLeft = false;//왼쪽 자식과 값이 불일치
					current = current.right;//현재 노드는 오른쪽 링크로 변경
				} 
				//current가 null이면 트리 전체에서x의 값이 없는것임.
				if(current == null){
					System.out.println("존재하지 않는 값입니다.");
				}
			}
			
			//1. 자식노드가 없는 경우
			if((current.left == null) && (current.right == null)){//두 링크가 다 null일 경우
				if(current == root){//x와 같은 값을 가지는 노드가 루트이고 자식이 없다면 루트 삭제 
					root = null;
				}
				//부모노드와의 연결을 끊음
				if(isLeft){
					parent.left = null;
				}else{
					parent.right = null;
				}
			}
			
			/*2. 하나의 자식을 갖는 경우> 삭제하고자 하는 노드(=r)의 부모가
			 * r의 자식 노드를 직접 가리키도록 한다*/
			//왼쪽자식을 가지는경우
			else if(current.right == null){
				if(current == root){//x와 같은 값을 가지는 노드가 루트일 때
					root = current.left;
				}else if(isLeft){
					parent.left = current.left;
				}else{
					parent.right = current.left;
				}
			}
			//오른쪽 자식을 가지는 경우
			else if(current.left == null){
				if(current == root){//x와 같은 값을 가지는 노드가 루트일 때
					root = current.right;
				}else if(isLeft){
					parent.left = current.right;
				}else{
					parent.right = current.right;
				}
			}
			
			/*2. 두개의 자식을 갖는 경우> 삭제하고자 하는 노드(=r)의 오른쪽 서브트리의 최소원소노드 s를 삭제하고
			 * s를 r의 자리에 둔다.*/
			else if(current.left != null && current.right != null){//자식노드 둘다 채워져 있을 경우
				// 오른쪽 서브트리의 최소값을 찾음
				Node s = getS(current);
				
				if(current == root){//x와 같은 값을 가지는 노드가 루트일 때
					root = s;
				}else if(isLeft){
					parent.left = s;
				}else{
					parent.right = s;
				}		
				s.left = current.left;
			}

		}
		
		//오른쪽 서브트리의 최소값
		public Node getS(Node deleteNode){
			Node s = null;
			Node sParent = null;
			Node current = deleteNode.right;
			
			while(current != null){
				sParent = s;
				s = current;
				//왼쪽 서브트리를 타고 내려감
				current = current.left;
			}
			if(s!= deleteNode.right){
				sParent.left = s.right;
				s.right = deleteNode.right;
			}
			return s;
		}
	
	public void printTree() {
		inorder(root);//중위순회
	}
	private void inorder(Node root) {
		//중위순회는 left -> root ->right 순으로 순회함으로 왼쪽 서브트리를 재귀로 먼저 순회> root> 오른쪽 서브트리를 순회
		if(root != null) {
			inorder(root.getLeft());
			System.out.print(root.key+" ");
			inorder(root.getRight());
		}
	}

}
