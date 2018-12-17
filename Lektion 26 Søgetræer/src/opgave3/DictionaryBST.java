package opgave3;

public class DictionaryBST<K extends Comparable<K>, V> implements Dictionary<K, V> {
	//I AM NOT DONE!
	private Node root;
	private int size;

	public DictionaryBST() {
		root = null;
		this.size = 0;
	}

	@Override
	public V get(K key) {
	    //MINE! CHECK WITH PHONE
	    Node current = root;
	    while(current != null) {
	        int comparison = current.key.compareTo(key);
	        if (comparison == 0) {
	            return current.value;
            }
            else if (comparison > 0) {
	            current = current.left;
            }
            else{
	            current = current.right;
            }
        }
		return null;
	}

	private Node find(K key) {
		Node current = root;
		boolean found = false;
		while (!found && current != null) {
			int d = current.key.compareTo(key);
			if (d == 0) {
				found = true;
			} else if (d > 0) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		
		if (found) {
			return current;
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	@Override
	public V put(K key, V value) {
	    //CHECK ME

        //sets a new root, if tree is empty
	    if (isEmpty()) {
	        Node n = new Node(key, value);
	        this.root = n;
            this.size ++;
	        return value;
        }

	    //checks if the key is already in the tree
        if (find(key) != null) {
            //change the value
            Node current = root;
            while (current != null) {
                int d = current.key.compareTo(key);
                if (d == 0) {
                    current.value = value;
                    return current.value;
                } else if (d > 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

        }
        //Add a new Node
        else {
            Node n = new Node(key, value);
            Node current = root;
            Node previous = null;
            //Will happen atleast once
            while (current != null) {
                int comparison = current.key.compareTo(key);
                previous = current;
                if (comparison > 0) {
                    current = current.right;
                }
                else {
                    current = current.left;
                }

            }
            // adds the new node
            if (previous.key.compareTo(key) > 0) {
                previous.right = n;
                this.size ++;
                return n.value;
            }
            else {
                previous.left = n;
                this.size ++;
                return n.value;
            }

        }
        return null;
	}

	@Override
	public V remove(K key) {
		Node toBeRemoved = root;
		Node parent = null;
		V toReturn = null;
		boolean found = false;
		while (!found && toBeRemoved != null) {
			int d = toBeRemoved.key.compareTo(key);
			if (d == 0) {
				found = true;
				toReturn = toBeRemoved.value;
			} else {
				parent = toBeRemoved;
				if (d > 0) {
					toBeRemoved = toBeRemoved.left;
				} else {
					toBeRemoved = toBeRemoved.right;
				}
			}
		}

		if (found) {
			// toBeRemoved contains obj
			// If one of the children is empty, use the other
			if (toBeRemoved.left == null || toBeRemoved.right == null) {
				Node newChild;
				if (toBeRemoved.left == null) {
					newChild = toBeRemoved.right;
				} else {
					newChild = toBeRemoved.left;
				}

				if (parent == null) // Found in root
				{
					root = newChild;
				} else if (parent.left == toBeRemoved) {
					parent.left = newChild;
				} else {
					parent.right = newChild;
				}

			} else {
				// Neither subtree is empty
				// Find smallest element of the right subtree
				Node smallestParent = toBeRemoved;
				Node smallest = toBeRemoved.right;
				while (smallest.left != null) {
					smallestParent = smallest;
					smallest = smallest.left;
				}

				// smallest contains smallest child in right subtree
				// Move contents, unlink child
				toBeRemoved.key = smallest.key;
				toBeRemoved.value = smallest.value;
				if (smallestParent == toBeRemoved) {
					smallestParent.right = smallest.right;
				} else {
					smallestParent.left = smallest.right;
				}
			}
			this.size --;
		}
		return toReturn;
	}
    public String inorder() {
        return inorder(root);

    }

    private String inorder(Node n) {
        if (n != null) {
            return inorder(n.left) + "\n" + n.value  + inorder(n.right);
        }
        else {
            return "";
        }

    }

	@Override
	public int size() {
		return this.size;
	}

	private class Node {
		private K key;
		private V value;
		private Node left;
		private Node right;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
			this.left = null;
			this.right = null;
		}

		/**
		 * Inserts a new node as a descendant of this node.
		 *
		 * @param newNode
		 *            the node to insert
		 */
		private void addNode(Node newNode) {
			// TODO
		}
	}
}
