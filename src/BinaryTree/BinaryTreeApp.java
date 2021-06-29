package BinaryTree;

public class BinaryTreeApp {

	public static void main(String[] args) {
		System.out.println("Soal No 3 (Binary Tree)" + "\n");
		BinaryTree tree = new BinaryTree();
		TreeNode node;
		
		node = new TreeNode(60);
		tree.insert(node);
		
		node = new TreeNode(40);
		tree.insert(node);
		
		node = new TreeNode(30);
		tree.insert(node);
		
		node = new TreeNode(50);
		tree.insert(node);
		
		node = new TreeNode(80);
		tree.insert(node);
		
		System.out.println("\nTraversal dengan InOrder : ");
		tree.InOrder();
		System.out.println("\nTraversal dengan PreOrder : ");
		tree.PreOrder();
		System.out.println( "\nTraversal dengan PostOrder : ");
		tree.PostOrder();
		System.out.println("\n");
		tree.address();
	}

}
