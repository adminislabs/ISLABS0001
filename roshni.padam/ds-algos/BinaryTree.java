import java.util.Scanner;

//here i create a tree 
public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;		
			
		}
	
//   create a method to insert nodes 
	 void insert(int key) {
	       root = insertRec(root, key);
	 }
	   
	   // create a recursion to insert a node at a reqd position
	    Node insertRec(Node root, int key) {
	 
	       
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        
	        }
			
	    if (key<root.key)
	    {
            root.left = insertRec(root.left, key);
	    }
	    
	    else 
            root.right = insertRec(root.right, key);
	    return root;
			
			
	    }
	    
	    // method to traverse a binary tree
	         void inorder()  {
	         inorderRec(root);
	          }
	    
			 void inorderRec(Node root) {
			        if (root != null) {
			            inorderRec(root.left);
			            System.out.println(root.key);
			            inorderRec(root.right);
			        }
			 }
			        
			 
			 // method to find the height of the tree
			 int height(Node node) 
			    {
			        if (node == null)
			            return 0;
			        else 
			        {
			         
			            int lDepth = height(node.left);
			            int rDepth = height(node.right);
			 
			        
			            if (lDepth > rDepth)
			                return (lDepth + 1);
			             else 
			                return (rDepth + 1);
			        }
			    }
			     
			 
			 
			 
			        public static void main(String[] args) {
			        	 BinaryTree tree = new BinaryTree();
			        	while(true){
			           
			            System.out.println("want to create tree");
			            System.out.println("1.please add the nodes");
			            System.out.println("2.the inorder traversal");
			            System.out.println("3.height of tree");
			            System.out.println("4.exit");
			            Scanner sc=new Scanner(System.in);

			            int choice=sc.nextInt();
						switch(choice){
						case 1:
							System.out.println("Enter the element to be inserted");
							int item=sc.nextInt();
							tree.insert(item);
							break;
						case 2:
							tree.inorder();
							break;
						
			            case 3:
			            //	tree.height();
			            	break;
							
			            
						case 4:
							java.lang.System.exit(0);
						}
						
			            
			            
			            
			            
			            
			            
			            
			            
			            
			     
			        }}}

	
	


