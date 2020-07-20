import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }
	private void traverse(TreeNode current){
	if (current == null){
		return;}
	
	//process the current node
	System.out.print(current.getData()+", ");
	
	// recursively print out the left subtree
	//System.out.println("to the left "+ current.getData());
	traverse(current.getLeft());
	
	// recursively print out the right subtree
	//System.out.println("to the right " + current.getData());
	traverse(current.getRight());

    }
	
	
	public void traverse(){
	traverse(root);
	System.out.println();
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
		
		
		while ( front != null) {
		/* search until fall off the tree 
		key = what is being searched
		front = value of the node on the tree
		trailre = value of the node it came from;
		*/
		int frontValue = front.getData();	
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
		// found point of insertion. insert
		//System.out.println(key+ " " +trailer.getData());
		if (key > trailer.getData()) {
			trailer.setRight(newNode);
		} else {
			trailer.setLeft(newNode);
		}
		
	
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