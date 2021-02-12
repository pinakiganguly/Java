package Pinaki;
import java.util.Scanner;
public class binarysearch_tree {
	class Node { 
		int key;
		Node left, right;
		public Node(int item) { 
			key = item; 
			left = right = null; 
			}
		}
	// Root of BST 
	Node root; 
	// Constructor 
	binarysearch_tree() {
	root = null; 
	}
	// This method mainly calls insertRec() 
	void insert(int key)
	{ 
		root = insertRec(root, key); 
	}
	/* A recursive function to insert a new key in BST */ 
	Node insertRec(Node root, int key) {
		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root; 
			}
		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key); else if (key > root.key) root.right = insertRec(root.right, key);
	/* return the (unchanged) node pointer */
		return root;
		} 
	// This method mainly calls InorderRec() 
	void inorder() { 
		inorderRec(root); 
		}
	// A utility function to do inorder traversal of BST 
	void inorderRec(Node root) { 
		if (root != null) { 
			inorderRec(root.left);
			System.out.print(" "+root.key); 
			inorderRec(root.right); 
			}
		} // This method mainly calls preorderRec()
	void preorder() { preorderRec(root); 
	} 
	// A utility function to do preorder traversal of BST 
	void preorderRec(Node root) { 
		if (root != null) {
			System.out.print(" "+root.key);
			preorderRec(root.left); 
			preorderRec(root.right); 
			}
		}
	// This method mainly calls postorderRec() 
	void postorder() {
		postorderRec(root); 
		}
	// A utility function to do postorder traversal of BST
	void postorderRec(Node root) { 
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right); 
			System.out.print(" "+root.key);
			}
		}


public static void main(String[] args) { 
	binarysearch_tree tree = new binarysearch_tree();
	Scanner sc=new Scanner(System.in);
	int i,n;
	int x;
	boolean flag=true;
	while(flag)
{ 
	System.out.println("");
	System.out.println("Press 1 for create the tree=");
	System.out.println("Press 2 for preorder traversal=");
	System.out.println("Press 3 for inorder traversal=");
	System.out.println("Press 4 for postorder traversal=");
	System.out.println("Press 5 for exit=");
	System.out.print("Enter your choice=");
	i=sc.nextInt(); 
	switch(i) {
				case 1: 
					System.out.print("Enter the number of elements=");
				n=sc.nextInt(); 
				for(int j=0;j<n;j++) {
					System.out.print("Enter "+(j+1)+" element=");
					x=sc.nextInt(); 
					tree.insert(x); 
			  }
			  break;
				case 2: 
					tree.preorder(); 
				break;
				case 3:
					tree.inorder();
				break; 
				case 4: 
					tree.postorder();
				break; 
				default:
					flag=false;
	}
}
	/* tree.insert(50); tree.insert(30); tree.insert(20); tree.insert(40); tree.insert(70); tree.insert(60);
tree.insert(80);
*/ 
}
}
