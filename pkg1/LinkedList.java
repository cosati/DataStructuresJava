package pkg1;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node node = new Node(data);
        node.setNextNode(this.head);
        this.head = node;
    }

    public void insertSorted(int data) {
        Node node = new Node(data);
        Node current = this.head;

        // First insertion
        if (this.head == null) {
            this.head = node;
            return;
        }

        if (this.head.getData() > data) {
            node.setNextNode(this.head);
            this.head = node;
            return;
        }

        while (current.getNextNode() != null) {
            if (current.getNextNode().getData() > data) {
                node.setNextNode(current.getNextNode());
                current.setNextNode(node);
                return;
            }
            current = current.getNextNode();
        }

        current.setNextNode(node);

        return;
    }

    public int length() {
        int length = 0;
        Node current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public Node find(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }

        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";

        return result;
    }
}
