import java.io.*;
import java.util.*;


public class DriverDelete {
    public static void main(String[] args) {
	BSTree t = new BSTree();
	
	t.insert(10);
	t.insert(20);
	t.insert(5);
	t.insert(7);
	t.insert(8);
	t.insert(3);
	t.insert(25);
	t.preorderTraverse();
	
	t.delete(8); // leaf
	t.preorderTraverse();
	
	t.delete(20); // one child
	t.preorderTraverse();
	
	t.delete(17); // not in the tree
	t.preorderTraverse();
		
	t.delete(5); // 2 children
	t.preorderTraverse();
	
	}
}