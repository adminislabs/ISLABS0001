package Datastructure;

class Node
{
	int data;
	Node left , right;
	
	public Node(int d)
	{
		data=d;
		left=right=null;
	}
	
	
}

public class BinaryTree
{
	    Node root;
	   
	    BinaryTree()
	    {
	    	root= null;
	    }
	    void printPostorder(Node node)
	    {
	    	if(node==null)
	    		return;
	    	printPostorder(node.left);
	    	printPostorder(node.right);
	    	System.out.println(node.data + " ");
	    }
	    void printPreorder(Node node)
	    {
	    	if(node==null)
	    		return;
	    	System.out.println(node.data + "");
	    	printPreorder(node.left);
	    	printPreorder(node.right);
	    	
	    }
	    void printInorder(Node node)
	    {
	    	if(node==null)
	    		return;
	    	printInorder(node.left);
	    	System.out.println(node.data + " ");
	    	printInorder(node.right);
	    }
	    void printPreorder()
	    {
	    	printPreorder(root);
	    	
	    }
	    void printPostorder()
	    {
	    	printPostorder(root);
	    }
	    void printInorder()
	    {
	    	printInorder(root);
	    }
	    public static void main(String args[])
	    {
	    	BinaryTree tree =new BinaryTree();
	    	tree.root=new Node(0);
	    	tree.root.left=new Node(2);
	    	tree.root.right=new Node(3);
	    	tree.root.left.left =new Node (4);
	    	
	    	System.out.println("Preorder");
	    	tree.printPreorder();
	    	System.out.println("Postorder");
	    	tree.printPostorder();
	    	System.out.println("Inorder");
	    	tree.printInorder();
	    }
		
	

}
