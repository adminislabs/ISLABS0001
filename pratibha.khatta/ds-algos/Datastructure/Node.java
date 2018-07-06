/**This node class contain variable data which stores value and left,right node 
 * stores the reference of left child and right child of the node.
 *
 * @author pratibha
 */
public class Node 
{ 
	private int data;
	private Node left,right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}

}