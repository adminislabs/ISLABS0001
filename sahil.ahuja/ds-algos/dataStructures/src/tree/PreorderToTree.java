package tree;

public class PreorderToTree {
	Node root;
	PreorderToTree(){
		root=null;
	}
 public void insertrec(int item){
	 root=insert(root,item);
 }
	public Node insert(Node root,int item){
		if(root==null){
			root=new Node(item);
		}
		else if(item<root.item){
			if(root.left==null){
				Node temp=new Node(item);
				temp.left=temp.right=null;
				root.left=temp;
				return root;
			}
			else{
				root.left=insert(root.left,item);
			}
		}
		else{
			
				if(root.right==null){
					Node temp=new Node(item);
					temp.left=temp.right=null;
					root.right=temp;
					return root;
				}
				else{
					root.right=insert(root.right,item);
				}
			
		}
		return root;
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
}
