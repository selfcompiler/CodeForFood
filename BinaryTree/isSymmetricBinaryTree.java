

public static boolean isSymmetricBinaryTree(BinaryTreeNode<Integer> tree){

	return tree==null || checkSymmetric(tree.left,tree.right);

}


private boolean checkSymmetric(BinaryTreeNode<Integer> subTree1,BinaryTreeNode<Integer> subTree2){


	if(subTree1==null && subTree2==null){

		return true;
	}

	if(subTree1!=null && subTree2 !=null) {

			return subTree1.data == subTree2.data && checkSymmetric(subTree1.left,subTree2.right) && checkSymmetric (subTree1.right,subTree2.left);

	}

	return false;

}
