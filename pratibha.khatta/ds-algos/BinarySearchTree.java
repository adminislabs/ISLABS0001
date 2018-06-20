
public class BinarySearchTree 
{
          class Node 
          {
        	  int value;
        	  Node left,right;
        	  public Node(int item)
        	  {
        		  value=item;
        		  left=right=null;
        	  }
          }
          static Node root;
          BinarySearchTree()
          {
        	  root=null;
          }
          void insert(int value)
          {
        	  root=dataInsert(root,value);
        			 
          }
		 Node dataInsert(Node root, int value)
		 {
			if(root ==null)
			{
				root=new Node(value);
				return root;
			}
			if(value<root.value)
				root.left=dataInsert(root.left,value);
			else if (value>root.value)
				root.right=dataInsert(root.right,value);
			return root;
			
		}
		 void inorder()
		 {
			 inorderTree( root);
		 }
		 void inorderTree(Node root)
			 {
				 if(root!=null)
				 {
					 inorderTree(root.left);
					 System.out.println(root.value);
					 inorderTree(root.right);
				 }
			 }
		 int height(Node root) 
		    {
		        if (root == null)
		            return 0;
		        else
		        {
		            
		            int lDepth = height(root.left);
		            int rDepth = height(root.right);
		  
		         
		            if (lDepth > rDepth)
		                return (lDepth + 1);
		             else
		                return (rDepth + 1);
		        }
		    }
		  
		 
		 
public static void main(String args[])
{
	BinarySearchTree obj=new BinarySearchTree();
	obj.insert(100);
	obj.insert(50);
	obj.insert(150);
	obj.insert(200);
	obj.insert(25);
	obj.inorder();
	System.out.println("Height of binary search Tree" + obj.height(root));
}
}
