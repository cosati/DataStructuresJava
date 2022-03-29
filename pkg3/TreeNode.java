package pkg3;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public void insert(Integer data) {
        if (this.getData() >= data) {
            if (this.getRightChild() == null) {
                this.setRightChild(new TreeNode(data));
            } else {
                this.getRightChild().insert(data);
            }
        } else {
            if (this.getLeftChild() == null) {
                this.setLeftChild(new TreeNode(data));
            } else {
                this.getLeftChild().insert(data);
            }
        }
    }

    public TreeNode find(Integer data) {
        if (this.getData().equals(data)) {
            return this;
        }
        if (this.getData() < data && this.getLeftChild() != null) {
            return this.getLeftChild().find(data);
        }
        if (this.getRightChild() != null) {
            return this.getRightChild().find(data);
        }
        return null;
    }

    public TreeNode smallest() {
        if (this.getLeftChild() == null) {
            return this;
        } else {
            return this.getLeftChild().smallest();
        }
    }

    public TreeNode largest() {
        if (this.getRightChild() == null) {
            return this;
        } else {
            return this.getRightChild().smallest();
        }
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
