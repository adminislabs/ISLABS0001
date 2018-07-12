package com.learn;
/**
 * @author rishab
 * here i create a AvlTree class where i implements its features 
 * by creating 2 functions insert a node and searching a node in the avlTree
 *
 */
class AvlTree{
private AvlNode root;
public AvlNode getRoot() {
	return root;
}
public void setRoot(AvlNode root) {
	this.root = root;
}
/**
 * balancing the tree by doing rotation in
 * right or clockwise direction
 * @param root
 * @return
 */
public AvlNode rightRotate(AvlNode root) {
	AvlNode newRoot = root.getLeft();
	AvlNode T2 = newRoot.getRight();
	newRoot.setRight(root);
	root.setLeft(T2);
	root.setHeight(max(height(root.getLeft()),height(root.getRight())) + 1);
	newRoot.setHeight(max(height(newRoot.getLeft()),height(newRoot.getRight())) + 1);
	return newRoot;
}
/**
 * balancing the tree by doing rotation in
 * left or antiClockwise direction
 * @param root
 * @return
 */
public AvlNode leftRotate(AvlNode root) {
	AvlNode newRoot = root.getRight();
	AvlNode T2 = newRoot.getLeft();
	newRoot.setLeft(root);
	root.setRight(T2);
	root.setHeight(max(height(root.getLeft()),height(root.getRight())) + 1);
	newRoot.setHeight(max(height(newRoot.getLeft()),height(newRoot.getRight())) + 1);
	return newRoot;
}

/**
 * This method calculate the balance factor of the particular node
 * 
 * @param N as Node 
 * 
 * @return balance factor as integer
 */
public int getBalance(AvlNode N) {
	if (N == null)
		return 0;
	return height(N.getLeft()) - height(N.getRight());
}

/**
 * 
 * function to recursively add the nodes at a desired position of bst case 
 * and than follows balancing factor situation of avl and perform rotation cases
 * @param root
 * @return
 */
public AvlNode insert(AvlNode root, int key) {

	if (root == null) {
		root = new AvlNode();
		root.setData(key);

	}

	if (key < root.getData())
		root.setLeft(insert(root.getLeft(), key));
	else if (key > root.getData())
		root.setRight(insert(root.getRight(), key));

	// updating level
	root.setHeight(key);

	// getting balance factor of that node
	int balance = getBalance(root);
	// left left imbalance
	if (balance > 1 && key < root.getLeft().getData())
		root = rightRotate(root);

	// right right imbalance
	if (balance < -1 && key > root.getRight().getData())
		root = leftRotate(root);

	// left right imbalance
	if (balance > 1 && key > root.getLeft().getData()) {
		root.setLeft(leftRotate(root.getLeft()));
		root = rightRotate(root);

	}
	// right left imbalance
	if (balance < -1 && key < root.getRight().getData()) {
		root.setRight(rightRotate(root.getRight()));
		root = leftRotate(root);
	}
	return root;
}

/**
 * This method calculates the height of particular node
 * 
 * @param 
 * 
 * @return
 */
public int height(AvlNode temp) {
	if (temp == null) {
		return 0;
	}
	return temp.getHeight();
}

/**
 * This method calculates the maximum of two numbers
 * 
 * @param n1
 * 
 * @param n2
 * 
 * @return maximum of two as integer
 */
public int max(int n1, int n2) {
	if (n1 > n2) {
		return n1;
	}
	return n2;
}

/**
 * This method prints the tree in preOrder manner
 * 
 * @param root
 * 
 */
public void preorder(AvlNode root) {
	if (root != null) {
		System.out.print(root.getData()+ " ");
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
		System.out.print(root.getData() + " ");
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
		System.out.print(root.getData() + " ");
	}
}
/**
 * This method search the element in AvlTree
 * 
 * @param root as Node
 * @param item as data to be searched
 * @return item if found
 */
public int search(AvlNode root, int item) {
	if (root == null) {
		return 01;

	}
	if (root.getData()== item) {
		return item;
	} else if (item < root.getHeight()) {
		return (search(root.getLeft(), item));
	}
	return (search(root.getRight(), item));
}
/**
 * This method returns the maximum value present in our tree
 * @param root
 * @return
 */
public int maxValue(AvlNode root) {
	int maxv = root.getData();
	while (root.getRight() != null) {
		maxv = root.getRight().getData();
		root = root.getRight();
	}
	return maxv;
}
/**
 * This method returns the minimum value present in our tree
 * @param root
 * @return
 */
public int minValue(AvlNode root) {
	int minv = root.getData();
	while (root.getLeft() != null) {
		minv = root.getLeft().getData();
		root = root.getLeft();
	}
	return minv;
}
/**
 * this method print the avl tree in 
 * level order of node
 * @param root
 * @param level
 */

void printGivenLevel (AvlNode root ,int height)
{
    if (root == null)
        return;
    if (height == 1)
        System.out.print(root.getData()+ " ");
    else if (height > 1)
   
        printGivenLevel(root.getLeft(),height-1);
        printGivenLevel(root.getRight(),height-1);
    }
}

