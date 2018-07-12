package com.practice;
/**
 * the class AvlTree is created to implements the basics 
 * req. function for the application.
 * @author roshni
 *
 */
public class AvlTree {
	
	private AvlNode root;
	private Object getItem;
	 
	    public AvlNode getRoot() {
		return root;
	}

	public void setRoot(AvlNode root) {
		this.root = root;
	}

		//function to get the height of the tree
	    int height(AvlNode N) {
	        if (N == null)
	            return 0;
	 
	        return N.getHeight();
	    }
	 
	    // function to get maximum of two integers
	    int max(int a, int b) {
	        return (a > b) ? a : b;
	    }
	 /**
	  * this function rotate the tree in right side 
	  * @param y
	  * @return
	  */
	    AvlNode rightRotate(AvlNode y) {
	    	AvlNode x = y.getLeft();
	    	AvlNode T2 = x.getRight();
	        x.setRight(y);
	        y.setLeft(T2);
	        // Update heights
	        y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);
	        x.setHeight(max(height(x.getLeft()), height(x.getRight())) + 1);
	        // Return new root
	        return x;
	    }
	 /**
	  * 
	  * this function rotate the tree in 
	  * left side 
	  * @param x
	  * @return
	  */
	    AvlNode leftRotate(AvlNode x) {
	    	AvlNode y = x.getRight();
	    	AvlNode T2 = y.getLeft();
	        // Perform rotation
	        y.setLeft(x);
	        x.setRight(T2);
	        //  Update heights
	        x.setHeight(max(height(x.getLeft()), height(x.getRight())) + 1);
	        y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);
	 
	        // Return new root
	        return y;
	    }
	 
	    // Get Balance factor of node N
	    int getBalance(AvlNode N) {
	        if (N == null)
	            return 0;
	 
	        return height(N.getLeft()) - height(N.getRight());
	    }
	    
	 /**
	  * 
	  * This function is used to insert elements in the tree
	  * and perform balancing on unBalanaced node by doing rotations 
	  * @param node
	  * @param key
	  * @return
	  */
	    AvlNode insert(AvlNode node, int key) {
	 
	        /* 1.  Perform the normal BST insertion */
	        if (node == null)
	        {
	        	node=new AvlNode();
	        	node.setItem(key);
	        }    
	 
	        if (key < node.getItem())
	            node.setLeft(insert(node.getLeft(), key));
	        else if (key > node.getItem())
	            node.setRight(insert(node.getRight(), key));
	        else // Duplicate keys not allowed
	            return node;
	 
	        /* 2. Update height of this ancestor node */
	        node.setHeight(1 + max(height(node.getLeft()),
	                              height(node.getRight())));
	 
	        /* 3. Get the balance factor of this ancestor
	              node to check whether this node became
	              unbalanced */
	        int balance = getBalance(node);
	 
	        // If this node becomes unbalanced, then there
	        // are 4 cases Left Left Case
	        if (balance > 1 && key < node.getLeft().getItem())
	            return rightRotate(node);
	 
	        // Right Right Case
	        if (balance < -1 && key > node.getRight().getItem())
	            return leftRotate(node);
	 
	        // Left Right Case
	        if (balance > 1 && key > node.getLeft().getItem()) {
	            node.setLeft(leftRotate(node.getLeft()));
	            return rightRotate(node);
	        }
	 
	        // Right Left Case
	        if (balance < -1 && key < node.getRight().getItem()) {
	            node.setRight(rightRotate(node.getRight()));
	            return leftRotate(node);
	        }
	 
	        /* return the (unchanged) node pointer */
	        return node;
	    }
	    
	    /**
	     * This method returns the maximum value present in our tree
	     * @param root
	     * @return
	     */
	    public int maxValue(AvlNode root) {
	        int maxvalue = root.getItem();
	        while (root.getRight() != null) {
	            maxvalue = root.getRight().getItem();
	            root = root.getRight();
	        }
	        return maxvalue;
	    }
	    /**
	     * This method returns the minimum value present in our tree
	     * @param root
	     * @return
	     */
	    public int minValue(AvlNode root) {
	        int minvalue = root.getItem();
	        while (root.getLeft() != null) {
	            minvalue = root.getLeft().getItem();
	            root = root.getLeft();
	        }
	        return minvalue;
	    }
	    /**
	     * this method traverse the tree in preOrder manner
	     * @param root
	     */
	    public void preorder(AvlNode root) {
	        if (root != null) {
	            System.out.print(root.getItem()+ " ");
	            preorder(root.getLeft());
	            preorder(root.getRight());
	        }
	    }

	    /**
	     * This method traverse the tree in inOrder manner
	     *
	     * @param root
	     */
	    public void inorder(AvlNode root) {
	        if (root != null) {

	            inorder(root.getLeft());
	            System.out.print(root.getItem() + " ");
	            inorder(root.getRight());
	        }
	    }
	    /**
	     * This method traverse the tree in postOrder manner
	     *
	     * @param root
	     */
	    public void postorder(AvlNode root) {
	        if (root != null) {

	            postorder(root.getLeft());
	            postorder(root.getRight());
	            System.out.print(root.getItem() + " ");
}}}
