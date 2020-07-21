import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }
	
	public void delete(int key){

	// if the tree is empty, nothing to delete
	if (root==null){
	    return;
	}
	
	/* find the node that we want to delete
	 and the node above it using piggybacking
		key = what is being deleted
		front = value of the node on the tree
		trailer = value of the node it came from;*/
		
	TreeNode front = root;
	TreeNode trailer = root;

	// do the piggyback loop
	// until we either find the node or null
	// if the key isn't present
	while (front != null && front.getData() != key ){
	    if (front.getData() < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }
	}

	// if the key wasn't in the tree
	if (front == null){
	    return;
	}

	// if we get here
	// front points to the node we want to delete
	// and trailer points to the one above it

	// case 1 -- the node we want to delete is a leaf(last one of the chain) - no children(both front are null)
	if (front.getLeft() == null &&
	    front.getRight() == null) {
	    // repoint front's parent to null
		//trailer.setData() = null;
		// could just set both to null, to make it easier?
		if (front.getLeft() == null){
			// key to delete is on the right side since the left is null
			trailer.setRight(null); 
		} else{
			// key to delete is on the left side since the right is null
			trailer.setLeft(null);
		} //end case 1
		
	}//	else {
		if ((front.getLeft() == null && front.getRight() != null) ||(front.getRight() == null && front.getLeft() != null)) {
		// case 2 -- the node we want to delete has one child  - only one side is null*/
	    // repoint front's parent to front's child
		
		if (front.getLeft() == null)   {
			// repoint front's parent to null
			// key to delete is on the right side since the left is null - bring the following trailer to this trailer
			
			trailer.setRight(front.getRight()); 
			} else{
			// key to delete is on the left side since the right is  -  the following trailer to this trailer
				trailer.setLeft(front.getLeft());
			}// end else
		} //end case 2 else {
		if (front.getLeft() != null &&  front.getRight() != null) {
		// case 3 -- the node we want to delete has two children
	     
			// find the node with the largest value on fronts left subtree
			// and replace front with it.
			//trailer = front;
			//front = front.getLeft();
			//while (trailer.getData(trailer) < front.getData(front) || trailer.getLeft() != null){ // compile error
			//	trailer = front;
			//	front = front.getRight();
			//  // end while
				// least amount found	
				// key to delete is on the left side since the right is  -  the following trailer to this trailer
			//	trailer.setLeft(front.getLeft());
		} //end case 3
	}  // end delete
	
	
    	 
    private void preorderTraverse(TreeNode current){
	if (current == null)
	    return;

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the left subtree
	preorderTraverse(current.getLeft());

	// recursively print out the right subtree
	preorderTraverse(current.getRight());
    }

    public void preorderTraverse(){
	preorderTraverse(root);
	System.out.println();
    }

    private void postorderTraverse(TreeNode current){
	if (current == null)
	    return;

	// recursively print out the left subtree
	postorderTraverse(current.getLeft());

	// recursively print out the right subtree
	postorderTraverse(current.getRight());

	//process the current node
	System.out.print(current.getData()+", ");



    }

    public void postorderTraverse(){
	postorderTraverse(root);
	System.out.println();
    }

    private void inorderTraverse(TreeNode current){
	if (current == null)
	    return;


	// recursively print out the left subtree
	inorderTraverse(current.getLeft());

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the right subtree
	inorderTraverse(current.getRight());
    }

    public void inorderTraverse(){
	inorderTraverse(root);
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
		trailer = value of the node it came from;
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

/* private void traverse(TreeNode current){
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
	*/