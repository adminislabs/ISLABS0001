import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pratibha
 */
public class BinarySearchTreeMain

{
	private Node root;

	BinarySearchTreeMain() 
	{
		root = null;
	}

	public Node getRoot()
	{
		return root;
	}

	public void setRoot(Node root) 
	{
		this.root = root;
	}

	/**
	 * Function to insert nodes in BinarySearchTree
	 * 
	 * @param root
	 * @param data
	 * @return root
	 */
	public Node insertNode(Node root, int data)
	{
		if (root == null) // When tree is empty
		{
			root = new Node(data);
			root.setData(data);
		}
		// When tree is not empty and consist of nodes
		else if (data < root.getData())
		{
			root.setLeft(insertNode(root.getLeft(), data));
		} else 
		{
           root.setRight(insertNode(root.getRight(), data));
		}
		return root;

	}

	/**
	 * Function to showcase tree in preorder form of Tree
	 * 
	 * @param root
	 */
	public void preorder(Node root) 
	{
		if (root!= null) 
                {
			
			System.out.println(root.getData() + "");
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}

	/**
	 * Function to showcase tree in inorder form of Tree
	 * 
	 * @param root
	 */
	public void inorder(Node root) 
	{
		if (root!= null)
                {
                        
			inorder(root.getLeft());
			System.out.println(root.getData() + "");
			inorder(root.getRight());

		}
	}

	/** Function to showcase tree in postorder form of Tree
	 * 
	 * @param root
	 */
	  public void postorder(Node root)
	  {
		  if(root!=null)
		  {
			 
			  postorder(root.getLeft());
			  postorder(root.getRight());
			  System.out.println(root.getData() + "");
			  
		  }
		
	 }
	 
	public int searchNode(Node root, int item) {
		if (root == null) {
			return -1;

		} else {
			if (root.getData() == item) {
				return item;
			} else if (item < root.getData()) {
				return (searchNode(root.getLeft(), item));
			}
			return (searchNode(root.getRight(), item));
		}

	}
	  
	  /**Function to delete the node n the tree
	   * 
	   * @param 
	   * @param root
	   * @return
	   * 
	   */
	  
	public  Node deleteNode(Node root, int data) {
			if (root != null)
				return root;
			if (data < root.getData())
				root.setLeft(deleteNode(root.getLeft(), data));
			else if (data > root.getData())
				root.setRight(deleteNode(root.getRight(), data));
			
			// Node with only one child or no child
			else {
				if (root.getLeft() == null)
					return root.getRight();
				else if (root.getRight() == null)
					return root.getLeft();
               }
			
			 //Node with two child now we need to find smallest inorder successor in the right subtree.
			 
			  root.setData(minimumValue(root.getRight()));
		
		    // Delete the inorder successor
		    root.setRight(deleteNode(root.getRight(),data));
		
	          return root;
		}
	      int minimumValue(Node root)
         {
   	             int minimumValue=root.getData();
   	          while(root.getLeft()!=null)
   	      {
   		    minimumValue=root.getLeft().getData();
   		     root=root.getLeft();
   	      }
      
   	      return minimumValue;
      }
/**This function is used to find the height of the binaryseacrh tree 
 * 
 * @param root
 * @return 
 */
        public int height(Node root) {
		if (root == null) {
			return -1;
		}
		return 1 + (max(height(root.getLeft()), height(root.getRight())));
	}
        public int max(int number1, int number2) {
		if (number1 > number2)
			return number1;
		else
			return number2;
	}
        public int maxValue(Node root) {
		int maxvalue = root.getData();
		while (root.getRight() != null) {
			maxvalue = root.getRight().getData();
			root = root.getRight();
		}
		return maxvalue;
        }

        /**This function is used for printing tree level by level 
         * 
         * @param root 
         */
         public void printTree(Node root){
 		Queue q = new LinkedList();
 		int levelNodes =0; 
		if(root==null) return;
 		q.add(root);
 		while(!q.isEmpty()){
 			levelNodes = q.size();
 			while(levelNodes>0){
				Node n = (Node)q.remove();
				System.out.print(" " + n.getData());
				if(n.getLeft()!=null) q.add(n.getLeft());
				if(n.getRight()!=null) q.add(n.getRight());
				levelNodes--;
			}
			System.out.println("");
		}
        }
        
}


