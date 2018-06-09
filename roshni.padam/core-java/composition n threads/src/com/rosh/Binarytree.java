package com.rosh;

public class Binarytree {
Node root;
void deleteTree(Node node)
{
	if (node==null)
		return;
	deleteTree(node.left);
	deleteTree(node.right);
	System.out.println("deleted node is"+node.data);
	node=null;
}
	public static void main(String[] args) {
		Binarytree Tree= new Binarytree();
		Tree.root=new Node(1);
		Tree.root.left=new Node(2);
		Tree.root.right=new Node(3);
		Tree.root.left.left=new Node(4);
		Tree.root.left.right=new Node(5);
		Tree.deleteTree(Tree.root);
		Tree.root=null;
		System.out.println("Treedelete");
	
		
	
	
	
	
	}
}











