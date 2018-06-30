package Avltree;

/**
 * 
 * @author sahil This class basically has functionalities of avl tree such as
 *         insertion, deletion search....and also it has rotate functions which
 *         helps in maintaining balancing factor of every node in the tree
 */
public class AVLTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * This method is used when there is left left imbalance ...as it rotates
	 * that imbalance node in right direction (clockwise direction)
	 * 
	 * @param root
	 * 
	 * @return newRoot asNode
	 */
	public Node rightRotate(Node root) {
		Node newRoot = root.getLeft();
		Node T2 = newRoot.getRight();
		newRoot.setRight(root);
		root.setLeft(T2);
		root.setLevel(max(level(root.getLeft()), level(root.getRight())) + 1);
		newRoot.setLevel(max(level(newRoot.getLeft()),
				level(newRoot.getRight())) + 1);
		return newRoot;
	}

	/**
	 * This method is used when there is right right imbalance ...as it rotates
	 * that imbalance node in left direction (anticlockwise direction)
	 * 
	 * @param rootas Node
	 * 
	 * @return newRoot as Node
	 */
	public Node leftRotate(Node root) {
		Node newRoot = root.getRight();
		Node T2 = newRoot.getLeft();
		newRoot.setLeft(root);
		root.setRight(T2);
		root.setLevel(max(level(root.getLeft()), level(root.getRight())) + 1);
		newRoot.setLevel(max(level(newRoot.getLeft()),
				level(newRoot.getRight())) + 1);
		return newRoot;
	}

	/**
	 * This method calculate the balance factor of the particular node
	 * 
	 * @param N as Node 
	 * 
	 * @return balance factor as integer
	 */
	public int getBalance(Node N) {
		if (N == null)
			return 0;

		return level(N.getLeft()) - level(N.getRight());
	}

	/**
	 * This method first insert the key at the particular position following
	 * binary search tree property...and then it checks and solves the
	 * imbalancing from point of insertion to the root node moving upwards
	 * 
	 * @param root as nOde
	 * 
	 * @param key as data in integer
	 * 
	 * @return Node
	 */
	public Node insert(Node root, int key) {

		if (root == null) {
			root = new Node();
			root.setKey(key);

		}

		if (key < root.getKey())
			root.setLeft(insert(root.getLeft(), key));
		else if (key > root.getKey())
			root.setRight(insert(root.getRight(), key));

		// updating level
		root.setLevel(1 + max(level(root.getLeft()), level(root.getRight())));

		// getting balance factor of that node
		int balance = getBalance(root);
		// left left imbalance
		if (balance > 1 && key < root.getLeft().getKey())
			root = rightRotate(root);

		// right right imbalance
		if (balance < -1 && key > root.getRight().getKey())
			root = leftRotate(root);

		// left right imbalance
		if (balance > 1 && key > root.getLeft().getKey()) {
			root.setLeft(leftRotate(root.getLeft()));
			root = rightRotate(root);

		}
		// right left imbalance
		if (balance < -1 && key < root.getRight().getKey()) {
			root.setRight(rightRotate(root.getRight()));
			root = leftRotate(root);

		}

		return root;
	}

	/**
	 * This method calculates the height of particular node
	 * 
	 * @param temp as Node whose level to be found
	 * 
	 * @return level of that node as integer
	 */
	public int level(Node temp) {
		if (temp == null) {
			return 0;
		}

		return temp.getLevel();
	}

	/**
	 * This method calculates the maximum of two numbers
	 * 
	 * @param n1
	 * 
	 * @param n2
	 * 
	 * @return maximum of two as int
	 */
	public int max(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		return n2;
	}

	/**
	 * This method prints the preorder traversal of the tree
	 * 
	 * @param root
	 * 
	 */
	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.getKey() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	/**
	 * This method traverse the tree in inorder
	 * 
	 * @param root
	 */
	public void inorder(Node root) {
		if (root != null) {

			inorder(root.getLeft());
			System.out.print(root.getKey() + " ");
			inorder(root.getRight());

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
			System.out.print(root.getKey() + " ");

		}
	}

	/**
	 * This method search the element in Avl tree
	 * 
	 * @param root as Node
	 * @param item as data to be searched
	 * @return item if found
	 */
	public int search(Node root, int item) {
		if (root == null) {
			return 01;

		}
		if (root.getKey() == item) {
			return item;
		} else if (item < root.getKey()) {
			return (search(root.getLeft(), item));
		}
		return (search(root.getRight(), item));

	}

	/**
	 * This method first deletes the element following binary search tree
	 * property ...and then it checks and solves the imbalancing from that
	 * particular node to root moving upwards
	 * 
	 * @param root as Node
	 * @param item as data to be deleted
	 * @return
	 */
	public Node delete(Node root, int item) {
		if (root == null) { // base case ...actually deletes the node
			return root;
		}

		if (item < root.getKey())
			root.setLeft(delete(root.getLeft(), item));
		else if (item > root.getKey())
			root.setRight(delete(root.getRight(), item));

		else { // covers both no child and one child case
			if (root.getLeft() == null)
				return root.getRight();
			else if (root.getRight() == null)
				return root.getLeft();
			// two child case..calculating max value from its left sutree
			// and updating it..and deleting that particular node
			root.setKey(maxValue(root.getLeft()));
			root.setLeft(delete(root.getLeft(), root.getKey()));
		}
		// updating height
		root.setLevel(max(level(root.getLeft()), level(root.getRight())) + 1);

		// getting balance factor of that node
		int balance = getBalance(root);

		// left left imbalance
		if (balance > 1 && getBalance(root.getLeft()) >= 0)
			root = rightRotate(root);

		// left right imbalance
		if (balance > 1 && getBalance(root.getLeft()) < 0) {
			root.setLeft(leftRotate(root.getLeft()));
			root = rightRotate(root);
		}

		// right right imbalance
		if (balance < -1 && getBalance(root.getRight()) <= 0)
			root = leftRotate(root);

		// right left imbalance
		if (balance < -1 && getBalance(root.getRight()) > 0) {

			root.setRight(rightRotate(root.getRight()));
			root = leftRotate(root);
		}

		return root;

	}

	/**
	 * This method calculates the maximum value in the tree from that node(taken
	 * as input)
	 * 
	 * @param root as Node
	 * @return maxvalue in the tree from that particular node
	 */
	public int maxValue(Node root) {
		int maxv = root.getKey();
		while (root.getRight() != null) {
			maxv = root.getRight().getKey();
			root = root.getRight();
		}
		return maxv;
	}
}
