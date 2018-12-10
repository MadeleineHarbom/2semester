package opgave2;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 * @param rootData the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 * @param rootData the data for the root
	 * @param left the left subtree
	 * @param right the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null; // Kig paa denne syntax
	}

	/**
	 * Gets the data at the root of this tree.
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> right = new BinaryTree<E>();
		right.root = root.right;
		return right;
	}

	/**
	 *
	 * @param rootData the new data for the root
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E data = root.data;
		root.data = rootData;
		return data;
	}

	/**
	 * The size of the tree
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	// Private recursive helper method
	private int size(Node n) {
	    if (n != null) {
            return 1 + size(n.right) + size(n.left);
        }
		else {
		    return 0;
        }
	}

   public int height() {
        return height(root);



    }

    private int height(Node n) {
	    //lav mig smartere
        if (n != null) {
            return 1 + Math.max(height(n.right), height(n.left));
        }
        else {
            return 0;
        }

    }

    public String preorder() {
		//root
		//preorder on both children
	    //er dette vbirkelig preorder?
	    return preoder(root);
    }

    private String preoder(Node n) {
	    if (n != null) {
	        return n.data + "\n" + preoder(n.left) + preoder(n.right);
        }
	    else {
	        return "";
        }
    }

    public String postorder() {
	    return postorder(root);
    }

    private String postorder(Node n) {
	    if (n != null) {
	        return  postorder(n.left) + postorder(n.right) +  n.data + "\n";
        }
        else {
	    	return "";
		}
    }

    public String inorder() {
		return inorder(root);

	}

	private String inorder(Node n) {
		if (n != null) {
			return inorder(n.left) + "\n" + n.data  + inorder(n.right);
		}
		else {
		    return "";
        }

	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
