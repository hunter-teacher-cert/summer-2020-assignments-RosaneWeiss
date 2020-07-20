import java.io.*;
import java.util.*;


public class DriverTraverse {
    public static void main(String[] args) {
	BSTree t = new BSTree();
	
	t.insert(10);
	t.traverse();
	t.insert(20);
	t.traverse();
	t.insert(5);
	t.traverse();
	t.insert(7);
	t.traverse();
	t.insert(8);
	t.traverse();
	t.insert(3);
	t.traverse();
	t.insert(25);
	
	t.traverse();
	}
}