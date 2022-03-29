package pkg3;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data) {
        if (this.root == null) {
            this.root = new TreeNode(data);
        } else {
            this.root.insert(data);
        }
    }

    public TreeNode find(Integer data, TreeNode current) {
        if (root != null) {
            root.find(data);
        }
        return null;
    }

    public TreeNode findSmallest() {
        if (root == null) return null;
        return root.smallest();
    }

    public TreeNode findLargest() {
        if (root == null) return null;
        return root.largest();
    }

    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if (current == null) return; // empty tree

        while (current != null && current.getData() != data) {
            parent = current;

            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if (current == null) return; // not found

        // Leaf
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else { // erases reference to node. let it to the garbage collector
                if (isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
        }
        else if (current.getRightChild() == null) { // node has only left child
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else parent.setRightChild(current.getLeftChild());
        } else if (current.getLeftChild() == null) { // node has only right child
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else parent.setRightChild(current.getRightChild());
        }

        //TODO delete node with both children
    }

}
