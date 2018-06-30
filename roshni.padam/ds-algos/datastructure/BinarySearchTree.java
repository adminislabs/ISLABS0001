package learn;

import learn.Node;
/**
 * create class binary search tree with attribute Root
 * 
 * @author roshni
 *
 */

public class BinarySearchTree {
	private Node root;

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
	 * To insert new node in binary search tree
	 * 
	 * @param root
	 * @param item
	 * @return
	 */

	public Node insert(Node root, int Key) {
		if (root == null) {
			root = new Node(Key);
			root.setKey(Key);

		} else if (Key < root.getKey()) {
			root.setLeft(insert(root.getLeft(), Key));

		} else {
			root.setRight(insert(root.getRight(), Key));

		}
		return root;
	}
	/**
	 * To find the minimum node value
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
	 * To find maximum node value
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
	 * To traverse the tree in in order
	 *
	 * @param root
	 */
	public void inorder(Node root) {
		if (root != null) {

			inorder(root.getLeft());
			System.out.println(root.getKey());
			inorder(root.getRight());

		}

	}

	/**
	 * To traverse the tree in pre order
	 *
	 * @param root
	 */

	public void preorder(Node root) {
		if (root != null) {

			System.out.println(root.getKey());
			preorder(root.getLeft());
			preorder(root.getRight());

		}
	}

	/**
	 * To traverse the tree in post order
	 *
	 * @param root
	 */
	public void postorder(Node root) {
		if (root != null) {

			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.println(root.getKey());

		}
	}

	/**
	 * to delete the node
	 * 
	 * @param root
	 * @param value
	 * @return
	 */
	public Node delete(Node root, int Key) {
		if (root == null)
			return root;

		if (Key < root.getKey())
			root.setLeft(delete(root.getLeft(), Key));
		else if (Key > root.getKey())
			root.setRight(delete(root.getRight(), Key));

		else {
			
			if (root.getLeft() == null)
				root = root.getRight();
			else if (root.getRight() == null)
				root = root.getLeft();

			
			root.setKey(findMin(root.getLeft()));
			root.setLeft(delete(root.getLeft(), root.getKey()));
		}

		return root;
	}
	/**
	 * to find the height of tree from the base node
	 * @param root
	 * @return
	 */

	int height(Node root)
	{
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

}
