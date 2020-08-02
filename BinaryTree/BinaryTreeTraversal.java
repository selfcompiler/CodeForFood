


/*


	There are three basic ways to travel Binary Tree 

	1. PreOrder 
			
			Visit Root , 
			Vist Left Child 
			Visit Right Child 

	2. InOrder 

			Visit Left Child 
			Visit Root 
			Visit Right Child 
	3. PostOrder 

			Visit Left Child 
			Visit Right Child 
			Visit Root 


*/



public static void traversalBinaryTreePreOrder(BinaryTreeNode<Integer> root){

	if(root!=null){


		System.out.println(root.data);

		traversalBinaryTree(root.left);

		traversalBinaryTree(root.right);

	}

}


public static void traversalBinaryTreeInOrder(BinaryTreeNode<Integer> root){

	if(root!=null){


		

		traversalBinaryTree(root.left);

			System.out.println(root.data);

		traversalBinaryTree(root.right);

	}

}


public static void traversalBinaryTreePostOrder(BinaryTreeNode<Integer> root){

	if(root!=null){


		traversalBinaryTree(root.left);

		traversalBinaryTree(root.right);

		System.out.println(root.data);

	}

}



