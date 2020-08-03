





private static class BalanceStatusWithHeight {

	public boolean isBalanced;

	public int height;

	public BalanceStatusWithHeight(Boolean isBalanced,int height){

			this.isBalanced=isBalanced;
			this.height=height;

	}
}

public static boolean isBalanced(BinaryTreeNode<Integer> tree){

	return checkBalanced(tree).isBalanced;
}


private static BalanceStatusWithHeightcheckBalanced(BinaryTreeNode<Integer> tree){


		if(tree==null){

				return new BalanceStatusWithHeight(true,-1);

		}

		BalanceStatusWithHeight leftResult=checkBalanced(tree.left);

		if(!leftResult.isBalanced){

			return leftResult;

		}
		BalanceStatusWithHeight rightResult=checkBalanced(tree.right);

		if(!rightResult.isBalanced){

			return rightResult;
		}

		boolean isBalanced=Math.abs(leftResult.height-rightResult.height)<=1;

		return new BalanceStatusWithHeight(isBalanced,Math.max(leftResult.height,rightResult.height)+1);

}
