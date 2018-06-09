package tree;

public class PreorderToTreeExample {

	public static void main(String[] args) {
		PreorderToTree pt=new PreorderToTree();
		int[] pre=new int[]{10,5,1,7,40,50};
		for(int i=0;i<pre.length;i++){
			pt.insertrec(pre[i]);
		}
		//pt.preorderTraversal();
		pt.inorderTraversal();

	}

}
