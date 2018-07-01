package Boxing;

/**
 * This class
 * 
 * @author Pratibha
 *
 */
public class BinarySearchMain
{
	private Node root;

	BinarySearchMain() 
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
	public Node insert(Node root, int data)
	{
		if (root == null) // When tree is empty
		{
			root = new Node(data);
			root.setData(data);
		}
		// When tree is not empty and consist of nodes
		else if (data < root.getData())
		{
			root.setLeft(insert(root.getLeft(), data));
		} else 
		{
           root.setRight(insert(root.getRight(), data));
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
		if (root != null) 
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
		if (root != null)
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
	  /**Function to search the node n the tree
	   * 
	   * @param 
	   * @param root
	   * @return
	   * 
	   */
		  
		
	}


