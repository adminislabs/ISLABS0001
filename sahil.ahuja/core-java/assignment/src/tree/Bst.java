package tree;

public class Bst {
    Node root;
    Bst(){
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
	
	public int max(int n1,int n2){
		if(n1>n2)
			return n1;
		else return n2;
	}
	public void heights(){
		int height=height(root);
		System.out.println(height);
	}
	public int height(Node root){
		if(root==null){
			return -1;
		}
		return 1+(max(height(root.left),height(root.right)));
	}
}
