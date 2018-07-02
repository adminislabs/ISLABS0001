package com.avltree;

/**
 * create node class and its attributes for Avl tree
 * @author roshni
 *
 */

public class Node {
	int key, height;
	Node left, right;

	Node(int d) {
		key = d;
		height = 1;
	}
}
