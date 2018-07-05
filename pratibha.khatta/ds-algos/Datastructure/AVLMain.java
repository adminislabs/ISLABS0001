import java.util.LinkedList;
import java.util.Queue;
/**This class contains implementation of various methods such as insertion,deletion,searching,
 * preorder,postorder,inorder traversal of the AVL Tree
 * @author pratibha
 *
 */

public class AVLMain 
{
 
	private Node root;
	
	public Node getRoot()
	{
		return root;
	}

	public void setRoot(Node root) 
	{
		this.root = root;
	}
	public int height(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		return n.getHeight();
	}
	/** This function is used for performing right rotation 
	 * 
	 * 
	 * @param root
	 * @return node
	 */
	public Node rightRotate(Node root)
	{
		//Intialising the left and right child to the variables
		Node node = root.getLeft();
		Node secondnode = node.getRight();
		// Performing rotation 
		node.setRight(root);
		root.setLeft(secondnode);
		//Update the height of the tree
		root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
		node.setHeight(max(height(node.getLeft()),
				height(node.getRight())) + 1);
		return node;
	}
	/** This function is used for performing left rotation 
	 * 
	 * 
	 * @param root
	 * @return node
	 */
	public Node leftRotate(Node root) {
		//Intialising the right and left child to the variables
		Node node = root.getRight();
		Node secondnode = node.getLeft();
		//Performing Rotation
		node.setLeft(root);
		root.setRight(secondnode);
		//Update the height of tree
		root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);
		node.setHeight(max(height(node.getLeft()),
				height(node.getRight())) + 1);
		return node;
	}
    /** This function is used for finding balance factor of node n
     * 
     * @param n
     * @return difference between the height of right node from left node 
     */
	public int balance (Node n){
		if(n==null)
			return 0;
		return height(n.getLeft()) - height(n.getRight());
	}
	public Node insertNode(Node root,int value)
	{
		if(root==null)
		{
			root=new Node();
			root.setValue(value);
		}
		if(value<root.getValue())
			root.setLeft(insertNode(root.getLeft(),value));
		else if(value>root.getValue())
			root.setRight(insertNode(root.getRight(),value));
		
		root.setHeight(1 + max(height(root.getLeft()), height(root.getRight())));

		int gotbalance=balance(root);
		if(gotbalance>1 &&value<root.getLeft().getValue())
			root=rightRotate(root);
		if(gotbalance<-1 &&value>root.getRight().getValue())
			root=leftRotate(root);
		if(gotbalance>1 &&value>root.getLeft().getValue())
		{
			root.setLeft(leftRotate(root.getLeft()));
			root=rightRotate(root);
		}
		if(gotbalance <-1 && value<root.getRight().getValue()){
			root.setRight(rightRotate(root.getRight()));
		    root = leftRotate(root);
		}
		return root;
	}
	/** Function to find the maximum of two numbers
	 * 
	 * @param number1
	 * @param number2
	 * @return number1 and number2 in respective cases
	 */
	public int max(int number1,int number2)
	{
		if(number1>number2)
		{
			return number1;
		}
		return number2;
	}
	/**Function to search the element
	 * 
	 * @param root
	 * @param value
	 * @return
	 */
	public int searchNode(Node root ,int value)
	{
		if(root==null)
		{
			return 0;
		}
		else if(value<root.getValue())
		{
			return searchNode(root.getLeft(),value);
		}
		else if(value>root.getValue())
		{
			return searchNode(root.getRight(),value);
		}
		else
		{
			return root.getValue();
		}
		
	}
	public Node deleteNode(Node root, int value) {
		if (root == null) { // base case ...actually deletes the node
			return root;
		}

		if (value < root.getValue())
			root.setLeft(deleteNode(root.getLeft(), value));
		else if (value > root.getValue())
			root.setRight(deleteNode(root.getRight(),value));

		else { // covers both no child and one child case
			if (root.getLeft() == null)
				return root.getRight();
			else if (root.getRight() == null)
				return root.getLeft();
			// two child case..calculating max value from its left sutree
			// and updating it..and deleting that particular node
			root.setValue(maxValue(root.getLeft()));
			root.setLeft(deleteNode(root.getLeft(), root.getValue()));
		}
		// updating height
		root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);

		// getting balance factor of that node
		int gotbalance = balance(root);

		// left left imbalance
		if (gotbalance > 1 && balance(root.getLeft()) >= 0)
			root = rightRotate(root);

		// left right imbalance
		if (gotbalance > 1 && balance(root.getLeft()) < 0) {
			root.setLeft(leftRotate(root.getLeft()));
			root = rightRotate(root);
		}

		// right right imbalance
		if (gotbalance < -1 && balance(root.getRight()) <= 0)
			root = leftRotate(root);

		// right left imbalance
		if (gotbalance < -1 && balance(root.getRight()) > 0) {

			root.setRight(rightRotate(root.getRight()));
			root = leftRotate(root);
		}
	

		return root;
	}
	public int maxValue(Node root) {
		int maxvalue = root.getValue();
		while (root.getRight() != null) {
			maxvalue = root.getRight().getValue();
			root = root.getRight();
		}
		return maxvalue;
	}
	/** Function for the preorder traversal of AVL Tree
	 * 
	 * 
	 * @param root
	 */
	public void preorder(Node root)
	{
		if (root != null) {
			System.out.print(root.getValue() + " ");
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}
	/** Function for the inorder traversal of AVL tree
	 * 
	 * 
	 * @param root
	 */
	public void inorder(Node root)
	{
		if (root != null) {

			inorder(root.getLeft());
			System.out.print(root.getValue() + " ");
			inorder(root.getRight());

		}
	}
	/** Function for the postorder traversal of AVL Tree
	 * 
	 * 
	 * @param root
	 */
	public void postorder(Node root)
	{
            if (root != null) {

			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.print(root.getValue() + " ");

	}
        }
        public void printTree(Node root){
 		Queue q = new LinkedList();
 		int levelNodes =0; 
		if(root==null) return;
 		q.add(root);
 		while(!q.isEmpty()){
 			levelNodes = q.size();
 			while(levelNodes>0){
				Node n = (Node)q.remove();
				System.out.print(" " + n.getValue());
				if(n.getLeft()!=null) q.add(n.getLeft());
				if(n.getRight()!=null) q.add(n.getRight());
				levelNodes--;
			}
			System.out.println("");
		}
        }
}


