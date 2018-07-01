package Tree.avl;

import learn.Node;

/**
 * here i create a AvlTree class where i implements its features 
 * by creating 2 functions insert a node and searching a node in the avl tree
 * @author rishab
 *
 */
public class AvlTree {
    private AvlNode root;     
    public AvlTree()
    {
        root = null;
    }
    public boolean isEmpty()
    {
        return root == null;
    }
    public void makeEmpty()
    {
        root = null;
    }

    /**
     * create  here a function to insert nodes in the avl tree
     * @param data
     */
  
    public void insert(int data)
    {
        root = insert(data, root);
    }

/**
 * create a function to calculate the height
 * @param t
 * @return
 */
    private int height(AvlNode t )
    {
        return t == null ? -1 : t.height;
    }
/**
 * here i find the maximum value between left and right
 * @param lhs
 * @param rhs
 * @return
 */
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;
    }

   /**
    * function to recursively add the nodes at a desired position of bst case 
    * and than follows balancing factor situation of avl and perform rotation cases
    * @param x
    * @param t
    * @return
    */
    private AvlNode insert(int x,AvlNode t)
    {
        if (t == null)
            t = new AvlNode(x);
        else if (x < t.data)
        {
            t.left = insert( x, t.left );
            if( height( t.left ) - height( t.right ) == 2 )
                if( x < t.left.data )
                    t = rotateWithLeftChild( t );
                else
                    t = doubleWithLeftChild( t );
        }
        else if( x > t.data )
        {
            t.right = insert( x, t.right );
            if( height( t.right ) - height( t.left ) == 2 )
                if( x > t.right.data)
                    t = rotateWithRightChild( t );
                else
                    t = doubleWithRightChild( t );
        }
        else
        t.height = max( height( t.left ), height( t.right ) ) + 1;
        return t;
    }
/**
 * cases of rotation the tree 
 * 
 * @param k2
 * @return
 */
/*
 * Rotate binary tree node with left child
 */
    private AvlNode rotateWithLeftChild(AvlNode k2)
    {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
        k1.height = max( height( k1.left ), k2.height ) + 1;
        return k1;
    }

    /* Rotate binary tree node with right child */
    private AvlNode rotateWithRightChild(AvlNode k1)
    {
        AvlNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
        k2.height = max( height( k2.right ), k1.height ) + 1;
        return k2;
    }
    /* Rotate the tree RL condition*/
    private AvlNode doubleWithLeftChild(AvlNode k3)
    {
        k3.left = rotateWithRightChild( k3.left );
        return rotateWithLeftChild( k3 );
    }
    /* Rotate the tree RL condition*/
    private AvlNode doubleWithRightChild(AvlNode k1)
    {
        k1.right = rotateWithLeftChild( k1.right );
        return rotateWithRightChild( k1 );
    }    

   /**
    * 
    * function to calculate the value is present in the avl tree or not
    * @param val
    * @return
    */
    public boolean search(int val)
    {
        return search(root, val);
    }
    private boolean search(AvlNode r, int value)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.data;
            if (value < rval)
                r = r.left;
            else if (value > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, value);
        }
        return found;
}
/**
 * this function traverse the tree in inOrder manner
 * 
 * @param root
 */
public void inorder(AvlNode root) {
	if (root != null) {

		inorder(root.getLeft());
		System.out.println(root.getValue());
		inorder(root.getRight());
	}
}
}


