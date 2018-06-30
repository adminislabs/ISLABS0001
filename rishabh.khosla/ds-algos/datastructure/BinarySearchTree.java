package learn;

/**
 * The program BinarySearchTree is created to add data in a non linear manner
 * here first create class of BinarySearchTree having its functionality features
 * 
 * @author rishab
 *
 */
public class BinarySearchTree {
	// Root of BST
	private Node root;

	// Constructor
	BinarySearchTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * here insert function is created to add nodes in the binary search tree
	 * 
	 * @param data
	 * @param root
	 * @return
	 */
	public Node insert(Node root, int item) {
		if (root == null) {
			root = new Node(item);
			root.setValue(item);

		} else if (item < root.getValue()) {
			root.setLeft(insert(root.getLeft(), item));

		} else {
			root.setRight(insert(root.getRight(), item));

		}
		return root;
	}

	/**
	 * this function calculates the height of the tree from the root of the tree
	 * 
	 * @param root
	 * @return
	 */
	int height(Node root) {
		if (root == null)
			return 0;
		else {

			int lDepth = height(root.getLeft());
			int rDepth = height(root.getRight());

			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	/**
	 * This function calculate the minimum node value of a tree
	 * 
	 * @param root
	 * @return
	 */
	public Node findMin(Node root) {
		if (root == null)
			return null;
		else if (root.getLeft() == null) {
			return root;
		}
		return findMin(root.getLeft());
	}

	/**
	 * This function calculate the maximum node value of a tree
	 * 
	 * @param root
	 * @return
	 */
	public Node findMax(Node root) {
		if (root == null)
			return null;
		else if (root.getRight() == null)
			return root;
		else
			return findMax(root.getRight());

	}

	/**
	 * this function delete the desired node u want to delete from the tree
	 * 
	 * @param root
	 * @param value
	 * @return
	 */
	public Node delete(Node root, int value) {
		if (root == null)
			return root;

		if (value < root.getValue())
			root.setLeft(delete(root.getLeft(), value));
		else if (value > root.getValue())
			root.setRight(delete(root.getRight(), value));

		else {

			if (root.getLeft() == null)
				root = root.getRight();
			else if (root.getRight() == null)
				root = root.getLeft();
			root.setValue(findMin(root.getLeft()));
			root.setLeft(delete(root.getLeft(), root.getValue()));
		}
		return root;
	}
	/**
	 * this function search for the value present in the tree
	 * 
	 * @param key
	 * @param root
	 * @return
	 */
	public Node search(int key, Node root) {
		Node current = root;
		if (key == root.getValue())
			return current;
		while (key != current.getValue()) {
			if (key < root.getValue()) {
				current = current.getLeft();

			} else {
				current = current.getRight();
			}
			if (current == null)
				return null;

		}
		return current;
	
	}

	/**
	 * this function traverse the tree in inOrder manner
	 * 
	 * @param root
	 */
	public void inorder(Node root) {
		if (root != null) {

			inorder(root.getLeft());
			System.out.println(root.getValue());
			inorder(root.getRight());
		}
	}
	/**
	 * this function traverse the tree in preOrder manner
	 * 
	 * @param root
	 */

	public void preorder(Node root) {
		if (root != null) {

			System.out.println(root.getValue());
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}
	/**
	 * this function traverse the tree in postOrder manner
	 * 
	 * @param root
	 */
	public void postorder(Node root) {
		if (root != null) {
			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.println(root.getValue());
		}
	}
}
