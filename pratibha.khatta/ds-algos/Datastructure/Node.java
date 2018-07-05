/**This class defines the node of AVLtree which has variable value ,height which finds height of the particular node and left,right node 
 *         stores the reference of left child and right child of the node.
 *        
 *
 * @author pratibha
 */
public class Node 
{
     private int value;
    private int height=1;
    private Node left;
    private Node right;
    public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
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
    
}
