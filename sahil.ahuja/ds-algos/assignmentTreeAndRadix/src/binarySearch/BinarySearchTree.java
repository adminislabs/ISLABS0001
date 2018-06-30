package binarySearch;
import java.util.Arrays;

/**
 * 
 * @author sahil This class Binary search tree functions.. inserion,
 *         deletion,search and traversal
 */
public class BinarySearchTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	BinarySearchTree() {
		root = null;
	}

	/**
	 * This method inserts the item in binary search tree at its appropriate
	 * position
	 * 
	 * @param root as node
	 * 
	 * @param item as integer data to be inserted
	 * 
	 * @return root as node
	 */
	public Node insert(Node root, int item) {
		if (root == null) {
			root = new Node();
			root.setItem(item);

		} else if (item < root.getItem()) {
			root.setLeft(insert(root.getLeft(), item));

		} else {
			root.setRight(insert(root.getRight(), item));

		}
		return root;
	}

	/**
	 * This method traverse the tree in inorder
	 * 
	 * @param root
	 */
	public void inorder(Node root) {
		if (root != null) {

			inorder(root.getLeft());
			System.out.println(root.getItem());
			inorder(root.getRight());

		}

	}

	/**
	 * This method traverse the tree in preorder
	 * 
	 * @param root
	 */
	public void preorder(Node root) {
		if (root != null) {

			System.out.println(root.getItem());
			preorder(root.getLeft());
			preorder(root.getRight());

		}
	}

	/**
	 * This method traverse the tree in postorder
	 * 
	 * @param root
	 */
	public void postorder(Node root) {
		if (root != null) {

			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.println(root.getItem());

		}
	}

	/**
	 * This method returns the maximum of the two integers
	 * 
	 * @param n1
	 * 
	 * @param n2
	 * 
	 * @return integer
	 */
	public int max(int n1, int n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}

	/**
	 * This method calculates and return the height of binarry search tree
	 * 
	 * @param root as node
	 * 
	 * @return integer
	 */
	public int height(Node root) {
		if (root == null) {
			return -1;
		}
		return 1 + (max(height(root.getLeft()), height(root.getRight())));
	}

	/**
	 * This method search the element in binary search tree
	 * 
	 * @param root as node
	 * 
	 * @param item as integer data
	 * 
	 * @return item as integer
	 */
	public int search(Node root, int item) {
		if (root == null) {
			return -1;

		} else {
			if (root.getItem() == item) {
				return item;
			} else if (item < root.getItem()) {
				return (search(root.getLeft(), item));
			}
			return (search(root.getRight(), item));
		}

	}

	/**
	 * This method actually deletes the element from binary search tree
	 * 
	 * @param root as Node
	 * 
	 * @param item as integer data 
	 * 
	 * @return root as Node
	 */
	public Node delete(Node root, int item) {
		if (root == null)
			return root;

		if (item < root.getItem())
			root.setLeft(delete(root.getLeft(), item));
		else if (item > root.getItem())
			root.setRight(delete(root.getRight(), item));

		else {
			// covers both no child and one child case
			if (root.getLeft() == null)
				return root.getRight();
			else if (root.getRight() == null)
				return root.getLeft();

			// two child case...finding maximum value in left subtree of that
			// node and updating that node ...and deleting that max value node
			root.setItem(maxValue(root.getLeft()));
			root.setLeft(delete(root.getLeft(), root.getItem()));
		}

		return root;

	}

	/**
	 * This method calculates the maximum value in the binary search tree from
	 * that root(taken as input)
	 * 
	 * @param root as Node
	 * 
	 * @return maxvalue as integer
	 */
	public int maxValue(Node root) {
		int maxv = root.getItem();
		while (root.getRight() != null) {
			maxv = root.getRight().getItem();
			root = root.getRight();
		}
		return maxv;
	}

	/**
	 * This method prints the level order traversal of tree
	 */
	public void printLevelOrder() {
		int h = height(root);
		int i;
		for (i = 1; i <= h + 1; i++) {
			printGivenLevel(root, i);
			System.out.println("\n");
		}
	}

	/**
	 * This method prints the elements at given level
	 * 
	 * @param root as node
	 * @param level as int
	 */
	public void printGivenLevel(Node root, int level) {
		if (root != null) {
                if (level == 1) {
				System.out.print(root.getItem());
				}else if (level > 1) {
				printGivenLevel(root.getLeft(), level - 1);
				printGivenLevel(root.getRight(), level - 1);
				
			}
		}
	}
	/**
	 * This method prints the tree in 2D format
	 * @param root as Node
	 * @return
	 */
	 public void print2dTree(Node root) {
	        int height = getLevel(root);
	        int k=(int) Math.pow(2,height);
	        String[][] res = new String[height][k - 1];
	        for(String[] arr:res)
	            Arrays.fill(arr,"");
	        
	        fill(res, root, 0, 0, res[0].length);
	        for (int i = 0; i < res.length; i++){ 	 
	            for (int j = 0; j < res[i].length; j++)
	                System.out.print(res[i][j] + " ");
	            System.out.print("\n");
	        }
	    }
	 /**
	  * This method actually fills the 2D array in tree format 
	  * @param res as array
	  * @param root as Node
	  * @param levelNumber 
	  * @param firstIndex as first index of array
	  * @param lastIndex as last index of array
	  */
	    public void fill(String[][] res, Node root, int levelNumber, int firstIndex, int lastIndex) {
	        if (root == null)
	            return;
	        res[levelNumber][(firstIndex + lastIndex) / 2] = "" + root.getItem();
	        fill(res, root.getLeft(), levelNumber + 1, firstIndex, (firstIndex + lastIndex) / 2);
	        fill(res, root.getRight(), levelNumber + 1, (firstIndex + lastIndex + 1) / 2, lastIndex);
	    }
	   /**
	    * This function returns the current level of the node passed 
	    * @param root
	    * @return
	    */
	    public int getLevel(Node root) {
	        if (root == null)
	            return 0;
	        return 1 + Math.max(getLevel(root.getLeft()), getLevel(root.getRight()));
	    }

}
