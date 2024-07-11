package linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(25);
        list.add(17);
        list.add(4);
        list.add(20);
        list.add(15);
        list.printlist();
        list.reverse();

        list.printlist();
    }
}
