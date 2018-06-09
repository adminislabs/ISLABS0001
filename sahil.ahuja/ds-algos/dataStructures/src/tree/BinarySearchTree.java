package tree;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
    	root=null;
    }
    public void insertrec(int item){
    	root=insert(root,item);
    }
	public Node insert(Node root,int item){
		if(root==null){
			root=new Node(item);
			return root;
		}
		else if(item<root.item){
			root.left=insert(root.left,item);
			return root;
		}
		else{
			root.right=insert(root.right,item);
			return root;
		}
		
	}
	public void inorderTraversal(){
		inorder(root);
		return;
	}
	public void inorder(Node root){
		if(root==null){
			return;
		}
		
		inorder(root.left);
		System.out.println(root.item);
		inorder(root.right);
		return;
	}
	public void preorderTraversal(){
		preorder(root);
		return;
	}
	public void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.println(root.item);
		preorder(root.left);
		preorder(root.right);
		return;
	}
	public void postorderTraversal(){
		postorder(root);
		return;
	}
	public void postorder(Node root){
		if(root==null){
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.item);
		return;
	}
	public void searchElement(int item){
		if(search(root,item)){
			System.out.println("CONGO...the element  is there");
		}
		else{
			System.out.println("SORRY...the element  is not there");
		}
	}
	public boolean search(Node root,int item){
		
		 if(root.item>item){
			return search(root.left,item);
		}
		else if(root.item<item){
			return search(root.right,item);
		}
		else if(root.item!=item){
			return false;
		}
		
			return true;
		
		
	}
}
