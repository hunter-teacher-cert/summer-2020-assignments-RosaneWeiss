import java.io.*;
import java.util.*;


public class LList{
    private Node head;

    public LList(){
	head = null;
    }

    public void addFront(String data){
	Node newnode = new Node(data);

	// first point the new node to the beginning
	newnode.setNext(head);

	// point head to the new node
	head = newnode;

    }

    public String toString(){
	String s = "";

	Node tmp;
	tmp = head;
	while (tmp != null){
	    s = s + tmp.getData()+"-->";
	    // how can we now move tmp to the next node
	    // this is the magic linked list idiom!!!!
	    // this moves a pointer to the next node!!!
	    // It's analagous to i=i+1 for an array (for loop)
	    tmp = tmp.getNext();
	}

	s = s + "null";
	return s;
    }

    public int length(){
	int l = 0;

	Node tmp;
	tmp = head;
	while (tmp != null){

	    l = l + 1;

	    // how can we now move tmp to the next node
	    // this is the magic linked list idiom!!!!
	    // this moves a pointer to the next node!!!
	    // It's analagous to i=i+1 for an array (for loop)
	    tmp = tmp.getNext();
	}

	return l;
    }
	
 public boolean isEmpty(){
	 if (head == null){
		 return true;
	 } else {
		 return false;
	} // end if
	// return  (head == null);
 }
 
 public String get(int index) {
		/*Returns the value (not the Node) at index.
		If index is out of bounds, return null. */
		// get the head //
		
		int position = 0;
		Node currNode;
		currNode = head;
		
		// loop until find the index //	
	while (position < index  && currNode.getNext() != null ){
		
			currNode = currNode.getNext();
			position = position + 1;
			
	} //end while
	
// send back the value //
	
	 if (currNode.getNext() == null) {
			return "null";
	} else{
		return currNode.getData();
	}
 }
 
 public void set(int index, String value){
/*Set the Node at index to contain value
If index is invalid, do nothing.*/
 	int position = 0;
		Node currNode;
		currNode = head;
		
		// loop until find the index //	
	while (position < index  && currNode.getNext() != null ){
			currNode = currNode.getNext();
			position = position + 1;
	} //end while
	
// send back the value //
	
	 if (currNode.getNext() != null) {
		 currNode.setData(value);
	}
}
 /* ________________  */
   public void insert(int index, String value){
	// make new node, add the value there already
		Node newNode = new Node(value);
		// make a tmp node
		int position = 0;
		Node currNode = head;
		
	if( index == 0){
		addFront(value); // adds a new head
	} else {
	// move temp down the list until it's right BEFORE the insertion point
		while (position < (index - 1)  && currNode.getNext() != null ){
			currNode = currNode.getNext();
			position = position + 1;
			
		} //end while
	
	// insert 
	/*find where the new node will be linked to - 
	the new inserted node will have the "next" of the current one */
	System.out.println("pos" + position + " index " + index + " " + currNode.getNext()); 
	if (currNode.getNext() == null && (index -1) > position){
		System.out.printf("insert(%d, \"%s\") index out of bounds\n", index, value);
	} else { 
		newNode.setNext(currNode.getNext());
	// set the new value for it
		// link the new node to the one from the behind (currnode)
		currNode.setNext(newNode);
		} // endif
	} //end index==0
    }

    public void remove(int index){
	// make a tmp node
	// move tmp down the list until it's BEFORE the node we want to delete
	// change tmp's next pointer to skip the node we are deletin 
    if (index == 0) {
		//removing the first?
			head = head.getNext();
			
		} else {
		int position = 0;
		Node currNode = head;	
		while (position < (index - 1)  && currNode.getNext() != null ){
			currNode = currNode.getNext();
			position = position + 1;
			
		} //end while
		/* now you are at the index you want to remove, 
			skip it by getting the "next" of the second one */
		if (currNode.getNext() == null && (index -1) > position) {
			System.out.printf("remove(%d) index does not exist\n", index);
		} else {	
			currNode.setNext(currNode.getNext().getNext());
		}	// endiff
		
		} // end if ind = 0
	}  
	
	
			
    public int search(String key) {
		Node currNode = head;
		int position = 0;
		while (currNode.getNext() != null ){
				if (key.equals(currNode.getData())) {
				return position;
			}
			currNode = currNode.getNext();
			position = position + 1;
		} // end while
		// is the last one the search you want?
		if (key.equals(currNode.getData())) {
				return position;
		} else {
		return -1;
		}
		
	}
}