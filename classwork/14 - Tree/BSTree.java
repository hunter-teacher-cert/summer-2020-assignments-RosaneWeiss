import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }

/* insert a value */
	public void insert(int key) {
		
		TreeNode newNode = new TreeNode(key);
		
		// empty tree, insert key(newNode)as the root
		if(root == null) {
			root = newNode;
			return;
		}
		
		TreeNode front = root;
		TreeNode trailer = root; 
		int frontValue = front.getData();
		
		while ( front != null) {
		/* search until fall off the tree 
		key = what is being searched
		front = value of the node on the tree
		trailre = value of the node it came from;
		*/
			
		if (frontValue == key){
			//the key is a duplicate , already in the tree
			return;
		} else { 
			if (key < frontValue) {
			// go left, update where it comes from(trailer)
			trailer = front;
			front = front.getLeft();
			
			} else {
				// go right,  update where it comes from(trailer)
				trailer = front;
				front = front.getRight();
				}
		}
		}
		// found point of insertion. inset
		if (key > trailer.getData()) {
			trailer.setRight(newNode);
		} else {
			trailer.setLeft(newNode);
		}
		return;
	
	}
		
		/* search for a value */
	public int search(int key) {
		TreeNode current = root;
		while ( current != null) {
		/* search until fall off the tree 
		key = what is being searched
		currentValue = value of the node on the tree
		*/
			int currentValue = current.getData();
		if (currentValue == key){
			//found
			return currentValue;
		} else { 
			if (key < currentValue) {
			// go left
			current = current.getLeft();
			
			} else {
				// go right
				current = current.getRight();
				}
		}
		}
		/* did not fint it */
		//return -1;
		throw new NullPointerException();
	
	}
		
    public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);
	
	}
    
    
}