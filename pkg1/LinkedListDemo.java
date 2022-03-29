package pkg1;

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.insertSorted(1);
        list.insertSorted(5);
        list.insertSorted(7);
        list.insertSorted(3);
        list.insertSorted(4);
        list.insertSorted(15);
        list.insertSorted(17);
        list.insertSorted(19);
        list.insertSorted(13);

        //list.deleteFromHead();

        System.out.println(list);
        System.out.println("Length: " + list.length());

        //System.out.println("Found: " + list.find(4));
    }
}
