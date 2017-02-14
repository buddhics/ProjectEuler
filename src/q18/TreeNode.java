package q18;

public class TreeNode {
	private int value = 0;
	private int left = 0, right = 0;
	public TreeNode next;
	
	public TreeNode(){
		
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public TreeNode getNext() {
		return next;
	}

	public void setNext(TreeNode next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getMax(){
		return left>right?left:right;
	}
	
	public int getTheDamnNumber(){
		return value+ this.getMax();
	}
}
